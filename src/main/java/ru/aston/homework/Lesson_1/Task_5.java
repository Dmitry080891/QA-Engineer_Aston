package ru.aston.homework.Lesson_1;

import java.util.Scanner;

/*
5. Напишите метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
в противном случае – false.
 */
public class Task_5 {
    public void sumNumbers() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int number1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите второе целое число: ");
        int number2 = scanner2.nextInt();
        int sum = number1 + number2;
        boolean condition1 = sum >= 10;
        boolean condition2 = sum <= 20;
        if (condition1 && condition2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}