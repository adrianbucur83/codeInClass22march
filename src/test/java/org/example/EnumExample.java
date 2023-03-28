package org.example;

public class EnumExample {

    public static void main(String[] args) {

        for (Month month: Month.values()) {
            System.out.println(month.name() + " " + month.getNumberOfDays());
        }

        System.out.println(Month.IAN.name().equalsIgnoreCase("IAN"));

    }

}
