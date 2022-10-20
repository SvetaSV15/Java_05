import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.OddEven;

public class OddEvenTest {

    // Test 1
    @Test
    public void testOddEven(){
        //Arrange
        int number = -365;
        String expectedResualt = "Odd";
        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResualt);
    }
}
