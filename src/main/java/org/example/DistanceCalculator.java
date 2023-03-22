package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DistanceCalculator {
    private static final Map<String, Integer> UNIT_FACTORS = new HashMap<>() {{
        put("mm", 1);
        put("cm", 10);
        put("dm", 100);
        put("m", 1000);
        put("km", 1000000);
    }};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter expression (e.g. 10 cm + 1 m - 10 mm): ");
        String expression = scanner.nextLine();

        System.out.print("Enter output unit (e.g. mm, cm, m, km): ");
        String outputUnit = scanner.nextLine();

        int result = calculate(expression, outputUnit);

        System.out.println(result + " " + outputUnit);
    }

    public static int calculate(String expression, String outputUnit) {
        String[] tokens = expression.split(" ");
        int result = 0;
        int sign = 1;
        String currentUnit = "";

        for (String token : tokens) {
            if (token.equals("+")) {
                sign = 1;
            } else if (token.equals("-")) {
                sign = -1;
            } else if (UNIT_FACTORS.containsKey(token)) {
                int value = Integer.parseInt(currentUnit) * sign;
                result += convertToLowestUnit(value, currentUnit);
                currentUnit = "";
            } else {
                currentUnit += token;
            }
        }

        int value = Integer.parseInt(currentUnit) * sign;
        result += convertToLowestUnit(value, currentUnit);

        return convertFromLowestUnit(result, outputUnit);
    }

    private static int convertToLowestUnit(int value, String unit) {
        int factor = UNIT_FACTORS.get(unit);
        return value * factor;
    }

    private static int convertFromLowestUnit(int value, String unit) {
        int factor = UNIT_FACTORS.get(unit);
        return value / factor;
    }
}