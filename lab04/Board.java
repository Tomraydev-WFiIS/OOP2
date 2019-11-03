public class Board {
    int size_x;
    int size_y;
    char[][] board;
    char[][] board2;
    int[][] debugBoard;

    Board(int x,int y,int preset_id){
        size_x = x;
        size_y = y;
        board = new char[size_y][size_x];
        board2 = new char[size_y][size_x];
        debugBoard = new int[size_y][size_x];
        clear();
        preset(preset_id);
    }

    public void clear(){
        for(int y = 0; y < size_y; y++){
            for(int x = 0; x < size_x; x++){
                board[y][x] = '.';
            }
        }
    }

    public void print(){
        for(int y = 0; y < size_y; y++){
            for(int x = 0; x < size_x; x++){
                System.out.print(board[y][x]);
            }
            System.out.println();
        }
    }

    public void printDebug(){
        for(int y = 0; y < size_y; y++){
            System.out.print("\t");
            for(int x = 0; x < size_x; x++){
                System.out.print(debugBoard[y][x]);
            }
            System.out.println();
        }
    }

    public void run(int steps){
        System.out.println("------ 0 --------");
        print();
        for(int s = 1; s < steps; s++){
            for(int y = 0; y < size_y; y++){
                for(int x = 0; x < size_x; x++){

                    int aliveNeighbours = 0;
                    for(int yy = y-1; yy <= y+1;yy++){
                        for(int xx = x-1; xx <= x+1;xx++){
                            if(yy==y && xx==x){continue;}
                            aliveNeighbours += getValue(xx, yy);
                        }
                    }
                    debugBoard[y][x] = aliveNeighbours;

                    boolean alive = (board[y][x] == 'X');
                    if (alive && (aliveNeighbours == 2 || aliveNeighbours == 3)){
                        board2[y][x] = 'X';
                    } else if (!alive && aliveNeighbours == 3){
                        board2[y][x] = 'X';
                    } else {
                        board2[y][x] = '.';
                    }
                }
            }
            copyBoard();
            System.out.println("\n------ " + s + " --------");
            // printDebug();
            print();
        }
    }

    public int getValue(int x, int y){
        if(x < 0 || x >= size_x || y < 0 || y >= size_y){
            return 0;
        }
        if(board[y][x] == 'X'){
            return 1;
        }else {
            return 0;
        }
    }

    public void copyBoard(){
        for(int y = 0; y < size_y; y++){
            for(int x = 0; x < size_x; x++){
                board[y][x] = board2[y][x];
            }
        }
    }

    public void preset(int id){
        int xc = size_x/2; // x center
        int yc = size_y/2; // y center
        switch(id){
            case 0:
                for(int y = 0; y < size_y; y++){
                    for(int x = 0; x < size_x; x++){
                        if (Math.random() < 0.5){
                            board[y][x] = '.';
                        } else {
                            board[y][x] = 'X';
                        }
                    }
                }

            case 1:
                board[yc-1][xc-1] = 'X';
                board[yc-1][xc] = 'X';
                board[yc-1][xc+1] = '.';

                board[yc][xc-1] = 'X';
                board[yc][xc] = '.';
                board[yc][xc+1] = 'X';

                board[yc+1][xc-1] = '.';
                board[yc+1][xc] = 'X';
                board[yc+1][xc+1] = '.';

            case 2:
                board[yc-1][xc] = 'X';
                board[yc][xc] = 'X';
                board[yc+1][xc] = 'X';

            case 3:
                board[yc-1][xc-1] = 'X';
                board[yc-1][xc] = 'X';
                board[yc-1][xc+1] = 'X';

                board[yc][xc-1] = 'X';
                board[yc][xc] = '.';
                board[yc][xc+1] = '.';

                board[yc+1][xc-1] = '.';
                board[yc+1][xc] = 'X';
                board[yc+1][xc+1] = '.';
        }
    }
}