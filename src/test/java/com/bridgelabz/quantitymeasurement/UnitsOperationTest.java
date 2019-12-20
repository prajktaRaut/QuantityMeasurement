package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class UnitsOperationTest {

    @Test
    public void given1inchPlus1InchAnd2Inch_ShouldReturnEqualsTo4Inch() {
        UnitsOperation inchValue1 = new UnitsOperation(Units.INCH, 1.0);
        UnitsOperation inchValue2 = new UnitsOperation(Units.INCH, 1.0);
        double sumValue = inchValue1.unitsAdditionOperation(inchValue2);
        Assert.assertEquals(2.0,sumValue,0.0);
    }

    @Test
    public void given1InchPlus0Inch_ShouldReturnEqualTo1Inch() {
        UnitsOperation inchValue1 = new UnitsOperation(Units.INCH, 1.0);
        UnitsOperation inchValue2 = new UnitsOperation(Units.INCH, 0.0);
        double sumValue = inchValue1.unitsAdditionOperation(inchValue2);
        Assert.assertEquals(1.0,sumValue,0.0);
    }

    @Test
    public void given1FeetPlus1Cm_ShouldReturnEqualTo12dot4Inch() {
        UnitsOperation feetValue = new UnitsOperation(Units.FEET, 1.0);
        UnitsOperation centimeterValue = new UnitsOperation(Units.CENTIMETER, 1.0);
        double sumValue = feetValue.unitsAdditionOperation(centimeterValue);
        Assert.assertEquals(12.4,sumValue,0.0);
    }

    @Test
    public void given1YardPlus1Feet_ShouldReturn46Inch() {
        UnitsOperation yardValue = new UnitsOperation(Units.YARD, 1.0);
        UnitsOperation feetValue = new UnitsOperation(Units.FEET, 1.0);
        double sumValue = yardValue.unitsAdditionOperation(feetValue);
        Assert.assertEquals(48.0,sumValue,0.0);
    }

    @Test
    public void given1YardPlus1Inch_ShouldReturn37Inch() {
        UnitsOperation yardValue = new UnitsOperation(Units.YARD, 1.0);
        UnitsOperation inchValue = new UnitsOperation(Units.INCH, 1.0);
        double sumValue = yardValue.unitsAdditionOperation(inchValue);
        Assert.assertEquals(37.0,sumValue,0.0);
    }

    @Test
    public void given1YardPlus1Cm_ShouldReturn46Inch() {
        UnitsOperation yardValue = new UnitsOperation(Units.YARD, 1.0);
        UnitsOperation centimeterValue = new UnitsOperation(Units.CENTIMETER, 1.0);
        double sumValue = yardValue.unitsAdditionOperation(centimeterValue);
        Assert.assertEquals(36.4,sumValue,0.0);
    }

    @Test
    public void given1GallonPlus1Liter_ShouldReturn4dot77() {
        UnitsOperation gallonValue = new UnitsOperation(Units.GALLON, 1.0);
        UnitsOperation literValue = new UnitsOperation(Units.LITRE, 1.0);
        double sumValue = gallonValue.unitsAdditionOperation(literValue);
        Assert.assertEquals(4.77,sumValue,0.1);
    }
}
