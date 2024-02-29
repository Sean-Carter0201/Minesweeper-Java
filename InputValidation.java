import java.util.Scanner;

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

    public static boolean verifyYesNo(String input) {
        System.out.println(input);
        Scanner reader = new Scanner(System.in);
        String answer = reader.next();
        while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
            System.out.println("Please answer yes or no.");
            answer = reader.next();
        }
        return answer.equalsIgnoreCase("yes");
    }
}
