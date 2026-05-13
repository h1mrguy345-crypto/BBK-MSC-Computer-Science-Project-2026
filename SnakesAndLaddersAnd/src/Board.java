public class Board {
    private int boardSize;
    private Spot[] spot; // Spot class is to be made

    //constructor for the board
    public Board (int boardSize){
        this.boardSize = boardSize;
        this.spot = new Spot[boardSize + 1]; // increases the number of spots accordgingly to the board
    }
}
