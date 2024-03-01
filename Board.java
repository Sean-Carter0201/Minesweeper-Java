public class Board {
    final private Cell[][] grid;
    final private char[][] axes;
    public Board(Cell[][] newGrid, char[][] newAxes) {  //Constructor Class for Board
        grid = newGrid;
        axes = newAxes;
    }
    public Cell[][] getGrid() {
        return grid;
    }
    public char[][] getAxes() {
        return axes;
    }
    public static Board createBoard(int gridSize) {
        Cell[][] grid = new Cell[gridSize][gridSize];
        char[][] axes = new char[2][gridSize];
        Board board = new Board(grid, axes);
        StringBuilder xAxis = new StringBuilder("   ");
        for (int i = 0; i < gridSize; i++) {
            axes[1][gridSize - i - 1] = (char) ((gridSize - i) + '0');
            StringBuilder line = new StringBuilder(axes[1][gridSize - i - 1] + "  ");
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
                cell.setCoord(axes[0][j], axes[1][gridSize - i - 1]);
            }
            xAxis.append(axes[0][i]).append(" ");
            System.out.println(line);
        }
        System.out.println(xAxis);
        System.out.println();
        return board;
    }
}
