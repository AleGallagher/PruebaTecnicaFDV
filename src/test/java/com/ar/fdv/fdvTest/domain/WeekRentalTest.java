package com.ar.fdv.fdvTest.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ale on 11/10/2018.
 */
public class WeekRentalTest {

    @Test
    public void whenCreateWeekRentalWithInvalidNumberOfHoursShouldThrowAnException() {
        try {
            WeekRental weekRental = new WeekRental(0);
        } catch (IllegalArgumentException e) {
            assertEquals("the number of weeks have to be greater than 0", e.getMessage());
        }
    }

    @Test
    public void whenCreateWeekRentalWitValidNumberOfHoursShouldCreateTheRental() {

        WeekRental weekRental = new WeekRental(3);
        assertEquals(Long.valueOf(3), Long.valueOf(weekRental.getCountWeeks()));
    }

    @Test
    public void whenCalculateTheRentOfWeekRentalShouldReturnTheExpectedAmount() {

        WeekRental weekRental = new WeekRental(3);
        assertEquals(180, weekRental.calculateRent(), 0);
    }
}
