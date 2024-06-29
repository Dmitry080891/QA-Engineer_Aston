package ru.aston.homework.Lesson_1;

import java.util.Scanner;

/*
4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b,
то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
 */
public class Task_4 {

    public void compareNumbers() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите переменную a (целое число): ");
        int a = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите переменную b (целое число): ");
        int b = scanner2.nextInt();
        if (a >= b ) {System.out.println("a >= b");}
        else  {System.out.println("a < b");}

    }

}
