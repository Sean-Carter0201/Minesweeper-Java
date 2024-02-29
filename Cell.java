public class Cell {
    private int type;
    private String coord;
    private boolean isShown = false;
    public int getType() {
        return type;
    }

    public void setType(int newType) {
        this.type = newType;
    }

    public String getCoord() {
        return coord;
    }

    public void setCoord(String newCoord) {
        this.coord = newCoord;
    }
public boolean getShown() {
        return isShown;
    }

    public void setShown(boolean newShown) {
        this.isShown = newShown;
    }
}
