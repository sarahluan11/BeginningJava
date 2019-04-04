public class practiceDiamond
{
    public static final int SIZE=3;

    public static void main(String[] args)
    {
        topbot();
        top("/", " ", "\\");
        bot("\\", " ", "/");
        topbot();
    }
    public static void topbot()
    {
        System.out.print ("+");
        for (int dash=1; dash <= SIZE*2; dash++)
        {
            System.out.print ("-");
        }
        System.out.println( "+");
    }
    public static void top(String beg, String inside, String end)
    {
        for (int line =1; line <= SIZE;line ++)
        {
            System.out.print("|");
            for (int space = 1; space <= -line + SIZE; space++)
            {
                System.out.print(inside);
            }
            System.out.print(beg);
            for (int i = 0; i< (line-1)*2; i++)
            {
                System.out.print(inside);
            }
            System.out.print(end);
            for (int space = 1; space <= -line + SIZE; space++)
            {
                System.out.print(inside);
            }
            System.out.println("|");
        }
    }

    public static void bot(String beg, String inside, String end)
    {
        for (int line =1; line <= SIZE; line ++)
        {
            System.out.print("|");
            for (int i = 0; i< (line-1); i++)
            {
                System.out.print(inside);
            }
            System.out.print(beg);
            for (int space = 1; space <= (-line + SIZE)*2; space++)
            {
                System.out.print(inside);
            }
            System.out.print(end);
            for (int i = 0; i< (line-1); i++)
            {
                System.out.print(inside);
            }
            System.out.println("|");
        }
    }
}

