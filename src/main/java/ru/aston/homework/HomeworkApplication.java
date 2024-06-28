package ru.aston.homework;

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

    }
}