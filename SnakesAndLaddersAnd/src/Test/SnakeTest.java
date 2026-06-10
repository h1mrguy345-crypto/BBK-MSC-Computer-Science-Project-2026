import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SnakeTest {
   /**
    * makes sure snakes don't bring you upwards
    * same as ladder class, just adjusted to be for snake
    * */
    @Test
    void SnakeBehaviourNotLadderBehaviour(){
        IllegalArgumentException SError =
                assertThrows(IllegalArgumentException.class,
                        ()-> new Snake(50,15)); //same as ladder but because snakes take you down, you should not be able to go up
        System.out.println(SError.getMessage());
    }
}

