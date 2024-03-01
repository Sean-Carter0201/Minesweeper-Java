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
    public static int[] coordToIndex (String coord, int size) {
        return new int[]{size - (coord.charAt(1) - '0'), Main.charToNum(coord.charAt(0)) - 1};
    }
    public static void main(String[] args) {
        Settings settings = new Settings();
        int gridSize = settings.getGridSize();
        Cell[][] grid = new Cell[gridSize][gridSize];
        char[][] axes = new char[2][gridSize];
        Board board = new Board(grid, axes, settings);
        boolean safe = true;
        while (safe) {
            board.createScreen(grid, axes);
            safe = Turn.takeTurn(board);
        }
    }
}

/*InputValidation testResponse = new InputValidation();
int testAns = testResponse.verifyPosInt("What grid size would you like?");*/