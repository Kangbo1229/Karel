import java.awt.*;
import java.util.Scanner;

public class PointsAndRectangles {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the x coordinate: ");
        int x = scan.nextInt();
        System.out.print("Enter the y coordinate: ");
        int y = scan.nextInt();
        System.out.print("Enter the length: ");
        int L = scan.nextInt();
        System.out.print("Enter the width: ");
        int w = scan.nextInt();
        Point p = new Point(x, y);
        System.out.println(p);
        Dimension d = new Dimension(L,w);
        System.out.println(d);
        Rectangle r = new Rectangle(p,d);
        System.out.println(r);





    }
}
