package project_utils;

public class OddEvenValuesInArray {

    //Написать метод countEvenValuesInArray(),
    // который принимает на вход массив целых чисел,
    // и возвращает количество четных чисел в этом массиве
    public int countEvenValuesInArray(int[] array){
        int count = 0;
        if(array.length==0){
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                count++;
            }
        }

        return count;
    }

    //Написать метод countOddValuesInArray(),
    // который принимает на вход массив целых чисел,
    // и возвращает количество нечетных чисел в этом массиве

    public int countOddValuesInArray(int[] array){

        if(array.length==0){

            return -1;
        }

        return array.length-countEvenValuesInArray(array);
    }

}
