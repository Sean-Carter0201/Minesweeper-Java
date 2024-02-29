public class Cell {
    private int type;
    private char[] coord = new char[2];
    private boolean isShown = false;
    public int getType() {
        return type;
    }

    public void setType(int newType) {
        this.type = newType;
    }

    public char[] getCoord() {
        return coord;
    }

    public void setCoord(char x, char y) {
        this.coord[0] = x;
        this.coord[1] = y;
    }
public boolean getShown() {
        return isShown;
    }

    public void setShown(boolean newShown) {
        this.isShown = newShown;
    }
}
