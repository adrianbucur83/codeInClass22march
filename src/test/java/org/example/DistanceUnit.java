package org.example;

public enum DistanceUnit {
    MILLIMETER("mm", 1),
    CENTIMETER("cm", 10),
    DECIMETER("dm", 100),
    METER("m", 1000),
    KILOMETER("km", 1000000);

    private final String abbreviation;
    private final int multiplier;

    DistanceUnit(String abbreviation, int multiplier) {
        this.abbreviation = abbreviation;
        this.multiplier = multiplier;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getMultiplier() {
        return multiplier;
    }

    @Override
    public String toString() {
        return abbreviation;
    }
}
