package ru.aston.homework.lesson_3.task2;

public class Circle implements Calculation {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String getFillColor() {
        return fillColor;
    }
    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

