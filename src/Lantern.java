public class Lantern
{
    public static final int SIZE= 3;
    public static void main(String[] args)
    {
        body("*"," ");
        System.out.println(" ");
        body("*"," ");
        System.out.print("*");
        extraline(" |");
        System.out.println(" *");
        extraline("**");
        System.out.println("***");
        body("*"," ");
    }

    public static void body(String beg, String inside)
    {
        for( int line =1; line <= SIZE; line++)
        {
           for(int space=1; space <= -2*line+2*SIZE; space++)
           {
               System.out.print(inside);
           }
           for(int star =1; star <= line*4+1; star++)
           {
               System.out.print(beg);
           }
           System.out.println(" ");
        }
    }
    public static void extraline(String toprint)
    {
        for(int extra=1; extra <= 2*SIZE -1; extra++)
        {
            System.out.print(toprint);
        }
    }
}
