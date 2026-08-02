import java.util.Random;

public class Dice {
private Random dice;

    public Dice(){
        dice = new Random();
    }
/**
 * manages the rolling of the dice (for either player)
 * */
    public int DiceRoll(){
        return dice.nextInt();
    }
}
