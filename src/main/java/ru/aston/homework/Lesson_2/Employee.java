package ru.aston.homework.Lesson_2;
/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 */
public class Employee {
    private String lastName;
    private String name;
    private String patronimic;
    private String post;
    private String email;
    private Long phoneNumber;
    private Integer salary;
    private Integer age;


    public Employee(String lastName, String name, String patronimic,
                    String post, String email, Long phoneNumber,
                    Integer salary, Integer age) {
        this.lastName = lastName;
        this.name = name;
        this.patronimic = patronimic;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "ФИО " + lastName +
                " " + name +
                " " + patronimic +
                ", должность '" + post +
                ", email " + email +
                ", номер телефона " + phoneNumber +
                ", зарплата " + salary +
                ", возраст " + age +
                '.';
    }
}
