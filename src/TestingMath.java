import java.util.*;
public class TestingMath
{
    public static void main(String[] args)
    {
        double Num1 = 45.50;
        double Num2 = -350;
        double Num3 = 0.056;
        double Addition = Num1 + Num2 + Num3;
        double Multi = Num1 * Num2 * Num3;
        Multi = Math.round(Multi);
        Multi = Multi/100;
        double Maxi = Math.max(Num1,Num2);
        Maxi = Math.max(Maxi,Num3);
        double Mini = Math.min(Num1,Num2);
        Mini = Math.min(Mini,Num3);
        System.out.println("This is the sum " + Addition + "\n The multiplication is " + Multi);
        System.out.println("The Max number is " + Maxi + "\n The Min is " + Mini);
        double rooty = Math.sqrt(Math.abs(Multi));
        System.out.println("The square root of Multi is " + rooty);
        System.out.println("A random number " + Math.random());
        Random randy = new Random ();
        int randy2 = randy.nextInt(11)+10;
        System.out.println("My second random number is " + randy2);
        int randy3 = randy.nextInt(31)+40;
        System.out.println("My third random number is " + randy3);
    }

}

