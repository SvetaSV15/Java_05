import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.ConditionalAction;

public class ConditionalActionTest {

    @Test
    public void testConditionalAction(){

        int m = 77;

        String expectedResult = "Poor Number";

        String actualResult = new ConditionalAction().conditionalAction(m);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
