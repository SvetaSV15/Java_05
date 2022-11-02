package project_utils;

public class MinMaxAve {

    //Написать алгоритм MinMaxAve, который принимает массив чисел int[]
    // и 2 значения индексов. Алгоритм возвращает массив, который содержит
    // минимальное значение, максимальное значение,  и среднее среди всех
    // значений между 2-мя индексами.
    //
    //Test Data:
    //({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}

    public static int[] minMaxAve(int[] massiv8, int a, int b) {


        if (a >= 0 && a < massiv8.length && b >= 0 && b < massiv8.length) {

            if (a > b) {
                int n;
                n = a;
                a = b;
                b = n;
            }

            int ave = 0, numbers = 0, min = massiv8[a], max = massiv8[a];
            for (int i = a; i <= b; i++, numbers++) {
                ave += massiv8[i];

                if (massiv8[i] < min) {
                    min = massiv8[i];
                } else {
                    max = massiv8[i];
                }
            }

            ave = Math.round(ave / numbers);

            return new int[]{min, max, ave};

        } else {

            return new int[]{};
        }
    }




}
