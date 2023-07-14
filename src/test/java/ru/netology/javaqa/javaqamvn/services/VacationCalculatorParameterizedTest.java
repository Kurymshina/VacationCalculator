package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationCalculatorParameterizedTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    public void testOfCount(int expected, int income, int expense, int threshold) {
        VacationCalculator service = new VacationCalculator();
        int actual = service.calculate(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }

}
