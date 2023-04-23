package Lesson_1;

public class Main {
    public static void main(String[] args) {

        //-----Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
        //metod1_ArrayIndexOutOfBoundsException();
        //metod2_ArithmeticException();
        //metod3_NullPointerException();


        //------Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
        // и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
        // Если длины массивов не равны, необходимо как-то оповестить пользователя.

        int[] arrayA = {10, 20, 30, 40};
        int[] arrayB = {1, 2, 3, 4, 5};
        arrayDifference(arrayA, arrayB);


    }

    public static void metod1_ArrayIndexOutOfBoundsException() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array[10]);
    }

    public static void metod2_ArithmeticException() {
        int i = 0;
        int j = 10;
        System.out.println(j / i);
    }

    public static void metod3_NullPointerException() {
        String a = null;
        System.out.println(a.charAt(0));
    }


    public static int[] arrayDifference(int[] arrayA, int[] arrayB) {
        int[] res = new int[arrayA.length];
        if (arrayA.length != arrayB.length) {
            System.out.println("The length of array \"A\" is not equal to the length of array \"B\"");
        } else {
            for (int i = 0; i < arrayA.length; i++) {
                res[i] = arrayA[i] - arrayB[i];
                System.out.println(res[i]);
            }
        }
        return res;
    }
}