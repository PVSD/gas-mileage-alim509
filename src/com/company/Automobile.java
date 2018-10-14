package com.company;

/**
 * Created by dpennebacker on 10/9/16.
 */
public class Automobile {

    double gasMilage;
    double gallons;
    double gas;

    public Automobile (double mpg) {
        gasMilage = mpg;
        gallons = 0;
    }

    public double fillUp(double fill) {
        gas = gallons + fill;
        return gas;
    }

    public double takeTrip(double miles) {
        gas -= miles / gasMilage;
        return gas;
    }

    public double reportFuel() {
        return gas;
    }

}
