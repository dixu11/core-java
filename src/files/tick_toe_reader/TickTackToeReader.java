package files.tick_toe_reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TickTackToeReader {
    public static void main(String[] args) {
        int[][] board = readGameBoardFile("ticktacktoe");
        whoWonAnnouncer(board);
    }

    // metoda ma odczytać plik i przełożyć go na tablicę 2wymarową
    public static int[][] readGameBoardFile(String fileName) {
      Scanner scanner;
        int[][] gameBoard = new int[3][3];
        // czytanie z pliku może spowodować błąd przy braku pliku
        try {
           scanner = new Scanner(new File(fileName + ".txt"));
            int lineCounter = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                //rozdzielam każdą linię na 3 elementy rozróżniając je po wstawionym przecinku
                String[] threeRows = line.split(",");
                for (int i = 0; i < threeRows.length; i++) {
                    // przetwarzam Stringa na inta i zapisuję do tablicy
                    gameBoard[lineCounter][i] = Integer.parseInt(threeRows[i]);
                }
                lineCounter++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found - " + fileName);
        }
        return gameBoard;
    }
// ta metoda odpowiada za ogłoszenie wyniku
    public static void whoWonAnnouncer(int[][] board) {
        if (isGameOver(board)) {
            int verdict = whoWonAlgoritm(board);
            switch (verdict) {
                case 1:
                    System.out.println("X won!");
                    break;
                case -1:
                    System.out.println("O won!");
                    break;
                default:
                    System.out.println("No one won!");
            }
        } else {
            System.out.println("Game is NOT over!");
            System.out.println("Everything could happen!");
        }

    }

    // ta metoda przeszukuje planszę czy występuje gdzieś 0 - jeśli tak - gra nie jest skończona
    public static boolean isGameOver(int[][] board) {
        for (int[] row : board) {
            for (int value : row) {
                if (value == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    //ta metoda sprawdza czy nastąpił któryś z warunków zwycięstwa
    public static int whoWonAlgoritm(int[][] board) {
        int winner;
        // sprawdzam czy są 3 identyczne w poziomie a potem w pionie
        for (int i = 0; i < board.length; i++) {
            // aktualnie sprawdzaną wartość wstawiam do winner
            winner = board[i][0];
            // sprawdzam czy winner jest identycznym polem z pozostałymi w tej samej linii
            if (winner == board[i][1] && winner == board[i][2]) {
                System.out.println("horizontal!");
                // jeśli tak, znalazłem zwycięzcę, koniec szukania
                    return winner;
            }
            winner = board[0][i];
            if (winner == board[1][i] && winner == board[2][i]) {
                System.out.println("vertical!");
                return winner;
            }
        }
        // sprawdzam skośne wartości
        winner = board[1][1];
        if ((winner == board[0][0] && winner == board[2][2]) || (winner == board[0][2] && winner == board[2][0])) {
            System.out.println("diagonal!");
            return winner;
        }
        winner = 0;
        System.out.println("Winner: " + winner);
        return winner;
    }
}
