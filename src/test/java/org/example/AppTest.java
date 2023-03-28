package org.example;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testCalculate() {
        String[] operators = {"+", "-"};
        DistanceUnit[] units = DistanceUnit.values();

        for (int i = 0; i < 100; i++) {
            StringBuilder expression = new StringBuilder();
            int result = 0;

            // Generate random expression
            for (int j = 0; j < 5; j++) {
                int value = ThreadLocalRandom.current().nextInt(1, 100);
                DistanceUnit unit = units[ThreadLocalRandom.current().nextInt(units.length)];
                int term = value * unit.getMultiplier();

                if (j > 0) {
                    // Add operator
                    String operator = operators[ThreadLocalRandom.current().nextInt(operators.length)];
                    expression.append(" ").append(operator).append(" ");
                    result += (operator.equals("+")) ? term : -term;
                } else {
                    result = term;
                }

                expression.append(value).append(" ").append(unit);
            }

            // Generate random output unit
            DistanceUnit outputUnit = units[ThreadLocalRandom.current().nextInt(units.length)];

            // Calculate expected result
            int expected = DistanceCalculator.convertFromLowestUnit(result, outputUnit.getAbbreviation());

            // Calculate actual result
            int actual = DistanceCalculator.calculate(expression.toString(), outputUnit.toString());

            System.out.println("Generated expression: " + expression);
            // Check result
           assertEquals(expected, actual, "Failed on expression: " + expression + " -> " + outputUnit);
        }
    }
}
