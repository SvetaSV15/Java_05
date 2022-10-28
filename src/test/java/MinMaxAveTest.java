import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.MinMaxAve;

public class MinMaxAveTest {

    @Test
    public void testMinMaxAve(){
        int[] massiv8 = new int[]{1,2,3,4,5,6,7,8};
        int a = 2;
        int b = 6;
        int[] expectedResult = {3,7,5};
        int[] actualResult = MinMaxAve.minMaxAve(massiv8,a,b);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
