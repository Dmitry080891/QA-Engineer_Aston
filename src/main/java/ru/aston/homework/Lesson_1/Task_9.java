package ru.aston.homework.Lesson_1;
/*
9. Напишите метод, который определяет, является ли год високосным,
и возвращает boolean (високосный - true, не високосный - false).
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
public class Task_9 {
    public boolean searchYear() {
        int year = 2024;
        boolean condition = (year % 4 == 0) ^ (year % 100 == 0) ^ (year % 400 == 0);
        System.out.println(condition);
        return condition;
    }

}
