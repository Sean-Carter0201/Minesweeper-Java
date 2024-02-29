import java.util.ArrayList;

public class Board {
    private ArrayList<Cell> grid;
    private ArrayList<Character>[] axes = new ArrayList[2];
    public ArrayList<Cell> getGrid() {
        return grid;
    }
    public ArrayList<Character>[] getAxes() {
        return axes;
    }
    public static Board createBoard(int gridSize) {
        Board board = new Board();
        ArrayList<Cell> newGrid = board.getGrid();
        ArrayList<Character>[] newAxes = board.getAxes();
        StringBuilder xAxis = new StringBuilder("   ");
        for (int i = 0; i < gridSize; i++) {
            newAxes[1].add((char) ((gridSize - i) + '0'));
            System.out.println(newAxes[1]);
            StringBuilder line = new StringBuilder(newAxes[1].get(i) + "  ");
            for (int j = 0; j < gridSize; j++) {
                if (i == 0) {
                    newAxes[0].set(j, Main.numToChar(j + 1));
                }
                Cell cell = new Cell();
                newGrid.add(cell);
                if (cell.getShown()) {
                    line.append(newGrid.get(i).getType());
                } else {
                    line.append("X ");
                }
                cell.setCoord(newAxes[0].get(j), newAxes[1].get(i));
            }
            xAxis.append(newAxes[0].get(i)).append(" ");
            System.out.println(line);
        }
        System.out.println(xAxis);
        System.out.println();
        return board;
    }
}
