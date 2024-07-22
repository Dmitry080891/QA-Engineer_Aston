package ru.aston.homework.lesson_3.task2;

public class Rectangle implements Calculation {
    private double width;
    private double length;
    private String fillColor;
    private String borderColor;
    public Rectangle(double width, double length, String fillColor, String borderColor) {
        this.width = width;
        this.length = length;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (width + length);
    }
    @Override
    public double calculateArea() {
        return width * length;
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
