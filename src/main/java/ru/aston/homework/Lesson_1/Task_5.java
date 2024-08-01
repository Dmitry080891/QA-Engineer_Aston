package ru.aston.homework.Lesson_1;
/*
5. Напишите метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
в противном случае – false.
 */
public class Task_5 {

    public boolean sumNumbers(int number1, int number2) {
         return (number1 + number2) >= 10 && (number1 + number2) <= 20;
    }
}