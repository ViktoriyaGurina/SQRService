package ru.netology.sqr;

public class SQRService {
    public int sumOfSquares(int lowerBound, int upperBound) {
        int counter = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerBound & i * i <= upperBound) {
                counter++;
            }
        }
        return counter;
    }
}