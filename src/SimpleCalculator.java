import java.util.*;
public class SimpleCalculator
{
    public static void main(String[] args)
    {
        double fp1, fp2;
        String operation;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Calculator");
        System.out.println("Enter the first operand: ");
        fp1 = input.nextDouble();
        System.out.println("Enter the second operand: ");
        fp2 = input.nextDouble();
        System.out.println("The operations are: " +
                "\n\t ADD or + for addition" +
                "\n\t SUBTRACT or - for subtraction" +
                "\n\t MULTIPLY or * for multiplication" +
                "\n\t DIVIDE or / for division"+
                "\n\t REMAINDER of % for finding the remainder");
        System.out.println("Enter your selection");
        operation = input.next();
        operation = operation.toUpperCase();
        switch(operation)
        {
            case "ADD":
            case "+":
                System.out.printf("The sum is %.2f", fp1+fp2);
                break;
            case "SUBTRACT":
            case "-":
                System.out.printf("The difference is %.2f", fp1-fp2);
            case "MULTIPLY":
            case "*":
                System.out.printf("The product is %.2f", fp1*fp2);
            case "DIVIDE":
            case "/":
                if (fp2 ==0.0)
                    System.out.println("Diving by 0 is not allowed");
                else
                    System.out.printf("The quotient is %.2f", fp1/fp2);
            case "REMAINDER":
            case "%":
                System.out.printf("The remainder is %.2f", fp1%fp2);
            default:
                System.out.println(operation + " is not valid");
        }
    }
}
