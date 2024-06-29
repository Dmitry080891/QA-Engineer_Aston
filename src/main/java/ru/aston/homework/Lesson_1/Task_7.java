package ru.aston.homework.Lesson_1;

import java.util.Scanner;

/*
7. Напишите метод, которому в качестве параметра передается целое число.
Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
Замечание: ноль считаем положительным числом.
 */
public class Task_7 {

    public void definingBooleanNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        boolean condition = number < 0;
        if (condition) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
