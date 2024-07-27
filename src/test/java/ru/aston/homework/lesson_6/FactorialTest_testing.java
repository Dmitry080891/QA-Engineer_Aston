package ru.aston.homework.lesson_6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest_testing {

    @Test
    public void FactorialTest_testing() throws FactorialException {
        Factorial calculator = new Factorial();

        Assert.assertEquals(Factorial.calculateFactorial(0), 1);
        Assert.assertEquals(Factorial.calculateFactorial(1), 1);
        Assert.assertEquals(Factorial.calculateFactorial(5), 120);
        Assert.assertEquals(Factorial.calculateFactorial(10), 3628800);
    }
}
