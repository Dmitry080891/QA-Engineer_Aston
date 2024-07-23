package ru.aston.homework.lesson_4;

public class MyArrayDataException extends Exception {
    private int line;
    private int column;
    public MyArrayDataException(int line, int column) {
        this.line = line;
        this.column = column;
    }
    public int getLine() {
        return line;
    }
    public int getColumn() {
        return column;
    }

}
