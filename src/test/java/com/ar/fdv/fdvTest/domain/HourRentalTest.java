package com.ar.fdv.fdvTest.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ale on 11/10/2018.
 */
public class HourRentalTest {

    @Test
    public void whenCreateHourRentalWithInvalidNumberOfHoursShouldThrowAnException() {
        try {
            HourRental hourRental = new HourRental(0);
        } catch (IllegalArgumentException e) {
            assertEquals("the number of hours have to be greater than 0", e.getMessage());
        }
    }

    @Test
    public void whenCreateHourRentalWitValidNumberOfHoursShouldCreateTheRental() {

        HourRental hourRental = new HourRental(3);
        assertEquals(Long.valueOf(3), Long.valueOf(hourRental.getCountHours()));
    }

    @Test
    public void whenCalculateTheRentOfHourRentalShouldReturnTheExpectedAmount() {

        HourRental hourRental = new HourRental(3);
        assertEquals(15, hourRental.calculateRent(), 0);
    }
}
