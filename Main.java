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
        int gridSize = settings.getGridSize();
        Board board = Board.createBoard(gridSize);
        System.out.println(Arrays.deepToString(board.getAxes()));
        InputValidation.verifyCoord(board.getAxes(), "Please enter a coordinate: ");
    }
}

/*InputValidation testResponse = new InputValidation();
int testAns = testResponse.verifyPosInt("What grid size would you like?");*/