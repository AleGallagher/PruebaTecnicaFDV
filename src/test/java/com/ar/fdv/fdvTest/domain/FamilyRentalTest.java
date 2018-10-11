package com.ar.fdv.fdvTest.domain;

import com.ar.fdv.fdvTest.exceptions.RentalException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by Ale on 11/10/2018.
 */
public class FamilyRentalTest {

    @Test
    public void whenCalculateTheRentOfFamilyRentalWithLessThan3RentalsShouldThrowAnException() {

        Rental rental = new DayRental(10);
        FamilyRental familyRental = new FamilyRental();
        familyRental.addRental(rental);

        try {
            familyRental.calculateRent();
            fail();
        } catch (RentalException e) {
            assertEquals("Invalid number of rentals", e.getMessage());
        }
    }

    @Test
    public void whenCalculateTheRentOfFamilyRentalWithMoreThan5RentalsShouldThrowAnException() {

        List<Rental> rentals = new ArrayList<Rental>();

        Rental rental1 = new DayRental(10);
        rentals.add(rental1);
        Rental rental2 = new DayRental(10);
        rentals.add(rental2);
        Rental rental3 = new DayRental(10);
        rentals.add(rental3);
        Rental rental4 = new DayRental(10);
        rentals.add(rental4);
        Rental rental5 = new DayRental(10);
        rentals.add(rental5);
        Rental rental6 = new DayRental(10);
        rentals.add(rental6);

        FamilyRental familyRental = new FamilyRental(rentals);

        try {
            familyRental.calculateRent();
            fail();
        } catch (RentalException e) {
            assertEquals("Invalid number of rentals", e.getMessage());
        }
    }

    @Test
    public void whenCalculateTheRentOfFamilyRentalWithTheCorrectNumberOfRentalsShouldReturnTheExpectedAmount() {

        List<Rental> rentals = new ArrayList<Rental>();
        double total = 0;
        try {

            Rental rental1 = new DayRental(10);
            total += rental1.calculateRent();

            Rental rental2 = new HourRental(3);
            total += rental2.calculateRent();

            Rental rental3 = new WeekRental(1);
            total += rental3.calculateRent();

            rentals.add(rental1);
            rentals.add(rental2);
            rentals.add(rental3);

            FamilyRental familyRental = new FamilyRental(rentals);

            assertEquals(total * 0.7, familyRental.calculateRent(), 0);
        } catch (RentalException e) {
            fail();
        }
    }
}
