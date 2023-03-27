package org.example;

public class DistanceUnit {
    public DistanceUnit(int sign, int distance, Unit unit) {
        this.sign = sign;
        this.distance = distance;
        this.unit = unit;
    }

    private int sign; // 1 or -1
    private int distance;
    private Unit unit;

    public int calculateValueInMm() {
        return distance * unit.multiplier * sign;
    }

    @Override
    public String toString() {
        String opSign = sign == 1 ? "+" : "-";
        return opSign + " " + distance + " " + unit.name().toLowerCase();
    }

}