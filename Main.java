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
        board.createBoard(board, gridSize);
    }
}

/*InputValidation testResponse = new InputValidation();
int testAns = testResponse.verifyPosInt("What grid size would you like?");*/