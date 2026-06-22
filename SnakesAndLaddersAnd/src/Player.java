import java.security.PublicKey;

public class Player {
    private String playerName;
    private int playersCurrentPosition;

    /**
     * constructor of player class
     * @param playerName defined the name of the current player
     * also tracks the position of the player, which will always start at spot 1
     */
    public Player(String playerName){
        this.playerName = playerName;
        this.playersCurrentPosition = 1;
    }

    //setters and getters

    public int getPlayersCurrentPosition(){
        return playersCurrentPosition;
    }

    //tracks the current position, whereas constructor ensures player starts on the first tile
    public void setPlayersCurrentPosition(int playersCurrentPosition){
        this.playersCurrentPosition = playersCurrentPosition;
    }

    public String getPlayerName(){
        return playerName;
    }
}
