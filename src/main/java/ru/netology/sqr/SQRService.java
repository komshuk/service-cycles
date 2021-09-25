package ru.netology.sqr;

public class SQRService {

    public int range(int start, int and) {
        int counter = 0;
        for (int i = 10; i < 99; i++) {
            if (i * i >= start & i * i <= and) {
                counter++;
            }
        }
        return counter;
    }
}