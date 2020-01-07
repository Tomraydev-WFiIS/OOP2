import java.io.*;
import java.util.*;

public class lab10 {
    public static void main(String[] args) throws Exception {
        String filename = "dict.txt";
        if(args.length < 1){
            System.out.println("Not enought arguments");
            System.exit(1);
        }

        switch(args[0]){
            case "add":;
                // add to dict
                FileWriter writer = new FileWriter(filename, true);
                writer.append(args[1]);
                writer.append(",");
                writer.append(args[2]);
                writer.append("\n");
                writer.close();
                return;

            case "del":
                // remove from dict
                FileReader reader = new FileReader(filename);
                Scanner sc = new Scanner(reader);
                sc.useDelimiter(",|\\n");

                String newDict = "";
                while(sc.hasNext()){
                    String c = sc.next();
                    String n = sc.next();
                    if(c.equals(args[1]) || n.equals(args[1])) {
                        continue;
                    }else {
                        newDict += c + "," + n + "\n";
                    }
                }
                reader.close();
                FileWriter w = new FileWriter(filename);
                w.write(newDict);
                w.close();
                return;
        }

        //translate
        System.out.println(translate(args[0], filename));
    }

    static String translate(String s, String dict) throws Exception{
        String output = "";
        FileReader reader = new FileReader(dict);
        Scanner sc = new Scanner(reader);
        sc.useDelimiter(",|\\n");

        int i = 0; // parity
        while(sc.hasNext()){
            String c = sc.next();
            if(s.equals(c)){
                if(i%2 == 0){
                    output = sc.next();
                    break;
                }else{
                    output = c;
                    break;
                }
            }
            i++;
        }

        sc.close();
        reader.close();
        return output;
    }
}