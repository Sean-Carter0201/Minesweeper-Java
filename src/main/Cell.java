import java.util.ArrayList;

public class Cell {
    private int type;
    private int[] coord = new int[2];
    int status = 0;
    public int getType() {
        return type;
    }

    public void setType(int newType) {
        this.type = newType;
    }

    public int[] getCoord() {
        return coord;
    }

    public void setCoord(int x, int y) {
        this.coord[0] = x;
        this.coord[1] = y;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int newStatus) {
        this.status = newStatus;
    }
    public Cell(double bombChance) {
        if (Math.random() < bombChance) {
            type = -1;
        } else {
            type = 0;
        }
    }
    public ArrayList<int[]> surroundingCellTypes (Cell[][] grid, int x, int y) {
        int gridSize = grid.length;
        ArrayList<int[]> types = new ArrayList<>();
        for (int i = -1; i <= 1; i++) {
            int itest =  x + i;
            if (0 <= itest && itest < gridSize) {
                for (int j = -1; j <= 1; j++) {
                    int jtest = y + j;
                    if (0 <= jtest && jtest < gridSize) {
                        types.add(new int[]{itest, jtest});
                    }
                }
            }
        }
        return types;
    }
}
