package ru.aston.homework.Lesson_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HomeworkApplication {
    public static void main(String[] args) {
        SpringApplication.run(HomeworkApplication.class, args);
        System.out.println("Задание № 1");
        Task_1 task1 = new Task_1();
        task1.printThreeWords();

        System.out.println("Задание № 2");
        Task_2 task2 = new Task_2();
        task2.checkSumSign();

        System.out.println("Задание № 3");
        Task_3 task3 = new Task_3();
        task3.printColor();

        System.out.println("Задание № 4");
        Task_4 task4 = new Task_4();
        task4.compareNumbers();

        System.out.println("Задание № 5");
        Task_5 task5 = new Task_5();
        task5.sumNumbers();

        System.out.println("Задание № 6");
        Task_6 task6 = new Task_6();
        task6.definingNumbers();

        System.out.println("Задание № 7");
        Task_7 task7 = new Task_7();
        task7.definingBooleanNumbers();

    }
}