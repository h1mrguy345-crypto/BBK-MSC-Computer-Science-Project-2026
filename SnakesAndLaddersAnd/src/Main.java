import java.util.Scanner;

public class Main{
    public static void main(){
        System.out.println("Welcome to 'Snakes and Ladders and...");
        Scanner UserChoice = new Scanner(System.in);
        System.out.println("for instructions, type i, otherwise hit enter");
        String userChoice = UserChoice.nextLine();
        if (userChoice.equalsIgnoreCase("i")){
            System.out.println("Snakes and ladders and...");
            System.out.println("is a game very much like traditional snakes and ladders");
            System.out.println("however, to advance above specific areas, you need to obtain points");
            System.out.println("to obtain points, you must land on point tiles, where you will be tasked or quizzed");
            System.out.println("answer correctly, gain points. answer wrong, you may be subject to losing points");
            System.out.println("if you don't have enough points to advance to the next tiles, you will be sent back to the beginning section of your board");
            System.out.println("the winner is the first one who reaches the top tile");
            System.out.println("to exit the instructions, hit enter (you will be sent to the next page)");
        }
        Scanner playersInput = new Scanner(System.in);
        Board mainBoard = new Board(100);
        //17/06/26 both ladder and snake are null, to be uncommented once snakes and ladders are printed onto board
        mainBoard.printLadderonBoard(new Ladder(8,5));
        mainBoard.printLadderonBoard(new Ladder(28,15));
        mainBoard.printLadderonBoard(new Ladder(51,47));
        mainBoard.printLadderonBoard(new Ladder(90,84));
        mainBoard.printSnakeonBoard(new Snake(20,28));
        mainBoard.printSnakeonBoard(new Snake(10,50));
        mainBoard.printSnakeonBoard(new Snake(31,48));
        mainBoard.printSnakeonBoard(new Snake(16,90));
        mainBoard.printBoard(new Player("Player 1", "P1"), new Player("Player 2", "P2"));

        /**
         * allows the looping of players once a turn ends
         * based on a method i made for the Programming in java 2025-2026 coursework
         * main difference is that the array doesn't work when new players are defined within itself
         * so players are set before the array
         * */
        Player P1 = new Player("Player1", "P1");
        Player P2 = new Player("Player 2", "P2");
        Player activePlayer[] = {P1,P2};
        int activeUser = 0;
        Boolean endGame = false;
        Dice mainDice = new Dice();

        while (!endGame){
        System.out.println("hit enter to roll the dice");
        playersInput.nextLine(); //rolls the dice
        int mainRoll = P1.playersRoll(mainDice); //to prevent automatic rolling, setting dice roll to players input (still automatically rolls as of right now)
        System.out.println("you have rolled " + mainRoll);
        P1.setPlayersCurrentPosition(P1.getPlayersCurrentPosition() + mainRoll);
        mainBoard.printBoard(P1,P2);}
    }
}
