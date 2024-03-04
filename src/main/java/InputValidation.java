import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
public class InputValidation {
    public static double verifyDouble(String input) {
        double answer;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println(input);
            while (!reader.hasNextDouble()) {
                System.out.println("That's not a valid dimension.");
                System.out.println(input);
                reader.next();
            }
            answer = reader.nextDouble();
        } while (answer <= 0);
        return answer;
    }

    public static int verifyPosInt(String input) {
        int answer;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println(input);
            while (!reader.hasNextInt()) {
                System.out.println("Positive whole numbers please.");
                System.out.println(input);
                reader.next();
            }
            answer = reader.nextInt();
        } while (answer <= 0);
        return answer;
    }

    public static boolean verifyTwoChoice(String input, String option1, String option2) {
        System.out.println(input);
        Scanner reader = new Scanner(System.in);
        String answer = reader.nextLine();
        while (!answer.equalsIgnoreCase(option1) && !answer.equalsIgnoreCase(option2)) {
            System.out.println("Please answer " + option1 + " or " + option2 + ".");
            answer = reader.next();
        }
        return answer.equalsIgnoreCase(option1);
    }
    public static String verifyCoord(Board board, String input) {
        ArrayList<String>[] axes = board.getAxes();
        Scanner reader = new Scanner(System.in);
        String answer;
        do {
            System.out.println(input);
            answer = reader.next();
            answer = answer.toUpperCase();
            while (!(axes[0].contains("" + answer.charAt(0)) &&
                    axes[1].contains(answer.substring(1)))) {
                System.out.println("Sorry, that is not a valid coordinate.");
                answer = reader.next();
                answer = answer.toUpperCase();
            }
        }
        while (isShown(board, answer) == 1);
        return answer;
    }
    public static int isShown (Board board, String coord) {
        Cell[][] grid = board.getGrid();
        int size = grid.length;
        int[] index = Main.coordToIndex(coord, size);
        return grid[index[0]][index[1]].getStatus();
    }
}
