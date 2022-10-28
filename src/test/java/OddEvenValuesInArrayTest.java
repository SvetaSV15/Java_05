import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.OddEvenValuesInArray;


public class OddEvenValuesInArrayTest {

    @Test
    public void testCountEvenValuesInArray(){
        int[] array = {5,67,66,45,3,8,23,40};

        Assert.assertEquals(new OddEvenValuesInArray().countEvenValuesInArray(array),3);
    }

    @Test
    public void testCountEvenValuesInArray2(){
        int[] array = {5,0,66,45,0,8,23,40};

        Assert.assertEquals(new OddEvenValuesInArray().countEvenValuesInArray(array),5);
    }

    @Test
    public void testCountEvenValuesInArray3(){
        int[] array = {5,Integer.MAX_VALUE,66,45,3,8,Integer.MIN_VALUE,40};

        Assert.assertEquals(new OddEvenValuesInArray().countEvenValuesInArray(array),4);
    }

    @Test
    public void testCountEvenValuesInArrayNegative(){
        int[] array = {};

        Assert.assertEquals(new OddEvenValuesInArray().countEvenValuesInArray(array),-1);
    }

    @Test
    public void testCountOddValuesInArray(){
        int[] array = {5,67,66,45,3,8,23,40};

        Assert.assertEquals(new OddEvenValuesInArray().countOddValuesInArray(array),5);
    }



}

