import java.util.Scanner;

public class TicTacToe {

    static char[] board = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char player = 'X';
        int moves = 0;

        while (true) {

            printBoard();
            System.out.print("Player " + player + ", enter slot (1-9): ");

            try {
                int slot = sc.nextInt();

                if (slot < 1 || slot > 9) {
                    throw new Exception("Invalid slot! Choose 1-9.");
                }

                if (board[slot - 1] == 'X' || board[slot - 1] == 'O') {
                    throw new Exception("Slot already taken!");
                }

                board[slot - 1] = player;
                moves++;

                if (checkWin()) {
                    printBoard();
                    System.out.println("Player " + player + " Wins!");
                    break;
                }

                if (moves == 9) {
                    printBoard();
                    System.out.println("Game Draw!");
                    break;
                }

                if (player == 'X')
                    player = 'O';
                else
                    player = 'X';

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }

        sc.close();
    }

    static void printBoard() {
        System.out.println();
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("--+---+--");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("--+---+--");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    static boolean checkWin() {
        return (board[0] == board[1] && board[1] == board[2]) ||
                (board[3] == board[4] && board[4] == board[5]) ||
                (board[6] == board[7] && board[7] == board[8]) ||
                (board[0] == board[3] && board[3] == board[6]) ||
                (board[1] == board[4] && board[4] == board[7]) ||
                (board[2] == board[5] && board[5] == board[8]) ||
                (board[0] == board[4] && board[4] == board[8]) ||
                (board[2] == board[4] && board[4] == board[6]);
    }
}