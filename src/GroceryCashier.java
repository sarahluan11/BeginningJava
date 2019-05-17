import java.util.*;
public class GroceryCashier
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double total = 0;
        int items = 0;
        String answer;
        System.out.println("Do you have any items to scan? Yes or No?");
        answer = input.next();
        System.out.println();
        double price;
        while (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y") )
        {
            System.out.println("What is the price of the item?");
            price = input.nextDouble();
            total = total + price;
            items++; //items++ --> items = items + 1
            System.out.println("Do you have any other items to scan? Yes or No?");
            answer = input.next();
        }
        System.out.println("The " + items + " items you bought total " + total);
    }
}
