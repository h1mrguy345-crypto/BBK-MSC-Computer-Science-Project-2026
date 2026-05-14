import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class BoardTest {
    //to confirm a board is created
    @Test
    public void setBoardConfirmed(){
        Board testBoard = new Board(15);
        Assertions.assertEquals(15, testBoard.getBoardSize());
        System.out.println("board is set correctly");
    }

    //to confirm the spots exist on the board
    @Test
    public void spotExist(){
        Board testBoard = new Board(15);
        assertNotNull(testBoard.getSpot()[1]);
        assertNotNull(testBoard.getSpot()[15]);
        System.out.println("there are spots on the board");
    }

    @Test
    public void confirmPlayerPosition(){
        Board testBoard = new Board(15);
        assertEquals(1, testBoard.getSpot()[1].getPlayerPosition());
        System.out.println("position of player is tracked");
    }
}
