public class NQueens {

<<<<<<< HEAD
    public static boolean isSafe(char board[][], int row, int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //diagonal left up
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;

    }//isSafe

=======
>>>>>>> 2052944940a649edb5e9f3eb15497611ca0ede4b
    public static void nQueen(char board[][], int row){
        //base case
        if(row == board.length){
            printBoard(board);
            return;
        }

        //column loop
        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            nQueen(board,row+1);   //function call
            board[row][j]='X';      //backtracking step
        }
    }//nQueens

    public static void printBoard(char board[][]){
        System.out.println("---------Chess Board---------");
        for(int i=0; i<board.length;i++){
            for(int j=0; j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=2;
        char board[][]= new char[n][n];
        //initialize
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nQueen(board,0);
    }//main
    
}//class