public class Spot {
    private int playerPosition; //the spot of the board that a player currently is at
    private int move; //the players movement, either advance or go back

    public Spot(int playerPosition){
        this.playerPosition = playerPosition;
        this.move = 0;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }
    
    public void setMove(int move){
        this.move = move;
    }
    public int getMove(int move){
        return move;
    }
}
