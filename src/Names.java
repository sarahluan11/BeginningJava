import java.util.Scanner;
public class Names
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your first and last name");
        String name = input.nextLine();
        System.out.print(name.charAt(0) + "." + " Diddy ");
        String firstname = name.substring(0, name.indexOf(' '));
        String lastname = name.substring(name.indexOf(' ')+1);
        System.out.print(lastname.toUpperCase()+ " " + firstname + "-izzle");
    }
}
