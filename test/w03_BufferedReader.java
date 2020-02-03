import java.io.*;

public class Test {

    public static void main(String args[]){
        BufferedReader stdin = new BufferedReader(
            new InputStreamReader(System.in)
        );
        System.out.println("Wpisz cos");
        try {
            String s = stdin.readLine();
            System.out.println("Wpisałeś: " + s);
        } catch( Throwable e ){ System.out.println("Błąd");}
    }
}