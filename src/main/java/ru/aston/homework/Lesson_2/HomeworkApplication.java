package ru.aston.homework.Lesson_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeworkApplication.class, args);
        Employee[] empsArray = new Employee[5];
        empsArray[0] = new Employee("Иванов", "Иван", "Иванович",
                "генеральный директор", "ivanov@gmail.com",
                89289289289L, 500000, 55);
        empsArray[1] = new Employee("Петров", "Пётр", "Петрович",
                "директор", "petrov@gmail.com",
                89049049049L, 150000, 45);
        empsArray[2] = new Employee("Макаров", "Макар", "Макарович",
                "бухгалтер", "makarov@gmail.com",
                89609609609L, 100000, 65);
        empsArray[3] = new Employee("Борисов", "Борис", "Борисович",
                "главный инженер", "borisov@gmail.com",
                89889889889L, 100000, 50);
        empsArray[4] = new Employee("Васькин", "Василий", "Висильевич",
                "работяга", "vasya@gmail.com",
                89189189189L, 15000, 35);
    }

}
