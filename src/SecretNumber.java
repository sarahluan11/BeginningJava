import java.util.*;
public class SecretNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double secret = Math.random()*10;
        System.out.println("Please insert an integer from 1.0 to 9.9");
        double guess = input.nextDouble();
        if (guess < 1.0 || guess >10.0)
        {
            System.err.println("That is not between 1.0 to 9.9... Can you read?");
        }
        else
            {
            if (Math.abs(guess - secret) < 0.1)
            {
                System.out.println("Congratulations! You are a genius!");
            }
            else if (guess > secret)
            {
                System.out.println("Your guess was too high");
                System.out.println("This was the secret number: " + guess);
                System.out.println("This was the secret number: " + secret);
            }
            else
                {
                System.out.println("Your guess was too low");
                System.out.println("This was the secret number: " + guess);
                System.out.println("This was the secret number: " + secret);
                }
            }
    }

}
