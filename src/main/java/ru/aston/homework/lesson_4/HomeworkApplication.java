package ru.aston.homework.lesson_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeworkApplication {
    public static void main(String[] args) {
       // SpringApplication.run(HomeworkApplication.class, args);
        String[][] array = {{"5", "22", "53", "41"},
                            {"55", "46", "75", "18"},
                            {"99", "g", "151", "112"},
                            {"33", "82", "78", "43"}};
        try {
            int result = SumArrayElements.sumArrayElements(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println(e);
        } catch (MyArrayDataException e) {
            System.out.println(e);
        }
    }

}


