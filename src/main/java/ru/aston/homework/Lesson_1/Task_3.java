package ru.aston.homework.Lesson_1;

/*
3. Создайте метод printColor() в теле которого задайте int переменную value
и инициализируйте ее любым значением. Если value меньше 0 (0 включительно),
то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно)
до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
 */

import java.util.Scanner;

public class Task_3 {

    public void printColor() {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");
        int value = scanner.nextInt();*/
        int value = 0;
        if (value <=0) {System.out.println("Красный");}
        else if (value > 100) { System.out.println("Зеленый"); }
        else  {System.out.println("Желтый");}

    }

}
