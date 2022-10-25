package project_utils;

//Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
//Test Data:
//3333, 9999
public class BiggerValue {
    public int biggerValue(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }


}
