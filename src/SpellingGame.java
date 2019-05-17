import java.util.Timer;
import java.io.*;
import java.util.*;
public class SpellingGame
{
    public static void main(String[] args) throws IOException
    {
        File fileinput = new File ("/Users/sluan/IdeaProjects/practice/src/SpellingGameFile");
        Scanner input = new Scanner(fileinput);
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to the typing game! Please enter your name.");
        String username = scan.nextLine();
        int level = 1;
        while (input.hasNextLine())
        {
            System.out.println("Welcome to Level "+level);
            String line= input.nextLine();
            System.out.println(line);
            System.out.println("Copy this line correctly to move to the next level");
            String answer = scan.nextLine();
                if (answer.equals(line))
                {
                    level++;
                }
                else
                {
                    System.out.println("You lost! Nice try, " + username +"\nYou made to level "+level +" \nBetter luck next time!");
                    System.exit(0);
                }
        }
        System.out.println("You won the entire game! Congratulations, " + username + "!");
        System.exit(0);
    }
}
