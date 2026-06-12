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

    //prints the board out (check main).
    // might be worth looking into: https://stackoverflow.com/questions/77395613/function-for-snakes-and-ladders-printing-additional-output-that-is-not-needed
    public void printBoard(){
        System.out.println("size = " + boardSize);
        for (int i = 1; 1 <= boardSize; i++){
            /*if(spot[i].getSnake() != null){
                System.out.println("[S]"); //prints snake onto board
            }
            else if (spot[i].getLadder() != null){
                System.out.println("[L]"); //prints ladder onto board
            }
            else {*/
            System.out.print("[]"); //prints normal spot on board
            //}
            if (i == 100){ //maximum spots. prevents endless board
            break;
            }
            if(i % 10 == 0){ //splits the board into rows rather than make one endless stream
                System.out.println();
            }
        }
    }

    public int getBoardSize(){
        return boardSize;
    }

    public Spot[] getSpot(){
        return spot;
    }

    public void printSnakeonBoard(){
        spot[Snake.getSnakeTop()].setSnake();
    }
    public void printLadderonBoard(){
        spot[Ladder.getLadderTop()].setLadder();
    }

}
