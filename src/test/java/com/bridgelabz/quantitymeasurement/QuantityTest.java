package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnFeet() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2= new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEquals() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Assert.assertNotEquals(feet,inch);
    }
}
