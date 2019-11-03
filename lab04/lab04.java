public class lab04 {
    public static void main(String args[]){
        if(args.length != 4){
            System.out.println("Error: Not enough arguments (size_x>=3, size_y>=3, steps>=0, preset>=0");
            System.exit(1);
        }
        int size_x = Integer.parseInt(args[0]); // board size x
        int size_y = Integer.parseInt(args[1]); // board size y
        int steps = Integer.parseInt(args[2]); // simulation steps
        int preset = Integer.parseInt(args[3]); // starting configuration

        if(size_x < 5 || size_y < 3){
            System.out.println("Error: Board too small (size >= 3)");
            System.exit(1);
        }

        Board b = new Board(size_x, size_y, preset);
        b.run(steps);
    }
}