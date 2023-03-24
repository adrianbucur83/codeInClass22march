package org.example;

public enum Month {
    IAN(30), FEB(28), MAR(31);

    private final int numberOfDays;

    Month(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays(){
        return numberOfDays;
    }
}
