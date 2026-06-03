public class Ladder {
    private int ladderTop;
    private int ladderBottom;

    /**
     * constructor.
     * if statement to ensure the ladder does not act like a snake
     * 01/06/2026: this is essentially a copy paste of the snake class with adjustments made for the try statement
     * */
    public Ladder(int ladderBottomBottom, int ladderTop) {
        try {
            if (ladderBottomBottom <= ladderTop) {
                throw new IllegalArgumentException("You cannot to advance dowmwards with a ladder");
            }

            this.ladderBottom = ladderBottom;
            this.ladderTop = ladderTop;
        } catch (IllegalArgumentException ladderError){
            System.out.println(ladderError.getMessage());
        }
    }
    public int getLadderTop(){
        return ladderTop;
    }

    public int getLadderBottom() {
        return ladderBottom;
    }
}

