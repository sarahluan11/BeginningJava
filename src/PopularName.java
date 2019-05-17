import java.io.*;
import java.util.*;
public class PopularName
{
    public static void main(String[] args) throws IOException
    {
        File fileinput = new File("/Users/sluan/IdeaProjects/practice/src/Names");
        Scanner input = new Scanner(fileinput);
        int max =0;
        String popularName = "";
        while (input.hasNextLine())
        {
            String lines = input.nextLine();
            Scanner line = new Scanner(lines);
            String babyName = line.next();
            for (int i=0;i<4;i++)
            {
                line.nextInt();
            }
            int numSave = line.nextInt();  //number in 1940;
            if( numSave > max)
            {
                max = numSave;
                popularName = babyName;
            }
        }
        System.out.print("The most popular name in 1940 is : " + popularName);
    }
}
