package algorithm;

public class isRectangle {

    // Driver code
    public static void main(String[] args)
    {
        int a, b, c, d;
        a = 2; b = 3; c = 3; d = 2;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(d));
        System.out.println(Integer.toBinaryString(a ^ b ^ c ^ d));
        //System.out.println(Integer.toBinaryString(a ^ b ^ c ));
        if ((a ^ b ^ c ^ d) == 0)
            System.out.println("square");
        else
            System.out.println("Rectangle");
    }
}
