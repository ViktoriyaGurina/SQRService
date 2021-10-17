package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"sumOfSquares,99,5"})
    void shouldSumOfSquares(String testName, int number, int expected) {
        SQRService service = new SQRService();

        //int number = 99;
        //int expected = 5;

        int actual = service.sumOfSquares(number);

        assertEquals(expected, actual);
    }
}