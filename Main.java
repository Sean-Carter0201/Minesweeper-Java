import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int charToNum(char letter) {
        int number = Character.getNumericValue(letter);
        return number - 9;
    }
    public static char numToChar(int number) {
        return (char) (number + 64);
    }
    public static void main(String[] args) {
        Settings settings = new Settings();
        Board board = new Board();
        int gridSize = settings.getGridSize();
        char[][] grid = board.createGrid(gridSize);
        char[][] axes = board.createAxes(gridSize);
        for (int i = 0; i < gridSize; i++) {
            axes[0][i] = (char) ((gridSize - i) + '0');
            axes[1][i] = numToChar(i + 1);
            for (int j = 0; j < gridSize; j++) {
                Cell cell = new Cell();
                if (cell.getShown()) {
                    grid[i][j] = (char) (cell.getType() + '0');
                } else {
                    grid[i][j] = 'X';
                }
                }
            System.out.println(axes[0][i] + " " + Arrays.toString(grid[i]));
        }
        System.out.println("  " + Arrays.toString(axes[1]));

    }
}

/*InputValidation testResponse = new InputValidation();
int testAns = testResponse.verifyPosInt("What grid size would you like?");*/