import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;

        Scanner sc = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.println();

            System.out.println("Player " + player + ", enter your move (row and column):");

            int row = sc.nextInt();
            int col = sc.nextInt();

            System.out.println();

            if (isValidMove(board, row, col)) {
                board[row][col] = player;
                if (hasWon(board, player)) {
                    gameOver = true;
                    printBoard(board);
                    System.out.println("Player " + player + " has WON!!!");
                } else if (isBoardFull(board)) {
                    gameOver = true;
                    printBoard(board);
                    System.out.println("The game is a TIE!!!");
                } else {
                    /* if(player == 'X') {
                     * player = 'O';
                    }  else {
                      player = 'X';
                    }*/
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move, try again!!");
            }
        }
        sc.close();
    }

    static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    static boolean hasWon(char[][] board, char player) {
        // Check rows
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    static boolean isBoardFull(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col]);
                if (col < board[row].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (row < board.length - 1) {
                System.out.println("---------");
            }
        }
    }
}
