import java.io.File; 
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;


public class lab7{
    public static void main(String[] argv) throws Exception{
        File file = new File("input1.txt"); 
        Scanner sc = new Scanner(file); 
    
        
        int n = sc.nextInt(); // number of elements
        int m = sc.nextInt(); // number of tests

        // load test data
        List<List<Integer>> tests = new ArrayList<List<Integer>>();
        for(int t = 0; t < m; t++){
            List<Integer> group1 = new ArrayList<Integer>();
            List<Integer> group2 = new ArrayList<Integer>();
            for(int g = 0; g < n/2; g++){
                group1.add(sc.nextInt());
            }
            tests.add(group1);
            for(int g = n/2; g < n; g++){
                group2.add(sc.nextInt());
            }
            tests.add(group2);
        }

        // Run tests
        List<Set<Integer>> items = new ArrayList<Set<Integer>>();
        for(int i = 0; i < n+1; i++){
            items.add(new HashSet<Integer>());
        }
        for(int t = 0; t < m*2; t+=2){
            List<Integer> g1 = tests.get(t);
            List<Integer> g2 = tests.get(t+1);

            // first group
            for(int i = 0; i < n/2; i++){
                for(int j = 0; j < n/2; j++){
                    Set<Integer> s = items.get(g1.get(i));
                    s.add(g2.get(j));
                    System.out.println("g1 = " + g1.get(i) + "\tg2 = " + g2.get(j));
                    System.out.println("set for " + g1.get(i) + " " + s.toString() + "\n");
                }
            }

            // second group
            for(int i = 0; i < n/2; i++){
                for(int j = 0; j < n/2; j++){
                    Set<Integer> s = items.get(g2.get(i));
                    s.add(g1.get(j));
                    System.out.println("g1 = " + g1.get(i) + "\tg2 = " + g2.get(j));
                    System.out.println("set for " + g2.get(i) + " " + s.toString() + "\n");
                }
            }
        }

        // Check test results
        for(int i = 1; i < n+1; i++){
            if(items.get(i).size() != n-1){
                System.out.println("NIE");
                System.exit(1);
            }
        }
        System.out.println(items.toString());
        System.out.println("TAK");
    }
}