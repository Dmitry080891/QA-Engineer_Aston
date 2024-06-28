package ru.aston.homework;

import java.util.Scanner;

public class Task_2 {

    public void checkSumSign() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int number1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите второе целое число: ");
        int number2 = scanner2.nextInt();
        if ((number1 + number2) >=0) {System.out.println("Сумма положительная = " + (number1 + number2));}
        else  {System.out.println("Сумма отрицательная = "+ (number1 + number2));}

    }
}