public class Settings {
    private int gridSize = 4;
    public int getGridSize() {
        return gridSize;
    }
    public void setGridSize(int newGridSize) {
        this.gridSize = newGridSize;
    }
    private double difficulty = 0.1234567;
    public double getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(double newDifficulty) {
        this.difficulty = newDifficulty;
    }
    private boolean challengeMode = true;
    public boolean getChallengeMode() {
        return challengeMode;
    }
    public void setChallengeMode(boolean newChallengeMode) {
        this.challengeMode = newChallengeMode;
    }
    private int bombNum = 0;
    public int getBomNum() {
        return bombNum;
    }
    public void setBombNum(int newBombNum) {
        this.bombNum = newBombNum;
    }
}
