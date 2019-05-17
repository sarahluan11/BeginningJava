import java.io.File;
import java.io.FileNotFoundException;
import java.lang.*;
import java.util.Scanner;

/* This is the client class
    It has one attribute gameLevel to define its difficulty.
 */
public class TypingGame {
    // This defines level of game:
    // 1: easy 2: medium 3: hard
    private int gameLevel;

    //default constructor
    public TypingGame() {
        gameLevel = 1;
    }

    //accessor
    public int getGameLevel() {
        return gameLevel;
    }

    //mutator
    public void setGameLevel(int level) {
        gameLevel = level;
    }


    public void play() throws FileNotFoundException {
        String fileName = "";
        int seconds = 0;
        switch (gameLevel) {
            case 1: //easy
                fileName = "/Users/sluan/IdeaProjects/practice/src/SpellingGameFile";
                //easy game timer set to 40 seconds
                seconds = 40000;
                break;
            case 2: //medium
                fileName = "/Users/sluan/IdeaProjects/practice/src/SpellingGameFile2";
                //medium game timer set to 60 seconds
                seconds = 60000;
                break;
            case 3: //hard
                fileName = "/Users/sluan/IdeaProjects/practice/src/SpellingGameFile3";
                //hard game timer set to 80 seconds
                seconds = 80000;
                break;
            default:
                break;
        }

        File fileinput = new File(fileName);
        //use input to read lines from game file
        Scanner input = new Scanner(fileinput);
        //use scan to read the user's input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name.");
        String username = scan.nextLine();
        //every game starts at level 1
        int level = 1;

        boolean win = true;
        String answer = " ";
        long timer = 0;
        String line = " ";
        //define a timer
        timer = System.currentTimeMillis();
        //read line from file until there is no more
        while (input.hasNextLine())
        {
            System.out.println("Welcome to Level " + level + "!");
            System.out.println("Copy the line below correctly to move to the next level.");

            //read one line from the game file
            line = input.nextLine();
            //print it out
            System.out.println(line);

            //user needs to copy the line
            answer = scan.nextLine();
            //check if the user type matches with the line in the file
            // and also check if the timer meets requirement
            if (System.currentTimeMillis() - timer < seconds) {
                if (answer.equals(line)) {
                    level++;
                }
                else
                {
                    System.out.println("You mistyped! Nice try, " + username + "\nYou made it to level " + level + " \nBetter luck next time!");
                    win = false;
                    break;
                }
            }
            else { // timer is out
                System.out.println("You took too long to type the sentence, " +username + "!\nYou made it to level " + level + "\nBetter luck next time!");
                win = false;
                break;
            }
        }
        //if you typed all line correctly within the timer, you are the winner.
        if (win=true && !(input.hasNextLine()) && System.currentTimeMillis() - timer < seconds )
        {
            System.out.println("Congrats! You won all the levels! You are awesome!");
        }
        return;
    }
}

