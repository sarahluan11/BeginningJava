import java.io.*;
import java.util.*;
public class ShoppingFile
{
    public static void main(String[] args) throws IOException
    {
        File fileinput = new File ("/Users/sluan/IdeaProjects/practice/src/Shopping");
        Scanner input = new Scanner (fileinput);
        while(input.hasNextLine())
        {
            //String line = input.nextLine();
            Scanner lineBreaker = new Scanner(input.nextLine());
            String product = lineBreaker.next();
            double total = 0;
            int count = 0;
            while (lineBreaker.hasNextDouble())
            {
                total = total + lineBreaker.nextDouble();
                count++;
            }
            System.out.printf("The average price of %-10s is $%.2f \n",product, +total/count);
        }
    }
}
