package ru.aston.homework.lesson_3.task1;

public class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    private static int count = 0;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        count++;
    }
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать такое расстояние");
        }
    }

    public void swim(int distance) {
        if (swimLimit == 0) {
            System.out.println(name + " не умеет плавать");
        } else if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " метров");
        } else {
            System.out.println(name + " не может проплыть такое расстояние");
        }
    }

    public static int getCount() {
        return count;
    }
    }
