import java.util.Scanner;
public class SumNumbers
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the low number");
        int low = input.nextInt();
        System.out.println("Please enter the high number");
        int high = input.nextInt();
        int sum = 0;
        for (int i=low; i<= high; i++)
        {
            sum+=i;
        }
        System.out.println("The sum is " +sum);
    }
}
