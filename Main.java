import java.util.ArrayList;

public class Main {
    public static int charToNum(char letter) {
        int number = Character.getNumericValue(letter);
        return number - 9;
    }
    public static String numToChar(int number) {
        return ((char) (number + 64) + "");
    }
    public static int[] coordToIndex (String coord, int size) {
        return new int[]{size - (coord.charAt(1) - '0'), Main.charToNum(coord.charAt(0)) - 1};
    }
    public static void main(String[] args) {
        Settings settings = new Settings();
        int gridSize = settings.getGridSize();
        Cell[][] grid = new Cell[gridSize][gridSize];
        ArrayList[] axes = new ArrayList[2];
        for (int i = 0; i < 2; i++) {
            axes[i] = new ArrayList<Integer>();
        }
        Board board = new Board(grid, axes, settings);
        int bombNum = settings.getBomNum();
        boolean safe = true;
        while (safe) {
            int cellsLeft = board.createScreen(grid, axes, bombNum);
            safe = Turn.takeTurn(board, bombNum);
            if (board.getFlagList().size() == bombNum) {
                int wincount = 0;
                for (int i = 0; i < board.getFlagList().size(); i++) {
                    int[] index =  board.getFlagList().get(i);
                    if (grid[index[0]][index[1]].getType() == -1) {
                        wincount ++;
                    }
                }
                if (wincount == bombNum) {
                    System.out.println("All bombs flagged. Congratulations, you win!");
                    safe = false;
                }
            } else if (cellsLeft == bombNum) {
                System.out.println("Only bombs remaining. Congratulations, you win!");
                safe = false;
            }
        }
    }
}

/*InputValidation testResponse = new InputValidation();
int testAns = testResponse.verifyPosInt("What grid size would you like?");*/