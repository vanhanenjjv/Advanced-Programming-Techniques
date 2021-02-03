package part_01;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Statistic {
    public static double sum(double[] values) {
        return Arrays.stream(values).sum();
    }

    public static double min(double[] values) throws NoSuchElementException {
        return Arrays.stream(values).min().getAsDouble();
    }

    public static double max(double[] values) throws NoSuchElementException {
        return Arrays.stream(values).max().getAsDouble();
    }

    public static double average(double[] values) throws NoSuchElementException {
        return Arrays.stream(values).average().getAsDouble();
    }
} 
