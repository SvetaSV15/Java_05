import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    @Test
    public void testMultiplуArrayByNumber() {
        int[] array = {1,2,3,4,5};
        int number = 3;
        int[] expectedResult = {3, 6, 9, 12, 15};

       int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array,number);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testToDoubleArray(){
        int[] array = {1,2,3,4,5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testToIntArray(){
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);
        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    public void testToStringArray(){
        int[] array = {1, 2, 3, 4, 5};
        String[] expectedResult = {"1","2","3","4","5"};
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testToStringArray2(){
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        String[] expectedResult = {"1.1","2.5","3.7","4.0","5.5"};
        String[] actualResult = new ManipulationsWithArrays().toStringArray2(array);
        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    public void testAreValuesGreaterThanNumber(){
        int[] array = {24,17,20,10,6,9,25,8};
        int number = 4;
        boolean expectedResult = true;
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAreValuesGreaterThanNumber2(){
        int[] array = {24,17,20,10,6,9,25,8};
        int number = 7;
        boolean expectedResult = false;
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAreValuesGreaterThanNumber3(){
        int[] array = {24,17,20,10,6,9,25,8};
        int number = 6;
        boolean expectedResult = false;
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAreValuesGreaterThanNumber4(){
        int[] array = {};
        int number = 3;
        boolean expectedResult = false;
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
