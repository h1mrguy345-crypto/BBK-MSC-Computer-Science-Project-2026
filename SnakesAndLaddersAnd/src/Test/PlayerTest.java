import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    //to ensure players begin on the first space of the board
    @Test
    void beginAtFirstSpot(){
        Player testPlayer = new Player("player 1");
        System.out.println("player 1 is on the first spot of the board");
        assertEquals(1,testPlayer.getPlayersCurrentPosition());
    }

    /**
     * ensures a player can move to a different spot
     * confirms that playersCurrentPosition doesn't try to force a player into just spot 1 and crash.
     * tested as a forced movement, since there currently isn't a class for dice (22/06/26)
     */
    @Test
    void playersCanMoveAndBeTracked(){
        Player testPlayer = new Player("player 1");
        testPlayer.setPlayersCurrentPosition(82);
        System.out.println("player 1 is currently at spot 82");
        assertEquals(82, testPlayer.getPlayersCurrentPosition());
    }
}
