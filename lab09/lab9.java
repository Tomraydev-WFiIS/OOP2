import java.io.*;
import java.util.Scanner;
import java.util.*;

public class lab9 {
    public static void main(String[] args) throws Exception {
        FileReader f = new FileReader(args[0]);
        Scanner sc = new Scanner(f);
        sc.useDelimiter(",|\\n| ");
        int w = sc.nextInt();
        // System.out.println(w);
        int h = sc.nextInt();
        // System.out.println(h);
        String fileName = sc.next();
        // System.out.println(fileName);
        int nPoints = sc.nextInt();
        // System.out.println(nPoints);
        int[][] points = new int[nPoints][2];
        int[] dist = new int[nPoints];
        for(int i = 0; i < nPoints; i++){
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
            // System.out.println(points[i][0]);
            // System.out.println(points[i][1]);
        }

        int[][] image = new int[w][h];
        int dist0;
        int dist1;

        for(int x = 0; x < w; x++){
            for(int y = 0; y < h; y++){
                image[x][y] = 1;
                for(int i = 0; i < nPoints; i++){
                    dist[i] = (x - points[i][0])*(x - points[i][0]) + (y - points[i][1])*(y - points[i][1]);
                }
                Arrays.sort(dist);
                dist0 = dist[0];
                dist1 = dist[1];

                if(dist0 == dist1){
                    image[x][y] = 0;
                }
            }
        }
        
        // zapisz punkty
        for(int i = 0; i < nPoints; i++){
            image[points[i][0]][points[i][1]] = 0;
        }

        // zapisz obrazek
        saveToPPM(fileName, image, w, h);
    }

    public static void saveToPPM(String fileName, int[][] image, int w, int h) throws Exception{
        PrintWriter writer = new PrintWriter(fileName, "UTF-8");
        writer.println("P3");
        writer.println("#Tomasz Rajchel");
        writer.println(w + " " + h);
        writer.println("255");
        for(int x = 0; x < w; x++){
            for(int y = h-1; y >= 0; y--){
                int value = image[x][y] * 255;
                writer.print(value + " " + value + " " + value + " ");
            }
        }
        writer.close();
    }
}