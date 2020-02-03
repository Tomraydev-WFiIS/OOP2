import java.io.*;

public class Test {

    public static void main(String args[]){
        try{
            BufferedReader f = new BufferedReader(
            new FileReader("plik.txt")
            );
            String s;
            int i = 1;
            while( (s = f.readLine()) != null )
            System.out.println( (i++) + " : " + s);
        } catch(Throwable e){
            System.out.println("Błąd odczytu pliku!");
        }
    }
}