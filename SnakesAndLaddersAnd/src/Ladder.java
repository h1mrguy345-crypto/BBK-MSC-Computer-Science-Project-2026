public class Ladder {
    private static int ladderTop;
    private static int ladderBottom;

    /**
     * constructor.
     * if statement to ensure the ladder does not act like a snake
     * 01/06/2026: this is essentially a copy paste of the snake class with adjustments made for the try statement
     * */
    public Ladder(int ladderBottom, int ladderTop) {
            if (ladderBottom <= ladderTop) {
                throw new IllegalArgumentException("You cannot to advance dowmwards with a ladder");
            }
            this.ladderBottom = ladderBottom;
            this.ladderTop = ladderTop;
    }

    //Getters
    //11/06/2026: both made static
    public static int getLadderTop(){
        return ladderTop;
    }
    public static int getLadderBottom() {
        return ladderBottom;
    }
}

