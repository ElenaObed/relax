package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RelaxServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/money.csv")
    void testCalculate(int income, int expenses, int threshold, int expected) {
        RelaxService service = new RelaxService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}
