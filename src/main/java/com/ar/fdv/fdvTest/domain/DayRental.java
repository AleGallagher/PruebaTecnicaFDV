package com.ar.fdv.fdvTest.domain;


/**
 * Created by Ale on 11/10/2018.
 */
public class DayRental extends Rental {

    public static final double CHARGE = 20;

    private Integer countDays;

    public DayRental(Integer days) throws IllegalArgumentException{

        if (days < 1) {
            throw new IllegalArgumentException("the number of days have to be greater than 0");
        }
        this.countDays = days;
    }

    @Override
    public double calculateRent() {
        return this.getCountDays() * CHARGE;
    }

    public Integer getCountDays() {
        return countDays;
    }
}
