public class Board {
    private int boardSize;
    private Spot[] spot;

    //constructor for the board
    public Board (int boardSize){
        this.boardSize = boardSize;
        this.spot = new Spot[boardSize + 1]; // increases the number of spots accordgingly to the board
        setBoard();
    }

    //sets/initialises the board
    private void setBoard(){
        for (int i = 1; i <= boardSize; i++){
            spot[i] = new Spot(i);
        }
    }

    public void printBoard(){
        for (int i = 1; 1 <= boardSize; i++){
            System.out.print("[]");
        }
    }

    public int getBoardSize(){
        return boardSize;
    }

    public Spot[] getSpot(){
        return spot;
    }
}
