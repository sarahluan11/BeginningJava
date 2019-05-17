import java.io.*;
import java.util.*;
public class NamesA
{
    public static void main(String[] args)throws IOException
    {
        File fileinput = new File ("/Users/sluan/IdeaProjects/practice/src/Names");
        Scanner inputfile = new Scanner (fileinput);
        Scanner in = new Scanner(System.in);
        System.out.println("What is the name you would like to find?");
        String nameToSearch = in.nextLine();
        while (inputfile.hasNextLine())
        {
            String lines = inputfile.nextLine();
            if(lines.substring(0, lines.indexOf(' ')).compareTo(nameToSearch) == 0)
            {
                System.out.println(lines);
                break;
            }
           }
        }
}
