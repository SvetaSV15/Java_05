import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {


    @Test
    public void testAreNumbersEqual(){

            int a = 89;
            int b = 89;
            int expectedResult = 0;

            int actualResult = new AreNumbersEqual().areNumbersEqual(a,b);
            Assert.assertEquals(actualResult, expectedResult);
        }

    @Test
    public void testAreNumbersEqual2(){

        int a = -89;
        int b = 89;
        int expectedResult = -1;

        int actualResult = new AreNumbersEqual().areNumbersEqual(a,b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAreNumbersEqual3(){

        int a = 89;
        int b = -89;
        int expectedResult = 1;

        int actualResult = new AreNumbersEqual().areNumbersEqual(a,b);
        Assert.assertEquals(actualResult, expectedResult);
    }



    }

