package ua.project;

import java.util.stream.IntStream;

public class SumCalculator {

    public int sum(int n){
        if (n <= 0){
            throw new IllegalArgumentException("Illegal argument: " + n);
        }

        return IntStream
                .iterate(1, i -> i + 1)
                .limit(n)
                .sum();
    }
}
