package ru.aston.homework.lesson_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeworkApplication {

    public static void main(String[] args) {
       // SpringApplication.run(HomeworkApplication.class, args);
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
        System.out.println("Список сотрудников: " );
        for (Employee employes : empsArray) {
            System.out.println("Сотрудник: " +
                    "ФИО " + employes.getLastName() +
                    " " + employes.getName() +
                    " " + employes.getPatronimic() +
                    ", должность " + employes.getPost() +
                    ", email " + employes.getEmail() +
                    ", номер телефона " + employes.getPhoneNumber() +
                    ", зарплата " + employes.getSalary() +
                    ", возраст " + employes.getAge() +
                    '.');
                   }
        Park park = new Park("Парк Победы");
        Park.Attraction[] attractions = new Park.Attraction[3];
        attractions[0] = park.new Attraction("Карусель", "10:00 - 18:00", 300);
        attractions[1] = park.new Attraction("Колесо обозрения", "11:00 - 19:00", 500);
        attractions[2] = park.new Attraction("Автодром", "12:00 - 20:00", 300);
        for (Park.Attraction attraction : attractions) {
            System.out.println("Аттракцион - " + attraction.getNameAttraction() + ", расположен в " + park.getNamePark() +
                    "; время работы: " + attraction.getTimeWork() + "; стоимость 1 билета: " + attraction.getPrice());
        }
    }
}
