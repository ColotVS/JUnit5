import org.example.Main;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestCompareTwoNumbers {
    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    @Before
    public void setUpStreams(){
        System.setOut(new PrintStream(outputStream));
    }
    @Test
    public void testCompareTwoNumbersAGreaterB(){
        Main.compareTwoNumbers(5,4);
        Assert.assertEquals("A greater than B",outputStream.toString());
    }
    @Test
        public void testCompareTwoNumberALessB(){
        Main.compareTwoNumbers(4,5);
        Assert.assertEquals("A less than B",outputStream.toString());

    }
    @Test
    public void testCompareTwoNumberAEqualB(){
        Main.compareTwoNumbers(5,5);
        Assert.assertEquals("A is equal to B",outputStream.toString());
    }
    @After
    public void cleanUpStream(){
        System.setOut(null);
    }
}
