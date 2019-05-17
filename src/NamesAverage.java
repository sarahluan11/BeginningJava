import java.io.*;
import java.util.*;
public class NamesAverage
{
    public static void main(String[] args) throws IOException
    {
        File fileinput = new File("/Users/sluan/IdeaProjects/practice/src/Names");
        Scanner input = new Scanner(fileinput);
        while (input.hasNextLine())
        {
            String lines = input.nextLine();
            Scanner line = new Scanner (lines);
            String babyName = line.next();
            int count =0;
            int total =0;
            while(line.hasNext())
            {
               total += line.nextInt();
               count++;
            }
            System.out.println("The name " +babyName + " has an average of " +total/count + " babies/year");
        }
    }
}
