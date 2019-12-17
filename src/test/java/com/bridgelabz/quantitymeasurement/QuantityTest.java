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
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Length inch = new Length(Length.Unit.INCH, 0.0);
        Assert.assertNotEquals(feet,inch);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldRetrunEqualLength() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Length inch = new Length(Length.Unit.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldNotReturnEqual() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Length inch = new Length(Length.Unit.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAndFeet_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_ShouldRetrunEqual() {
        Length inch = new Length(Length.Unit.INCH, 12.0);
        Length feet = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given10InchAnd1Feet_ShouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH, 10.0);
        Length feet = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldRetrunEqual() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenFeetNull_ShouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET,null);
        boolean result = feet.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void givenInchNull_ShouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH, null);
        boolean result = inch.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void givenUnitIsInvalid_ShouldReturnFalse() {
        Length invalidUnit = new Length(Length.Unit.INVALID_UNIT, 0.0);
        Length inch = new Length(Length.Unit.INCH, 0.0);
        boolean result = invalidUnit.compare(inch);
        Assert.assertFalse(result);
    }
}
