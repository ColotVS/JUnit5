import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class TestAddTwoNumbers {
    @Test
    public void testAddTwoNumbers(){
        int a = 5;
        int b = 3;
        Assert.assertEquals(15,Main.addTwoNumbers(a,b));
        Assert.assertEquals(-25,Main.addTwoNumbers(-1,25));
    }
}
