package www.cput.ac.za;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Adeebo on 2016/03/27.
 */
public class SingleRPTest {

    @Test
    public void testGetMake() throws Exception {

        SingleRP s1 = new SingleRP();
        String result = s1.getMake();

        assertEquals("Toyota",result);
    }

    @Test
    public void testGetPart() throws Exception {

        SingleRP s1 = new SingleRP();
        String result = s1.getPart();

        assertEquals("Shocks",result);
    }

    @Test
    public void testGetPartNumber() throws Exception {

        SingleRP s1 = new SingleRP();
        int result = s1.getPartNumber();

        assertEquals(123,result);
    }

    @Test
    public void testGetPartLocation() throws Exception {

        SingleRP s1 = new SingleRP();
        String result = s1.getPartLocation();

        assertEquals("Section 2, Holder 5",result);
    }


}