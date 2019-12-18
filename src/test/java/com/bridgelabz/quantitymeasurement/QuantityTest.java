package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnFeet() {
        Length feet1 = new Length(Units.FEET,0.0);
        Length feet2= new Length(Units.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Units.FEET,0.0);
        Length feet2 = new Length(Units.FEET,1.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Units.INCH,0.0);
        Length inch2 = new Length(Units.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEquals() {
        Length inch1 = new Length(Units.INCH,0.0);
        Length inch2 = new Length(Units.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length feet = new Length(Units.FEET, 0.0);
        Length inch = new Length(Units.INCH, 0.0);
        Assert.assertNotEquals(feet,inch);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldRetrunEqualLength() {
        Length feet = new Length(Units.FEET, 0.0);
        Length inch = new Length(Units.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldNotReturnEqual() {
        Length feet = new Length(Units.FEET, 0.0);
        Length inch = new Length(Units.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAndFeet_ShouldReturnEqualLength() {
        Length feet1 = new Length(Units.FEET, 1.0);
        Length feet2 = new Length(Units.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_ShouldRetrunEqual() {
        Length inch = new Length(Units.INCH, 12.0);
        Length feet = new Length(Units.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given10InchAnd1Feet_ShouldReturnNotEqual() {
        Length inch = new Length(Units.INCH, 10.0);
        Length feet = new Length(Units.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldRetrunEqual() {
        Length feet = new Length(Units.FEET, 1.0);
        Length inch = new Length(Units.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenFeetNull_ShouldReturnFalse() {
        Length feet = new Length(Units.FEET,null);
        boolean result = feet.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void givenInchNull_ShouldReturnFalse() {
        Length inch = new Length(Units.INCH, null);
        boolean result = inch.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void givenBothFeet_HasSameReferance_ShouldReturnEquals() {
        Length length1 = new Length(Units.FEET, 0.0);
        Length length2 = new Length(Units.FEET, 0.0);
        Assert.assertEquals(length1,length2);
    }

    @Test
    public void givenDifferentUnits_HasDifferentReferance_ShouldReturnNotEquals() {
        Length length1 = new Length(Units.INCH, 0.0);
        Length length2 = new Length(Units.FEET, 0.0);
        Assert.assertNotEquals(length1,length2);
    }


    @Test
    public void givenBothInches_HasSameReferance_ShouldReturnEquals() {
        Length length1 = new Length(Units.INCH, 0.0);
        Length length2 = new Length(Units.INCH, 0.0);
        Assert.assertEquals(length1,length2);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnEqual() {
        Length yard = new Length(Units.YARD, 1.0);
        Length inch = new Length(Units.INCH, 36.0);
        boolean result = yard.compare(inch);
        Assert.assertTrue(result);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnEqual() {
        Length inch = new Length(Units.INCH, 36.0);
        Length yard = new Length(Units.YARD, 1.0);
        boolean result = inch.compare(yard);
        Assert.assertTrue(result);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnEqual() {
        Length yard = new Length(Units.YARD, 1.0);
        Length feet = new Length(Units.FEET, 3.0);
        boolean result = yard.compare(feet);
        Assert.assertTrue(result);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnEqual() {
        Length feet = new Length(Units.FEET, 3.0);
        Length yard = new Length(Units.YARD, 1.0);
        boolean result = feet.compare(yard);
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnNotEqual() {
        Length feet = new Length(Units.FEET, 1.0);
        Length yard = new Length(Units.YARD, 1.0);
        boolean result = feet.compare(yard);
        Assert.assertFalse(result);
    }

    @Test
    public void given1InchAnd1Yard_ShouldReturnNotEqual() {
        Length inch = new Length(Units.INCH, 1.0);
        Length yard = new Length(Units.YARD, 1.0);
        boolean result = inch.compare(yard);
        Assert.assertFalse(result);
    }
}
