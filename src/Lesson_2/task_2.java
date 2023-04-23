package Lesson_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task_2 {
    static final int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int d = sc.nextInt();
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}