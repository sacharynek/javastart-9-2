import org.testng.Assert;
import org.testng.annotations.Test;

public class DigitsToolsTest {


    @Test
    public void getSumOfDigitsTest() {
        Assert.assertEquals(DigitsTools.getSumOfDigits(1234), 10);
        Assert.assertEquals(DigitsTools.getSumOfDigits(0), 0);
        Assert.assertEquals(DigitsTools.getSumOfDigits(-1), -1);
    }

}
