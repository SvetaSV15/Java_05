import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    @Test
    public void testIsPositiveNumber() {
        int number = 555;

        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIsPositiveNumber2() {
        int number = 0;

        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIsPositiveNumber3() {
        int number = -555;

        boolean expectedResult = false;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
