package www.cput.ac.za;

import org.testng.annotations.Test;
import www.cput.ac.za.Assignment4_1.Football;
import www.cput.ac.za.Assignment4_1.Rugby;

import static org.testng.Assert.assertEquals;

/**
 * Created by Adeebo on 2016/03/26.
 */
public class SportsTest {

    @Test
    public void footballTest()
    {
        Football f1 = new Football("","","");

        assertEquals(11,f1.noOfPlayers());
    }

    @Test
    public void rugbyTest()
    {
        Rugby r1 = new Rugby("","","");

        assertEquals(15,r1.noOfPlayers());
    }
}
