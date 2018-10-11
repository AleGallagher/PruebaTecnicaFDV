package com.ar.fdv.fdvTest.domain;

import com.ar.fdv.fdvTest.exceptions.RentalException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ale on 11/10/2018.
 */
public class FamilyRental extends Rental {

    public static final double DISCOUNT = 0.3;
    public static final Integer MIN_RENTAL = 3;
    public static final Integer MAX_RENTAL = 5;

    private List<Rental> rentals = new ArrayList<Rental>();

    public FamilyRental() {
    }

    public FamilyRental(List<Rental> rentals) {
        this.rentals = rentals;
    }

    @Override
    public double calculateRent() throws RentalException {

        if (this.getRentals().size() < MIN_RENTAL || this.getRentals().size() > MAX_RENTAL)
            throw new RentalException("Invalid number of rentals");

        double total = 0;

        for (Rental rental : this.getRentals()) {
            total += rental.calculateRent();
        }

        return total * (1 - DISCOUNT);
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
        this.getRentals().add(rental);
    }
}
