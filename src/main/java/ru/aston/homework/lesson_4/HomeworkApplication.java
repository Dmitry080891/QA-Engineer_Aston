package ru.aston.homework.lesson_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeworkApplication.class, args);
        String[][] array = {{"5", "22", "53", "41"},
                            {"55", "46", "75", "18"},
                            {"99", "100", "151", "112"},
                            {"33", "82", "78", "43"}};
        try {
            int result = sumArrayElements(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива не соответствует 4x4");
        } catch (MyArrayDataException e) {
            System.out.println("Неверные данные в ячейке: " + e.getLine() + ", " + e.getColumn());
        }
    }
    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}


