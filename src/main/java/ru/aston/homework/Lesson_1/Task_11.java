package ru.aston.homework.Lesson_1;
/*
11. Задать пустой целочисленный массив длиной 100.
С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
 */
public class Task_11 {
    public void inputNumber() {
        int [] arrayNew = new int[100];
        int a = 1;
        System.out.print("Заполненный массив: " );
        for (int i = 0; i < 100; i++) {
            arrayNew[i] = a;
            System.out.print(" " + arrayNew[i]);
            a++;
        }
    }
}
