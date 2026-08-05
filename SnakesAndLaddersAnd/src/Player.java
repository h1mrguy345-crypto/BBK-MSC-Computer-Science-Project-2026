import java.security.PublicKey;

public class Player {
    private String playerName;
    private String playerBoardRepresentation;
    private int playersCurrentPosition;

    /**
     * constructor of player class
     * @param playerName defined the name of the current player
     * also tracks the position of the player, which will always start at spot 1
     */
    public Player(String playerName, String playerBoardRepresentation){
        this.playerName = playerName;
        this.playerBoardRepresentation = playerBoardRepresentation;
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

    //allows a player to roll dice (rather than the main automatically doing it)
    public int playersRoll(Dice playerDiceRoll){
        return playerDiceRoll.DiceRoll();
    }
}
