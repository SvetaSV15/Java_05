import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

    //Task 1

    @Test
    public void testRemoveSpaces() {
        String text = "    Red Rover School   ";

        String expectedResult = "Лишние пробелы удалены";

        String actualResult = new StringMethods().removeSpaces(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveSpaces2() {
        String text = "Red Rover School";

        String expectedResult = "Пробелов не было";

        String actualResult = new StringMethods().removeSpaces(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveSpaces3() {
        String text = "";

        String expectedResult = "Строка пустая";

        String actualResult = new StringMethods().removeSpaces(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Task 2
    @Test
    public void testremoveAllAs() {
        String text = "    Red Rover School   ";

        String expectedResult = "Red Rover School";

        String actualResult = new StringMethods().removeAllAs(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testremoveAllAs2() {
        String text = "panda   ";

        String expectedResult = "pnd";

        String actualResult = new StringMethods().removeAllAs(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testremoveAllAs3() {
        String text = "taramasalata";

        String expectedResult = "trmslt";

        String actualResult = new StringMethods().removeAllAs(text);
        Assert.assertEquals(actualResult, expectedResult);
    }


    //Task 3
    @Test
    public void testRemoveAllZeros() {
        String text = "3504209706040000 ";

        String expectedResult = "35429764";

        String actualResult = new StringMethods().removeAllZeros(text);
        Assert.assertEquals(actualResult, expectedResult);


    }

    @Test
    public void testRemoveAllZeros2() {
        String text = "0000000111";

        String expectedResult = "111";

        String actualResult = new StringMethods().removeAllZeros(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Task 4
    @Test
    public void testRemoveAllSpaces() {
        String text = "    R e d     Ro ve    r Sc   h ool   ";

        String expectedResult = "RedRoverSchool";

        String actualResult = new StringMethods().removeAllSpaces(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllSpaces2() {
        String text = "p a     n   d a   ";

        String expectedResult = "panda";

        String actualResult = new StringMethods().removeAllSpaces(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllSpacesNegative() {
        String text = null;

        String expectedResult = "Invalid value";

        String actualResult = new StringMethods().removeAllSpaces(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Task 5
    @Test
    public void testCountAs() {
        String text = "Abracadabra";

        String expectedResult = "5, 6";

        String actualResult = new StringMethods().countAs(text);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testCountAs2() {
        String text = "Homenum Revelio";

        String expectedResult = "0, 15";

        String actualResult = new StringMethods().countAs(text);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testCountAs3() {
        String text = "3 tarAmasAlatA";

        String expectedResult = "6, 8";

        String actualResult = new StringMethods().countAs(text);
        Assert.assertEquals(actualResult, expectedResult);

    }

    // Task 6
    @Test
    public void testCountJava() {
        String text = "As of March 2022, Java 18 is the latest version,\n" +
                "     while Java 17, 11 and 8 are the current long-term\n" +
                "     support (LTS) versions. Oracle released the last\n" +
                "     zero-cost public update for the legacy version\n" +
                "     Java 8 LTS in January 2019 for commercial use,\n" +
                "     although it will otherwise still support Java 8\n" +
                "     with public updates for personal use indefinitely.\n" +
                "     Other vendors have begun to offer zero-cost builds\n" +
                "     of OpenJDK 8 and 11 that are still receiving security\n" +
                "     and other upgrades.";

        boolean expectedResult = true;

        boolean actualResult = new StringMethods().countJava(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountJava2() {
        String text = "99 little bugs in a code.\n" +
                "    99 little bugs in a code.\n" +
                "    Take one down, and patch it around.\n" +
                "    235 critical bugs in the code.";

        boolean expectedResult = false;

        boolean actualResult = new StringMethods().countJava(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Task 7
    @Test
    public void testInsertQuotes() {
        String text = "Abracadabra";

        String expectedResult = "\"Abracadabra\"";

        String actualResult = new StringMethods().insertQuotes(text);
        Assert.assertEquals(actualResult, expectedResult);
    }




    //Task 11

//        @Test
//        public void testsameFirstLastLetterIndexOf () {
//            String str = "Abracadabra";
//            boolean expectedResult = true;
//
//            String actualResult = String.valueOf(new StringMethods().sameFirstLastLetterIndexOf(str));
//            Assert.assertEquals(actualResult, expectedResult);
//
//        }
//        @Test
//        public void testsameFirstLastLetterIndexOfFalse() {
//            String str = "Whippersnapper";
//            String expectedResult = String.valueOf(false);
//
//            String actualResult = String.valueOf(new StringMethods().sameFirstLastLetterIndexOf(str));
//            Assert.assertEquals(actualResult, expectedResult);
//
//        }

    }


