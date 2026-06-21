public class Player {
    private String playerName;
    private int payersCurrentPosition;

    /**
     * constructor of player class
     * @param playerName defined the name of the current player
     * also tracks the position of the player, which will always start at spot 1
     */
    public Player(String playerName){
        this.playerName = playerName;
        this.payersCurrentPosition = 1;
    }
}
