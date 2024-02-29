public class Settings {
    private int gridSize = 2;
    public int getGridSize() {
        return gridSize;
    }
    public void setGridSize(int newGridSize) {
        this.gridSize = newGridSize;
    }
    private int difficulty = 0;
    public int getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(int newDifficulty) {
        this.difficulty = newDifficulty;
    }
    private int bombPercent;
    public int getBombPercent() {
        return bombPercent;
    }
    public void setBombPercent(int newBombPercent) {
        this.bombPercent = newBombPercent;
    }
}
