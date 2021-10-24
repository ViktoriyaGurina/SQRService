package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"sumOfSquares,3"})
    void shouldSumOfSquares(String testName, int expected) {
        SQRService service = new SQRService();

        //int number = 99;
        //int expected = 5;

        int actual = service.sumOfSquares(200, 300);

        assertEquals(expected, actual);
    }
}