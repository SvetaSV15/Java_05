import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    @Test
    public void testOddIndices() {
        int[] num = {-45, 590, 234, 985, 12, 68, 40};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = new OddIndices().oddIndices(num);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNullArrayOddIndices() {
        int[] num = null;
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(num);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testEmptyArrayOddIndices() {
        int[] num = {};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(num);
        Assert.assertEquals(actualResult, expectedResult);
    }



}


