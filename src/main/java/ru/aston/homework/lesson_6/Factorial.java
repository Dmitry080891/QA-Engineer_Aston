package ru.aston.homework.lesson_6;

public class Factorial  {
        public static int calculateFactorial(int number) throws FactorialException{
            if (number < 0) {
                throw new FactorialException();
            }
            else if (number == 0) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
}
