package ru.aston.homework.Lesson_1;

import java.util.Scanner;

/*
10. Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
public class Task_10 {
    public void changeNumber() {
        int [] task10 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Исходный массив: " );
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + task10[i]);
        }
        for (int i = 0; i < 10; i++) {
            if (task10[i] == 0) {task10[i] = 1;}
            else  {task10[i] = 0;}
        }
        System.out.println();
        System.out.println("Измененный массив: " );
        for (int i = 0; i < 10; i++) {System.out.print(" " + task10[i]);
        }
        System.out.println();
    }

}