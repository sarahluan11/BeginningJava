public class Point
{
       private int x;
       private int y;

       public void SetX(int x1) { x=x1; }
       public void SetY(int y1) { y=y1; }
       public int GetX() { return x; }
       public int GetY() { return y; }
       public void setLocation(int x1, int y1)
       {
           x=x1;
           y=y1;
       }
       public String toString()
       {
           return "Point = ("+x+" , "+y+")";
       }
       public static double distance(Point p1, Point p2)
       {
           double varX = Math.pow(p1.x-p2.x,2);
           double varY = Math.pow(p1.y-p2.y,2);
           return Math.sqrt(varX+varY);
       }
       public boolean isVertical(Point other)
       {
           if(x==other.x)
           {
               return true;
           }
           else
           {
               return false;
           }
       }
       public double slope (Point other)
       {
           if(x==other.x)
               return -0.00001;
           else
           {
               return (double)(other.y - y) / (other.x - x);
           }
       }
       public int manhattanDistance(Point other)
       {
           return (Math.abs(other.y-y)+(other.x-x));
       }
       public boolean isCollinear(Point p2, Point p3)
       {
           boolean T1 = isVertical(p2);
           boolean T2 = isVertical(p3);
           if (T1 && T2)
           {
               return true;
           }
           double s1 = slope(p2);
           double s2 = slope(p3);
               if (Math.abs(s1-s2)<0.001)
               {
                   return true;
               }
               else
               {
                   return false;
               }
       }
}

