import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class LadderTest {
    //ladder should not make a player go downwards, aka not act like a snake
    //10/06/26: encountering a token issue, forgot to grant write access, having to resolve now. latest commit: test prints message
    @Test
    void ladderBehaviourNotSnakeBehaviour(){
        IllegalArgumentException LadError =
        assertThrows(IllegalArgumentException.class,
                ()-> new Ladder(15,50));
        System.out.println(LadError.getMessage());
    }
}
