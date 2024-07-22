package ru.aston.homework.lesson_3.task2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.aston.homework.lesson_3.task1.Animal;
import ru.aston.homework.lesson_3.task1.Cat;
import ru.aston.homework.lesson_3.task1.Dog;

@SpringBootApplication
public class HomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeworkApplication.class, args);
        Circle circle = new Circle(3, "Белый", "Синий");
        Rectangle rectangle = new Rectangle(2, 4, "Красный", "Черный");
        Triangle triangle = new Triangle(3, 4, 3, "Зеленый", "Желтый");

        System.out.println("Периметр круга: " + circle.calculatePerimeter() + "\n" +
                "Площадь круга: " + circle.calculateArea() + "\n" +
                "Цвет фона круга: " + circle.getFillColor()+ "\n" +
                "Цвет границ круга: " + circle.getBorderColor());

        System.out.println("Периметр квадрата: " + rectangle.calculatePerimeter() + "\n" +
                "Площадь квадрата: " + rectangle.calculateArea() + "\n" +
                "Цвет фона квадрата: " + rectangle.getFillColor()+ "\n" +
                "Цвет границ квадрата: " + rectangle.getBorderColor());

        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter() + "\n" +
                "Площадь треугольника: " + triangle.calculateArea() + "\n" +
                "Цвет фона треугольника: " + triangle.getFillColor()+ "\n" +
                "Цвет границ треугольника: " + triangle.getBorderColor());
            }
}
