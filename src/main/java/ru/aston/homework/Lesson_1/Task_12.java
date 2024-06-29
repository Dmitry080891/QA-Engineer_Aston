package ru.aston.homework.Lesson_1;
/*
12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
пройти по нему циклом, и числа меньшие 6 умножить на 2;
 */
public class Task_12 {

    public void  multiplies() {
        int [] task12 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Исходный массив: " );
        for (int i = 0; i < 12; i++) {
            System.out.print(" " + task12[i]);
        }
        for (int i = 0; i < 12; i++) {
            if (task12[i] < 6) {task12[i] = task12[i] *2;}
                    }
        System.out.println();
        System.out.print("Измененный массив: " );
        for (int i = 0; i < 12; i++) {System.out.print(" " + task12[i]);
        }
        System.out.println();
    }


}
