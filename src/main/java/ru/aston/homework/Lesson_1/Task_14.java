package ru.aston.homework.Lesson_1;

import java.util.Scanner;

/*
14. Написать метод, принимающий на вход два аргумента: len и initialValue,
и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
 */
public class Task_14 {
    public void  inputArrey() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите длину одномерного массива: ");
        int len = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Все ячейки которого заполнены цифрой: ");
        int initialValue = scanner2.nextInt();

        int [] task14= new int [len];
        System.out.print("Итоговый массив: " );
        for (int i = 0; i < len; i++) {
            task14[i] = initialValue;
            System.out.print(" " + task14[i]);
        }
    }
}
