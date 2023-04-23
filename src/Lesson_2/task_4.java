package Lesson_2;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class task_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите что-нибудь: ");
        String string = in.nextLine().trim();
        if (string.isEmpty())
            throw new IllegalArgumentException("Пустые строки вводить нельзя!");
        else
            System.out.println("Вы ввели: " + string);
    }
}




