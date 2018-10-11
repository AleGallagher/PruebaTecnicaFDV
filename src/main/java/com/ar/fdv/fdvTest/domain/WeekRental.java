package com.ar.fdv.fdvTest.domain;

/**
 * Created by Ale on 11/10/2018.
 */
public class WeekRental extends Rental {

    public static final double CHARGE = 60;

    private Integer countWeeks;

    public WeekRental(Integer weeks) throws IllegalArgumentException{

        if (weeks < 1) {
            throw new IllegalArgumentException("the number of weeks have to be greater than 0");
        }

        this.countWeeks = weeks;
    }

    @Override
    public double calculateRent() {
        return this.getCountWeeks() * CHARGE;
    }

    public Integer getCountWeeks() {
        return countWeeks;
    }
}
