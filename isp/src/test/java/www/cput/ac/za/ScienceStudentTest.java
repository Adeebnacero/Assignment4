package www.cput.ac.za;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Adeebo on 2016/03/27.
 */
public class ScienceStudentTest {

    @Test
    public void testEnglish() throws Exception {

        EnglishStudent e1 = new EnglishStudent();

        String result = e1.english();

        assertEquals("English",e1.english());

    }

    @Test
    public void testMath() throws Exception {

        MathStudent e1 = new MathStudent();

        String result = e1.math();

        assertEquals("Math",e1.math());

    }

    @Test
    public void testScience() throws Exception {

        ScienceStudent e1 = new ScienceStudent();

        String result = e1.science();

        assertEquals("Science",e1.science());

    }
}