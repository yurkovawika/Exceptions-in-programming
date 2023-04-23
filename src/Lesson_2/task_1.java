package Lesson_2;

import java.util.InputMismatchException;
import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class task_1 {
    public static void main(String[] args) {
        System.out.println(getFloat());
    }

    public static float getFloat() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Введите число:");
                float num = sc.nextFloat();
                return num;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка!Повторите операцию.");
            }
        }
    }
}
