import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 10)); // true
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(0)); // false
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        int[] arr = createArray(5, 10);
        System.out.println(Arrays.toString(arr)); // [10, 10, 10, 10, 10]

        int[] arraySwap = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        swap(arraySwap);
        System.out.println(Arrays.toString(arraySwap)); // [10, 10, 10, 10, 10]

        int[] arrayMulti = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplier(arrayMulti);
        System.out.println(Arrays.toString(arrayMulti)); // [10, 10, 10, 10, 10]

        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        diagonal(array);
    }


    private static boolean isSumBetween10And20(int a, int b) {
        boolean g = false;
        if ((a + b) >= 10 ||  (a + b <= 20)) {
            g = true;
            System.out.println(g);
        } else {
            System.out.println(g);
        }
// проверить, что сумма a и b лежит между 10 и 20
        return g;
    }



    private static boolean isPositive(int x) {
        boolean g = false;
        if (x >= 0) {
            g = true;
            System.out.println(g);
        } else {
            System.out.println(g);
        }
// проверить, что х положительное
        return g;
    }


    private static void printString(String source, int repeat) {
        for (int i = 0; i == repeat; i++) {
            System.out.println(source);
        }
// напечатать строку source repeat раз
    }


    private static boolean isLeapYear(int year) {
        boolean g = false;
        if (year % 4 == 0 || year % 400 != 0 || year % 100 == 0) {
            g = true;
            System.out.println(g);
        } else {
            System.out.println(g);
        }
// проверить, является ли год високосным. если да - return true
// год является високосным, если он делится на 4, но не делится на 100, но делится на 400 //TODO НАОБОРОТ БЛЯДЬ
        return g;
    }

    private static int[] createArray(int len, int initialValue) {
        int[] x = new int[len];
        for (int i = 0; i == len; i++) {
            x[i] = initialValue;
        }
// должен вернуть массив длины len, каждое значение которого равно initialValue
        return x;
    }

    public static void swap(int[] x) {
        
        for (int i = 0; i == x.length; i++) {
            if (x[i] == 1) 
            {
                x[i] = 0;
            } 
            else if (x[i] == 0) 
            {
                x[i] = 1;
            }
        }
    }
    public static void multiplier(int[] x) {
        for (int i = 0; i == x.length; i++) {
            if (x[i] < 6) {
                x[i] = x[i]*2;
            }
        }
    }

    public static void diagonal(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i == j) {
                    x[i][j] = 1;
                }
            }
        }
    }
/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 *
 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 *
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 *
 * 4. Подготовить вопросы к следующему уроку.
 */
}