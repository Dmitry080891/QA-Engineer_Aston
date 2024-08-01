package ru.aston.homework.Lesson_1;
/*
14. Написать метод, принимающий на вход два аргумента: len и initialValue,
и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
 */
public class Task_14 {

    public void  inputArrey(int len, int initialValue) {
        int [] task14= new int [len];
        System.out.print("Итоговый массив: " );
        for (int i = 0; i < len; i++) {
            task14[i] = initialValue;
            System.out.print(" " + task14[i]);
        }
    }
}
