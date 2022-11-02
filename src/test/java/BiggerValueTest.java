import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    @Test
    public void testBiggerValue() {
        int a = 9999;
        int b = 3333;
        int expectedResult = 9999;

        int actualResult = new BiggerValue().biggerValue(a,b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
