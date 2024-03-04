import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class BoardTest {
    Settings settings = new Settings();
    Board newBoard = new Board(settings);
    @Test
    public void testBoard() {
        for (int i = 0; i < settings.getGridSize(); i++) {
            for (int j = 0; j < settings.getGridSize(); j++) {
                Assertions.assertArrayEquals(new int[]{i, j}, newBoard.getGrid()[i][j].getCoord(), i + ", " + j + " is wrong");
            }
        }
    }
}
