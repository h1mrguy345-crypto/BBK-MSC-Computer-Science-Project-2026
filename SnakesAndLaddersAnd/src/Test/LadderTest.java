import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class LadderTest {
    //ladder should not make a player go downwards, aka not act like a snake
    @Test
    void ladderBehaviourNotSnakeBehaviour(){
        IllegalArgumentException LadError =
        assertThrows(IllegalArgumentException.class,
                ()-> new Ladder(15,50));
        System.out.println(LadError.getMessage());
    }
}
