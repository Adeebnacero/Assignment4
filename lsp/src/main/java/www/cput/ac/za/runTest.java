package www.cput.ac.za;

//Reference: http://www.oodesign.com/liskov-s-substitution-principle.html

/**
 * Created by Adeebo on 2016/03/27.
 */
public class runTest {

    private static Rectangle getNewRectangle()
    {
        return new Square();
    }
    public static void main (String args[])
    {
        Rectangle r = runTest.getNewRectangle();
        Rectangle v = new Rectangle();

        r.setWidth(5);
        r.setHeight(10);

        v.setWidth(5);
        v.setHeight(10);

        System.out.println(r.getArea());
        System.out.println(v.getArea());
    }
}
