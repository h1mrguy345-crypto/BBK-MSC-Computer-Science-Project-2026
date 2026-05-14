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
        Board mainBoard = new Board(10);
        mainBoard.printBoard();
    }
}
