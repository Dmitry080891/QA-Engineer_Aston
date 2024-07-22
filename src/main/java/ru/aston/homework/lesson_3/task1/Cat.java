package ru.aston.homework.lesson_3.task1;

public class Cat extends Animal {
    private static int dish = 10;
    private boolean satiety;
    public Cat(String name) {
        super(name, 200, 0);
    }
    public void eating(int food) {
        if (food > 0 && food <= dish) {
            satiety = true;
            System.out.println(name + " сыт - " + satiety);
        } else {
            System.out.println(name + " голоден - " + satiety);
        }
    }
}
