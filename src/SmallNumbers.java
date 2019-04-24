//4/23/19
//Sarah Luan
import java.util.*;
public class SmallNumbers
{
    public static void main(String[] args)
    {
        int smallest;
        int number1, number2, number3;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        number1 = input.nextInt();
        System.out.println("Please enter your second number");
        number2 = input.nextInt();
        System.out.println("Please enter your third number");
        number3 = input.nextInt();
        if (number1 < number2)
            smallest = number1;
        else
            smallest = number2;
        if(number3 < smallest)
            smallest = number3;
        System.out.println("The smallest is " + smallest);
    }
}
