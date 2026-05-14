import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BoardTest {
    @Test
    public void setBoardConfirmed(){
        Board testBoard = new Board(15);
        Assertions.assertEquals(15, testBoard.getBoardSize());
        System.out.println("board is set correctly");
    }
}
