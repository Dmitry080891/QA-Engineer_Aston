package ru.aston.homework.Lesson_1;

import java.util.Scanner;

/*
9. Напишите метод, который определяет, является ли год високосным,
и возвращает boolean (високосный - true, не високосный - false).
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
public class Task_9 {
    public void searchYear() {
        /*Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите год для определения: ");
        int year = scanner1.nextInt();*/
        int year = 2024;
        System.out.print("Год " + year + " является високосным? ");
        if ((year % 4 == 0) ^ (year % 100 == 0) ^ (year % 400 == 0)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
