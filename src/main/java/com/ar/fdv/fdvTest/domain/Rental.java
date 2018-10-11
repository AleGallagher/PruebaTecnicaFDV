package com.ar.fdv.fdvTest.domain;

import com.ar.fdv.fdvTest.exceptions.RentalException;

/**
 * Created by Ale on 11/10/2018.
 */
public abstract class Rental {

    public abstract double calculateRent() throws RentalException;

}
