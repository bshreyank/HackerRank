public class NQueens {

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;

    }// isSafe

    public static void nQueen(char board[][], int row) {
        // base case
        if (row == board.length) {
            //part 1 - print the full board of all solutions
            //printBoard(board);

            //part 2 - just print total number of ways in which we can solve n queens problem.
            count ++; 
            return;
        }

        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueen(board, row + 1); // function call
                board[row][j] = 'x'; // backtracking step

            }
        }
    }// nQueens

    public static void printBoard(char board[][]) {
        System.out.println("---------Chess Board---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    //part 2 - N-Queens - count ways
    static int count = 0;



    public static void main(String[] args) {
        int n = 4;  //size of the board
        char board[][] = new char[n][n];
        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueen(board, 0);
        System.out.println("Total ways to solve n-Queens problem = "+ count);
    }// main

}// class