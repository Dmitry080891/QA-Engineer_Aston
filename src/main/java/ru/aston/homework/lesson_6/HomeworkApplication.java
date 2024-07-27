package ru.aston.homework.lesson_6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeworkApplication.class, args);
        try {
            int number = 3;
            Factorial factorial = new Factorial();
            System.out.println("Факториал числа " + number + " равен " + factorial.calculateFactorial(number));
        } catch (FactorialException e) {
            System.out.println("Факториал не может быть расчитан от отрицательного числа");
        }
    }
}
