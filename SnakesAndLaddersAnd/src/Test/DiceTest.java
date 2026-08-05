import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DiceTest {
    @Test
    void rollExistsD6(){
        Dice testDice = new Dice();
        int testRoll = testDice.DiceRoll();
        assertTrue(testRoll >= 1 && testRoll <= 6);
        System.out.println("a number has been rolled between 1 and 6");
    }
}
