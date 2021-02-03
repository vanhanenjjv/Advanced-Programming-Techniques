package part_01;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class Application {
    public static void main(String[] args) {
        Map<String, Function<double[], Double>> operations = new HashMap<>();
        
        operations.put("Sum",     Statistic::sum);
        operations.put("Minimum", Statistic::min);
        operations.put("Maximum", Statistic::max);
        operations.put("Average", Statistic::average);

        double[] values = { 4, 8, 15, 16, 23, 42 };

        operations.forEach((name, operation) -> {
            try {
                double result = operation.apply(values);
                System.out.println("%s: %.2f".formatted(name, result));
            } catch (NoSuchElementException e) {
                System.out.println("Operation '%s' cannot be applied to an empty array.".formatted(name));
            }
        });
    }
}
