package ru.aston.homework.lesson_2;
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
    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public String getPost() {
        return post;
    }

    public String getEmail() {
        return email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }
   /* @Override
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
    }*/
}
