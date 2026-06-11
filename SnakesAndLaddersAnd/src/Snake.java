import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Snake {
    private static int snakeTop;
    private int snakeBottom;

    /**
     * constructor.
     * if statement to ensure the snake does not act like a ladder
     * */
    public Snake(int snakeBottom, int snakeTop) {
            if (snakeBottom >= snakeTop) {
                throw new IllegalArgumentException("You cannot to advance upwards with a snake");
            }

            this.snakeBottom = snakeBottom;
            this.snakeTop = snakeTop;
    }
    public static int getSnakeTop(){
        return snakeTop;
    } //11/06/2026: made static

    public int getSnakeBottom() {
        return snakeBottom;
    }
}
