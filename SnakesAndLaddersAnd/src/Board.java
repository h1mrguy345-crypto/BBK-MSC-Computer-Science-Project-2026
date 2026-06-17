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

    //12/06/2026: boardladder only recognises getladderbottom, not getladdertop. Ladder recognises it however
    public void printLadderonBoard(Ladder ladder){
        spot[Ladder.getLadderTop()].setLadder(ladder);
        spot[Ladder.getLadderBottom()].setLadder(ladder); //made static
    }
    public void printSnakeonBoard(Snake snake){
        spot[Snake.getSnakeTop()].setSnake(snake);
        spot[Snake.getSnakeBottom()].setSnake(snake); //made static
    }

    //prints the board out (check main).
    // might be worth looking into: https://stackoverflow.com/questions/77395613/function-for-snakes-and-ladders-printing-additional-output-that-is-not-needed
    public void printBoard(){
        for (int i = 1; i <= boardSize; i++){
            if (spot[i].getLadder() != null){
                System.out.print("[L]");
            }
            if (spot[i].getSnake() != null){
                System.out.print("[S]");
            }
            else {
                System.out.print("[ ]");
            }
            if (i % 10 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }

    public int getBoardSize(){
        return boardSize;
    }

    public Spot[] getSpot(){
        return spot;
    }




}
