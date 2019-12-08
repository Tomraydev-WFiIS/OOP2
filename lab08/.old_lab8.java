import java.io.*; 

public class lab8 {
    public static void main(String[] args) {

        try {
            if (args.length != 2 ) throw new Exception(); 
        } catch (Exception e) {
            System.out.println("Podaj w linii polecen dwie nazwy plikow np. 'java lab8 in.txt out.txt'");
            return;
        }

        boolean didErrorOccured = false;
        double avg = 0;
        
        try { 
            BufferedReader f = new BufferedReader(new FileReader(args[0]) );
            String line;
            int countLines = 0; 
            while( (line = f.readLine()) != null ) {
                countLines++;
                avg += Double.parseDouble(line);
            }
            
            if (countLines == 0) throw new EmptyFileException(args[0]);

            avg /= countLines;

            if (avg == Double.POSITIVE_INFINITY) throw new ArithmeticException();

        } catch( FileNotFoundException e) {
            System.out.println( "Nie znaleziono pliku " + args[0] + "." );
            didErrorOccured = true;
        } catch ( IOException e ) {
            System.out.println( "Wystapil blad podczas wczytywania pliku. Prosze zachowac spokoj i udac sie do najblizszego wyjscia ewakuacyjnego." );
            didErrorOccured = true;
        } catch( NumberFormatException e ) { 
            System.out.println( "Dane w pliku " + args[0] + " nie sa liczbami zmiennoprzecinkowymi." );
            didErrorOccured = true;
        } catch( ArithmeticException e ) { 
            System.out.println( "Dane sa zbyt duze." );
            didErrorOccured = true;
        } catch( EmptyFileException e ) { 
            System.out.println( e.toString() );
            didErrorOccured = true;
        } catch( Exception e ) { 
            System.out.println( "Wystapil nieznany blad i cos sie popsulo :(" );
            didErrorOccured = true;
        }

        if (didErrorOccured) return; 

        FileWriter writer = null;
        try {
            writer = new FileWriter(new File(args[1]));
            writer.write(String.valueOf(avg));
        } catch (IOException e) {
            System.out.println( "Wystapil blad podczas wpisywania danych do pliku wyjsciowego " + args[1] + "." );            
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                System.out.println( "Wystapil blad podczas zamykania pliku wyjsciowego " + args[1] + "." );
            }
        }
    }
}