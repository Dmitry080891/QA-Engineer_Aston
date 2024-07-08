package ru.aston.homework.Lesson_1;

import java.util.Scanner;

/*
8. Напишите метод, которому в качестве аргументов передается строка и число,
метод должен отпечатать в консоль указанную строку, указанное количество раз;
 */
public class Task_8 {

    public void printString() {
        /*Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите количество повторений строки: ");
        int num = scanner2.nextInt();*/
        String str = "Надо внести правки";
        int num = 10;
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
                  }
}
