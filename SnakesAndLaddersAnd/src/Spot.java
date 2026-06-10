public class Spot {
    private int playerPosition; //the spot of the board that a player currently is at
    private int move; //the players movement, either advance or go back
    private Snake snake;
    private Ladder ladder;

    public Spot(int playerPosition){
        this.playerPosition = playerPosition;
        this.move = 0;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    /**
     * if a player moves,
     * they can't go beyond the board.
     * there is a max set but -1 just means they don't go backwards off the board.
     * */
    public boolean playerAdvancesTo(){
        return move != -1;
    }
    public void setMove(int move){
        this.move = move;
    }
    public int getMove(int move){
        return move;
    }
    public void setLadder(){
        this.ladder = ladder;
    }
    public Ladder getLadder(){
        return ladder;
    }
    public void setSnake(){
        this.snake = snake;
    }
    public Snake getSnake(){
        return snake;
    }
}
