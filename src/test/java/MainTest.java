import org.junit.jupiter.api.*;
public class MainTest {
    @Test
    public void testNumToChar() {
        Assertions.assertEquals("A", Main.numToChar(1), "Base case (A) fails");
        Assertions.assertEquals("Z", Main.numToChar(26), "Z fails");
        Assertions.assertEquals("[", Main.numToChar(27), "This will fail, but it shouldn't return this range");
        Assertions.assertEquals("?", Main.numToChar(-1), "Z fails");
    }
}
