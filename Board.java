import java.util.Arrays;

public class Board {
    public Cell[][] createGrid(int size) {
        return new Cell[size][size];
    }
    public char[][] createAxes(int size) {
        return new char[2][size];
    }
    public void createBoard(Board board, int gridSize) {
        Cell[][] grid = board.createGrid(gridSize);
        char[][] axes = board.createAxes(gridSize);
        StringBuilder xAxis = new StringBuilder("   ");
        for (int i = 0; i < gridSize; i++) {
            axes[1][i] = (char) ((gridSize - i) + '0');
            StringBuilder line = new StringBuilder(axes[1][i] + "  ");
            for (int j = 0; j < gridSize; j++) {
                if (i == 0) {
                    axes[0][j] = Main.numToChar(j + 1);
                }
                Cell cell = new Cell();
                grid[i][j] = cell;
                if (cell.getShown()) {
                    line.append(grid[i][j].getType());
                } else {
                    line.append("X ");
                }
                cell.setCoord(axes[0][j], axes[1][i]);
            }
            xAxis.append(axes[0][i]).append(" ");
            System.out.println(line);
        }
        System.out.println(xAxis);
        System.out.println();
    }
}
