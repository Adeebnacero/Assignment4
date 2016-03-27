package www.cput.ac.za;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Adeebo on 2016/03/27.
 */
public class runOpenCloseTest {

    @Test
    public void testDrawSquare() throws Exception {

        Square s1 = new Square();
        String result = s1.draw();

        assertEquals("Drawing a square",result);
    }

    @Test
    public void testDrawCircle() throws Exception {

        Circle c1 = new Circle();
        String result = c1.draw();

        assertEquals("Drawing a circle",result);
    }
}