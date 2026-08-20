import java.util.Scanner;

public class tictac{
    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        char currentPlayer = 'X';
        boolean gameEnded = false;

        while (!gameEnded) {
            printBoard();
            playerMove(currentPlayer);

            if (checkWinner(currentPlayer)) {
                printBoard();
                System.out.println("Congratulations! " + currentPlayer + " wins!");
                gameEnded = true;
            } else if (isDraw()) {
                printBoard();
                System.out.println("Game is Drawn!");
                gameEnded = true;
            } else {
                // Toggle player
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    static void playerMove(char player) {
        Scanner sc = new Scanner(System.in);
        int row, col;

        while (true) {
            System.out.println("Player " + player + ", enter row and column (0-2): ");
            row = sc.nextInt();
            col = sc.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = player;
                break;
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
    }

    static boolean checkWinner(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;

        return false;
    }

    static boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }
}
