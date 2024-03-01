import java.util.ArrayList;

public class Turn {
    private int[] coord;
    private boolean flagCheck;
    private boolean goodTurn = true;
    public void setCoord(int[] answer) {
        coord = answer;
    }
    public int[] getCoord() {
        return coord;
    }
    public void setFlagCheck(boolean action) {
        flagCheck = action;
    }
    public boolean getFlagCheck() {
        return flagCheck;
    }
    public void setGoodTurn(boolean action) {
        goodTurn = action;
    }
    public boolean getGoodTurn() {
        return goodTurn;
    }
    public boolean chooseAction() {
        return InputValidation.verifyTwoChoice("Do you wish to flag a cell, or explore a new one?",
                "Flag", "Explore");

    }
    public static boolean takeTurn(Board board) {
        Turn turn = new Turn();
        turn.setFlagCheck(turn.chooseAction());
        Cell[][] grid = board.getGrid();
        int size = grid.length;
        String coord = InputValidation.verifyCoord(board, "Please enter an unexplored coordinate: ");
        int[] index = Main.coordToIndex(coord, size);
        turn.setCoord(index);
        if (turn.getFlagCheck()) {
            grid[index[0]][index[1]].setStatus(2);
        } else {
            if (grid[index[0]][index[1]].getStatus() == 2) {
                if (InputValidation.verifyTwoChoice("Are you sure? You flagged this coordinate.",
                        "Yes", "No")) {
                    int type = grid[index[0]][index[1]].getType();
                    if (type == -1) {
                        System.out.println("You lose!");
                        turn.setGoodTurn(false);
                    } else {
                        recursiveCellStatus(grid, index);
                        }
                }
            } else {
                int type = grid[index[0]][index[1]].getType();
                if (type == -1) {
                    System.out.println("You lose!");
                    turn.setGoodTurn(false);
                } else {
                    recursiveCellStatus(grid, index);
                }
            }
        }
        return turn.getGoodTurn();
    }
    public static void recursiveCellStatus (Cell[][] grid, int[] index) {
        if (grid[index[0]][index[1]].getType() != -1 && grid[index[0]][index[1]].getStatus() != 1) {
            grid[index[0]][index[1]].setStatus(1);
            if (grid[index[0]][index[1]].getType() == 0) {
                ArrayList<int[]> cellLoop = grid[index[0]][index[1]].surroundingCellTypes(grid, index[0], index[1]);
                for (int[] x : cellLoop) {
                    recursiveCellStatus(grid, x);
                }
            }
        }
    }
}
