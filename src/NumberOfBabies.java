import java.io.*;
import java.util.*;
public class NumberOfBabies
{
    public static void main(String[] args) throws IOException
    {
        File fileinput = new File("/Users/sluan/IdeaProjects/practice/src/Names");
        Scanner input = new Scanner(fileinput);
        while (input.hasNextLine())
        {
            String lines = input.nextLine();
            Scanner line = new Scanner(lines);
            String babyName = line.next();
            int num = line.nextInt();
            if (num==58)
            {
                System.out.println(babyName + " has 58 names in 1900");
            }
        }
    }
}
