package ru.aston.homework.Lesson_1;
/*
6. Напишите метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль, положительное ли число передали или отрицательное.
Замечание: ноль считаем положительным числом.
 */
public class Task_6 {

    public void definingNumbers(int number) {
        if (number >= 0 ) {System.out.println("Число "+ number + " является положительным.");}
        else  {System.out.println("Число "+ number + " является отрицательным.");}
    }
}
