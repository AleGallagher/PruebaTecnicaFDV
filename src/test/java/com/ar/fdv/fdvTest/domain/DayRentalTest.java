package com.ar.fdv.fdvTest.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by Ale on 11/10/2018.
 */
public class DayRentalTest {

    @Test
    public void whenCreateADayRentalWithInvalidNumberOfDaysShouldThrowAnException() {
        try {
            DayRental dayRentail = new DayRental(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("the number of days have to be greater than 0", e.getMessage());
        }
    }

    @Test
    public void whenCreateADayRentalWitValidNumberOfDaysShouldCreateTheRental() {

        DayRental dayRental = new DayRental(3);
        assertEquals(Long.valueOf(3), Long.valueOf(dayRental.getCountDays()));
    }

    @Test
    public void whenCalculateTheRentOfDayRentalShouldReturnTheExpectedAmount() {

        DayRental dayRental = new DayRental(3);
        assertEquals(60, dayRental.calculateRent(), 0);
    }
}
