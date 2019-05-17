import java.util.*;
public class PurchaseItems
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double total=0;
        int items=0;
        String answer;
        do {
            System.out.println("What is the price of the item?");
            double price = input.nextDouble();
            total = total + price;
            items++;
            System.out.println("Do you have any other items to scan? Yes or No?");
            answer = input.next();
        }
        while (answer.equalsIgnoreCase("yes"));

         System.out.println("The " + items + " items you bought total $" + total);
    }
}
