import java.io.*;

public class Test {

    public static void main(String args[]){
        Console c = System.console();
        String s = c.readLine("Wpisz coś: ");
        c.printf("Wpisaleś: %s\n", s);
    }
}