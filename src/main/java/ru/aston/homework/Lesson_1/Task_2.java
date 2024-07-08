package ru.aston.homework.Lesson_1;

import java.util.Scanner;

/*
2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
 и инициализируйте их любыми значениями, которыми захотите. Далее метод должен
 просуммировать эти переменные, и если их сумма больше или равна 0,
то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
 */
public class Task_2 {

    public void checkSumSign() {
        /*Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int number1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите второе целое число: ");
        int number2 = scanner2.nextInt();*/
        int number1 = -25;
        int number2 = 34;
        if ((number1 + number2) >=0) {System.out.println("Сумма положительная = " + (number1 + number2));}
        else  {System.out.println("Сумма отрицательная = "+ (number1 + number2));}

    }
}