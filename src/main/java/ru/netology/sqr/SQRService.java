package ru.netology.sqr;

public class SQRService {
    public int sumOfSquares(int number) {
        int counter = 0;
        int lowerBound = 300;
        int upperBound = 500;

        for (int i = 10; i <= number; i++) {
            if (i * i >= lowerBound & i * i <= upperBound) {
            counter++;
            }
        }
        return counter;
    }
}