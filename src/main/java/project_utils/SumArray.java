package project_utils;

public class SumArray {
    // Task 3 Написать алгоритм SumArray,
    // который возвращает сумму всех чисел массива
    //Test Data:
    //{0, 1, 2, 3, 4, 5} → 15
    //{-7, -3} → -10

    public int sumArray(int[] numArr) {
        if (numArr != null) {
            int result = 0;

            for (int i = 0; i < numArr.length; i++) {
                result += i;
            }

            return result;
        }
        return 0;
    }
}
