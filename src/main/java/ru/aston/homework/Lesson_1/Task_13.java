package ru.aston.homework.Lesson_1;
import java.util.Arrays;
/*
13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
 */
public class Task_13 {
    public void  diagonalArrey() {
        int a = 5;
        int [][] task13= new int [a][a];
        System.out.println("Исходный массив: " );
        for (int i = 0; i < a; i++) {
            for (int j =0; j < a; j++) {
                task13[i][j] = 0;
                System.out.print(" " + task13[i][j]);}
            System.out.println();
        }
            for (int i = 0; i < a; i++) {            // изменение главной диагонали
            for (int j =0; j < a; j++) {
            if (i == j) {task13[i][j] = 1;}}
        }
            for (int i = 0; i < a; i++) {          // изменение побочной диагонали
            for (int j =0; j < a; j++) {
                task13[i][a-1-i] = 1;}
        }
        System.out.println("Итоговый массив: " );
        System.out.println(Arrays.deepToString(task13));
    }
}
