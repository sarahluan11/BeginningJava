public class Box {
    private int width;
    private int length;
    private int height;

    Box() {
        width = 1;
        length = 1;
        height = 1;
    }

    Box(int w, int l, int h) {
        width = w;
        length = l;
        height = h;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int w) {
        width = w;
    }

    public void setLength(int l) {
        length = l;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int CalculateArea() {
        return width * length;
    }

    public int CalculateVolume() {
        return width * length * height;
    }

    public String toString() {
        return "The dimensions are " + Integer.toString(width) + "x"+ Integer.toString(length) + "x"+ Integer.toString(height);
    }


    public static void main(String[] args) {
        Box b = new Box (3, 4, 5);
        Box b2 = new Box();
        b.CalculateArea();
        System.out.println("The area of box 1 is: " + b.CalculateArea());
        System.out.println("The volume of box 1 is: " + b.CalculateVolume());
        System.out.println(b.toString());
        System.out.println("The area of box 2 is: " + b2.CalculateArea());
        System.out.println("The volume of box 2 is: " + b2.CalculateVolume());
        System.out.println(b2.toString());
    }
}