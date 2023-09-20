public class NQueens {

    public static void nQueens(char board[][], int row){
        //base case
        if(row == board.length){
            printBoard(board);
            return;
        }

        //column loop
        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            nQueens(board,row+1);   //function call
            board[row][j]='X';      //backtracking step
        }
    }//nQueens

    public static void printBoard(char board[][]){
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
        nQueens(board,0);
    }//main
    
}//class