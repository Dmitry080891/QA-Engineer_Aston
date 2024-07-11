package ru.aston.homework.Lesson_1;

import java.util.Arrays;

/*
12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
пройти по нему циклом, и числа меньшие 6 умножить на 2;
 */
public class Task_12 {

    public void  multiplies() {
        int [] task12 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Исходный массив: " );
        System.out.println(Arrays.toString(task12));
        for (int i = 0; i < task12.length; i++) {
            if (task12[i] < 6) {task12[i] = task12[i] *2;}
                    }
        System.out.print("Измененный массив: " );
        System.out.println(Arrays.toString(task12));
      }
}
