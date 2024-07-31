package ru.aston.homework.lesson_4;

public class SumArrayElements {
    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива не соответствует 4x4");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("неверные данные в строке " + (i+1) + " колонке " + (j+1));
                }
            }
        }
        return sum;
    }
}
