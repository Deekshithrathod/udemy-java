import java.util.Scanner;

/**
 * Main
 */
public class TicTacToe {

  public static void main(String[] args) {
    // take the input from user
    Scanner scanner = new Scanner(System.in);
    char board[][] = new char[3][3];
    int totalFilledBoxes = 0;
    char player = 'X';

    // fill matrix with space
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        board[i][j] = ' ';
      }
    }

    boolean shouldEndGame = false;
    while (!shouldEndGame) {
      System.out.println("It's the turn of: " + player);

      System.out.print("Enter the position to mark: ");
      int x = scanner.nextInt();
      int y = scanner.nextInt();

      if (isValidPosition(x, y, board)) {
        // print the modified matrix
        board[x][y] = player;
        ++totalFilledBoxes;
        printMatrix(board);

        // check if there's a winner & repeat
        shouldEndGame = foundWinner(board);
        if (shouldEndGame) {
          System.out.println(player + " is winner!");
        }

        if (totalFilledBoxes == 9 && !shouldEndGame) {
          System.out.println("It's a draw!");
          shouldEndGame = true;
        }
        // switch players
        player = player == 'X' ? 'O' : 'X';
      } else {
        System.out.println("\nInvalid position! (0 <= p < 3) and should not be already filled \n");
      }
    }

    scanner.close();
  }

  public static boolean isValidPosition(int i, int j, char board[][]) {
    return (i < 3) && (j < 3) && board[i][j] == ' ';
  }

  public static void printMatrix(char board[][]) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        System.out.print(board[i][j] + " | ");
      }
      System.out.println();
    }
    System.out.println();
  }

  public static boolean foundWinner(char board[][]) {
    // check rows
    for (int i = 0; i < board[0].length; i++) {
      if ((board[i][0] == board[i][1]) && (board[i][0] == board[i][2]) && board[i][0] != ' ') {
        return true;
      }
    }

    // check cols
    for (int i = 0; i < board.length; i++) {
      if ((board[0][i] == board[1][i]) && (board[0][i] == board[2][i]) && board[0][i] != ' ') {
        return true;
      }
    }

    // check diagnals
    if ((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]) && board[0][0] != ' ') {
      return true;
    }
    if ((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]) && board[0][2] != ' ') {
      return true;
    }
    return false;
  }
}