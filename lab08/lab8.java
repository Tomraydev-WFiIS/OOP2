import java.io.*;


public class lab8 {
    public static void main(String[] args) throws Exception{
        // Validate arguments
        try{
            if (args.length != 2){
                throw new IllegalArgumentException();
            }
        }
        catch (Exception e){
            System.out.println("Podaj 2 argumenty przy wywołaniu programu eg.");
            System.out.println("java lab8 in.txt out.txt");
            return;
        }


        try {
            // Read from file
            Double avg = 0.0;
            BufferedReader f = new BufferedReader(new FileReader(args[0]));
            String line;
            int n_lines = 0; 
            while((line = f.readLine()) != null){
                n_lines++;
                avg += Double.parseDouble(line);
            }
            if (n_lines == 0){
                throw new FileNotFoundException(args[0]);
            }

            // Calculate the average
            avg /= n_lines;
            if (avg == Double.POSITIVE_INFINITY){
                throw new ArithmeticException("Średnia zbyt duża do policzenia.");
            }
            if (avg == Double.NEGATIVE_INFINITY){
                throw new ArithmeticException("Średnia zbyt mała do policzenia.");
            }
            System.out.println("Średnia = " + avg);

            // Save to file
            FileWriter outFile = null;
            outFile = new FileWriter(new File(args[1]));
            outFile.write(String.valueOf(avg));
            outFile.close();
        }
        catch (EOFException e){
            System.out.println("Niespodziewany koniec pliku.");
            System.out.println(e.toString());
            System.exit(1);
        }
        catch (IOException e){
            System.out.println("Błąd przy wczytywaniu pliku.");
            System.out.println(e.toString());
            System.exit(1);
        }
        catch (ArithmeticException e){
            System.out.println("Błąd arytmetyczny.");
            System.out.println(e.toString());
            System.exit(1);
        }
        catch (NumberFormatException e){
            System.out.println("Nieprawidłowy format pliku wejściowego.");
            System.out.println(e.toString());
            System.exit(1);
        }
        catch (Exception e){
            System.out.println("Nieznany wyjątek. Coś poszło nie tak ;(");
            System.out.println(e.toString());
            System.exit(1);
        }
    }
}