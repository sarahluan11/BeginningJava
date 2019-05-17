import java.io.FileNotFoundException;
import java.util.*;
import java.time.*;
public class GamePlay
    //this is the object class
    //I will improve the game by keeping the time limit the same for all three levels of difficulty (easy, medium, and hard), so that the game will get significantly harder if they choose increasing levels of difficulty.
    //I also think I can improve the game by finding a way to save the user's level if they stop in the middle of the game, so they don't have to start over the game every single time he/she plays.
{
        public static void main(String[] args) throws FileNotFoundException
        {
            System.out.println("Welcome to the typing game!");
            String input;
            System.out.println("Do you want to continue to play? Yes or No?");
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();

            //The game is on if the user types Yes or Y
            while(input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("y"))
            {

                System.out.println("What difficulty would you like to choose?" +
                        " Enter 1 for easy, " +
                        "enter 2 for medium, " +
                        "enter 3 for hard. \n"+
                        " ");
                System.out.println("PLEASE READ CAREFULLY: \n" +
                        "If you choose the easiest level of difficulty, you will have 40 seconds to copy each sentence. \n" +
                        "If you choose the medium level of difficulty, you will have 60 seconds to copy each sentence. \n" +
                        "If you choose the hardest level of difficulty, you will have 80 seconds to copy each sentence.");
               int difficulty = scan.nextInt();
               TypingGame game = new TypingGame();
               game.setGameLevel(difficulty);
               game.play();
               System.out.println("Do you want to continue to play?");
               Scanner scan1 = new Scanner(System.in);
               input= scan1.nextLine();
            }//
        }
}
