import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LadderTest {

    /**
     * confirms ladder exists on board
     * 10/06/26: apparently the bottom of the ladder is tile 50, should be the other way
     * ^however will need to see how rest of the board works to see if this is fine
     * */
    @Test
    void LadderExists(){
        Ladder testLadder = new Ladder(50,15);
        System.out.println("ladder exists");
        assertEquals(50, testLadder.getLadderBottom());
        assertEquals(15, testLadder.getLadderTop());
    }
    //ladder should not make a player go downwards, aka not act like a snake
    @Test
    void ladderBehaviourNotSnakeBehaviour(){
        IllegalArgumentException LadError =
        assertThrows(IllegalArgumentException.class,
                ()-> new Ladder(15,50));
        System.out.println(LadError.getMessage());
    }
}
