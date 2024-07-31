package ru.aston.homework.Lesson_1;

import java.util.Scanner;

/*
5. Напишите метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
в противном случае – false.
 */
public class Task_5 {

    public boolean sumNumbers(int number1, int number2) {
     /*   Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int number1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите второе целое число: ");
        int number2 = scanner2.nextInt();*/
        return (number1 + number2) >= 10 && (number1 + number2) <= 20;
       /* int sum = number1 + number2;
        boolean condition = sum >= 10 && sum <= 20;
        System.out.println(condition);
        return condition;*/
    }
}