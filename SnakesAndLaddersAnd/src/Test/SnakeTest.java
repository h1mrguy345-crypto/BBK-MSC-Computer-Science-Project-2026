import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SnakeTest {

    /**
     * copy paste of ladderexists test
     * confirms snake exists on board
     * 10/06/26: the top of the snake is tile 50 which is right,
     * so i'm not sure what currently is causing the ladder to think 50 is the bottom
     * */
    @Test
    void SnakeExists(){
        Snake testSnake = new Snake(15,50);
        System.out.println("snake exists");
        assertEquals(15, testSnake.getSnakeBottom());
        assertEquals(50, testSnake.getSnakeTop());
    }

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

