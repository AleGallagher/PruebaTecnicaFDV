package com.ar.fdv.fdvTest.domain;

/**
 * Created by Ale on 11/10/2018.
 */
public class HourRental extends Rental {

    public static final double CHARGE = 5;

    private Integer countHours;

    public HourRental(Integer hours) throws IllegalArgumentException {

        if (hours < 1) {
            throw new IllegalArgumentException("the number of hours have to be greater than 0");
        }

        this.countHours = hours;
    }

    @Override
    public double calculateRent() {
        return this.getCountHours() * CHARGE;
    }

    public Integer getCountHours() {
        return countHours;
    }
}
