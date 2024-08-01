package ru.aston.homework.lesson_5;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class HomeworkApplication {
    public static void main(String[] args) {
        SpringApplication.run(HomeworkApplication.class, args);
        WordCount wC = new WordCount();
        wC.wordsCount();
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "+79604329856");
        phoneBook.add("Петров", "+79898765651");
        phoneBook.add("Сидоров", "+79288905634");
        phoneBook.add("Иванов", "+79047658967");
        System.out.println("Телефоны для фамилии Иванов:");
        System.out.println(phoneBook.get("Иванов"));
    }
}
