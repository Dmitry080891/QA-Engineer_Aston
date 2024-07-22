package ru.aston.homework.lesson_3.task1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeworkApplication.class, args);
        Dog dog = new Dog("Шарик");
        Cat cat = new Cat("Барсик");

        dog.run(400);
        dog.swim(5);

        cat.run(150);
        cat.swim(3);
        cat.eating(9);

        System.out.println("Всего животных: " + Animal.getCount());
    }

}
