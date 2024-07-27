package ru.aston.homework.lesson_6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest_junit_5 {
    @DisplayName("Позитивный тест расчета факториала")
    @Test
    void testFactorial() throws FactorialException {
        assertEquals(120, Factorial.calculateFactorial(5));
        assertEquals(720, Factorial.calculateFactorial(6));
        assertEquals(1, Factorial.calculateFactorial(0));
           }
    @DisplayName("Негативный тест расчета факториала")
    @Test
    void testFactorialException() {
        FactorialException thrown = assertThrows(FactorialException.class, () -> Integer.parseInt("-1"),
                "Факториал не может быть расчитан от отрицательного числа");

        assertEquals("Факториал не может быть расчитан от отрицательного числа", thrown.getMessage());
    }
}