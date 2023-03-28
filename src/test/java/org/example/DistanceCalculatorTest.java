package org.example;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DistanceCalculatorTest {
    Random random = new Random();
    DistanceCalculator distanceCalculator = new DistanceCalculator();
    @Test
    void givenRandomExpressionShouldCalculateCorrectValue() {
        String expressionToTest = "10 cm + 20 mm";
        int expressionValue = 0;
        for (int i = 0; i < 30 ; i++) {
            int randomSign = random.nextBoolean() ? -1 : 1;
            int randomDistance = random.nextInt(0, 30);
            int randomUnitIndex = random.nextInt(0, 4);
            Unit unit = Unit.values()[randomUnitIndex];
            DistanceUnit distanceUnit = new DistanceUnit(randomSign, randomDistance, unit);
            expressionToTest += distanceUnit.toString() + " ";
            expressionValue += distanceUnit.calculateValueInMm();
        }
        System.out.println(expressionToTest);
        assertEquals(expressionValue, DistanceCalculator.calculate(expressionToTest, "mm"));
    }




}