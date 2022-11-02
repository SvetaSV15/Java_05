import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    //1.Positive testing Happy path
    // if(start <= end)
    //return array;

    //start < end
    @Test
    public void testStartLessThanEnd_HappyPath(){
    //AAA
        //Arrange
        int start = 1;
        int end = 20;
        String[] expectedResualt = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11",
                "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};
        //act

        String [] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResualt);
    }


    //start == end
    @Test
    public void testStartEqualsThanEnd_HappyPath(){
        //AAA
        //Arrange
        int start = 1;
        int end = 1;
        String[] expectedResualt = {"1"};
        //act

        String [] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResualt);
    }


//start < end

    @Test
    public void testStartLessThanEnd_StartEndAreNegative_HappyPath(){
        //AAA
        //Arrange
        int start = -20;
        int end = -1;
        String[] expectedResualt = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz", "-14", "-13", "Fizz",
                "-11", "Buzz", "Fizz", "-8", "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1"};
        //act

        String [] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResualt);
    }

    //1.Negative testing
    // if(start > end)
    //return new String[0];

    @Test
    public void testStartGreaterThanEnd_Negative(){
        //AAA
        //Arrange
        int start = 20;
        int end = 1;
        String[] expectedResualt = {};
        //act

        String [] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResualt);
    }



}
