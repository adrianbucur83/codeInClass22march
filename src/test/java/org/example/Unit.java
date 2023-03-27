package org.example;

public enum Unit {

    MM(1), CM(10), DM(100), M(1000), KM(1000000);
    final int multiplier;

    Unit(int multiplier) {
        this.multiplier = multiplier;
    }
}
