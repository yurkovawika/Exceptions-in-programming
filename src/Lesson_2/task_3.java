package Lesson_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 0;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
