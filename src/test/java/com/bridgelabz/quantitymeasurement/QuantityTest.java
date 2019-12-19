package com.bridgelabz.quantitymeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnFeet() {
        Quantity feet1 = new Quantity(Units.FEET,0.0);
        Quantity feet2= new Quantity(Units.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Quantity feet1 = new Quantity(Units.FEET,0.0);
        Quantity feet2 = new Quantity(Units.FEET,1.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Quantity inch1 = new Quantity(Units.INCH,0.0);
        Quantity inch2 = new Quantity(Units.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEquals() {
        Quantity inch1 = new Quantity(Units.INCH,0.0);
        Quantity inch2 = new Quantity(Units.INCH,1.0);
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Quantity feet = new Quantity(Units.FEET, 0.0);
        Quantity inch = new Quantity(Units.INCH, 0.0);
        Assert.assertNotEquals(feet,inch);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldRetrunEqualLength() {
        Quantity feet = new Quantity(Units.FEET, 0.0);
        Quantity inch = new Quantity(Units.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldNotReturnEqual() {
        Quantity feet = new Quantity(Units.FEET, 0.0);
        Quantity inch = new Quantity(Units.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAndFeet_ShouldReturnEqualLength() {
        Quantity feet1 = new Quantity(Units.FEET, 1.0);
        Quantity feet2 = new Quantity(Units.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_ShouldRetrunEqual() {
        Quantity inch = new Quantity(Units.INCH, 12.0);
        Quantity feet = new Quantity(Units.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given10InchAnd1Feet_ShouldReturnNotEqual() {
        Quantity inch = new Quantity(Units.INCH, 10.0);
        Quantity feet = new Quantity(Units.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldRetrunEqual() {
        Quantity feet = new Quantity(Units.FEET, 1.0);
        Quantity inch = new Quantity(Units.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenFeetNull_ShouldReturnFalse() {
        Quantity feet = new Quantity(Units.FEET,null);
        boolean result = feet.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void givenInchNull_ShouldReturnFalse() {
        Quantity inch = new Quantity(Units.INCH, null);
        boolean result = inch.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void givenBothFeet_HasSameReferance_ShouldReturnEquals() {
        Quantity quantity1 = new Quantity(Units.FEET, 0.0);
        Quantity quantity2 = new Quantity(Units.FEET, 0.0);
        Assert.assertEquals(quantity1, quantity2);
    }

    @Test
    public void givenDifferentUnits_HasDifferentReferance_ShouldReturnNotEquals() {
        Quantity quantity1 = new Quantity(Units.INCH, 0.0);
        Quantity quantity2 = new Quantity(Units.FEET, 0.0);
        Assert.assertNotEquals(quantity1, quantity2);
    }


    @Test
    public void givenBothInches_HasSameReferance_ShouldReturnEquals() {
        Quantity quantity1 = new Quantity(Units.INCH, 0.0);
        Quantity quantity2 = new Quantity(Units.INCH, 0.0);
        Assert.assertEquals(quantity1, quantity2);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnEqual() {
        Quantity yard = new Quantity(Units.YARD, 1.0);
        Quantity inch = new Quantity(Units.INCH, 36.0);
        boolean result = yard.compare(inch);
        Assert.assertTrue(result);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnEqual() {
        Quantity inch = new Quantity(Units.INCH, 36.0);
        Quantity yard = new Quantity(Units.YARD, 1.0);
        boolean result = inch.compare(yard);
        Assert.assertTrue(result);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnEqual() {
        Quantity yard = new Quantity(Units.YARD, 1.0);
        Quantity feet = new Quantity(Units.FEET, 3.0);
        boolean result = yard.compare(feet);
        Assert.assertTrue(result);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnEqual() {
        Quantity feet = new Quantity(Units.FEET, 3.0);
        Quantity yard = new Quantity(Units.YARD, 1.0);
        boolean result = feet.compare(yard);
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnNotEqual() {
        Quantity feet = new Quantity(Units.FEET, 1.0);
        Quantity yard = new Quantity(Units.YARD, 1.0);
        boolean result = feet.compare(yard);
        Assert.assertFalse(result);
    }

    @Test
    public void given1InchAnd1Yard_ShouldReturnNotEqual() {
        Quantity inch = new Quantity(Units.INCH, 1.0);
        Quantity yard = new Quantity(Units.YARD, 1.0);
        boolean result = inch.compare(yard);
        Assert.assertFalse(result);
    }

    @Test
    public void given2InchAnd5Cm_ShouldReturnEqual() {
        Quantity inch= new Quantity(Units.INCH, 3.0);
        Quantity centimeter = new Quantity(Units.CENTIMETER, 7.5);
        boolean result = inch.compare(centimeter);
        Assert.assertTrue(result);
    }

    @Test
    public void given2inchPlus2InchAnd4Inch_ShouldReturnEqualsTo4Inch() {
        Quantity inchValue1 = new Quantity(Units.INCH, 2.0);
        Quantity inchValue2 = new Quantity(Units.INCH, 2.0);
        Quantity inchValue3 = new Quantity(Units.INCH, 4.0);
        double sumValue = inchValue1.unitsAddition(inchValue2);
        boolean result = inchValue3.compare(new Quantity(Units.INCH, sumValue));
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetAnd2Inch_ShouldReturnEqaulsTo14Inch() {
        Quantity feetValue = new Quantity(Units.FEET, 1.0);
        Quantity inchValue1 = new Quantity(Units.INCH, 2.0);
        Quantity inchValue2 = new Quantity(Units.INCH, 14.0);
        double sumValue = feetValue.unitsAddition(inchValue1);
        boolean result = inchValue2.compare(new Quantity(Units.INCH, sumValue));
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqaulsTo24Inch() {
        Quantity feetValue1 = new Quantity(Units.FEET, 1.0);
        Quantity feetValue2 = new Quantity(Units.FEET, 1.0);
        Quantity inchValue = new Quantity(Units.INCH, 24.0);
        double sumValue = feetValue1.unitsAddition(feetValue2);
        boolean result = inchValue.compare(new Quantity(Units.INCH, sumValue));
        Assert.assertTrue(result);
    }

    @Test
    public void given2InchAnd2dot5cm_ShouldReturnEqaulsTo3Inch() {
        Quantity inchValue1 = new Quantity(Units.INCH, 2.0);
        Quantity centimeterValue = new Quantity(Units.CENTIMETER, 2.5);
        Quantity inchValue2 = new Quantity(Units.INCH, 3.0);
        double sumValue = inchValue1.unitsAddition(centimeterValue);
        boolean result = inchValue2.compare(new Quantity(Units.INCH, sumValue));
        Assert.assertTrue(result);
    }

    @Test
    public void given1LitreAnd1Litre_ShouldReturnEquals() {
        Quantity liter1 = new Quantity(Units.LITRE, 1.0);
        Quantity litre2 = new Quantity(Units.LITRE, 1.0);
        boolean result = liter1.compare(litre2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1LitreAnd1000Mililiter_ShouldReturnEquals() {
        Quantity liter = new Quantity(Units.LITRE, 1.0);
        Quantity miliLiter = new Quantity(Units.MILLILITER, 1000.0);
        boolean result = liter.compare(miliLiter);
        Assert.assertTrue(result);
    }

    @Test
    public void given1GallonAnd3dot78Litre_ShouldReturnEquals() {
        Quantity gallon = new Quantity(Units.GALLON, 1.0);
        Quantity liter = new Quantity(Units.LITRE, 3.78);
        boolean result = gallon.compare(liter);
        Assert.assertTrue(result);
    }

    @Test
    public void given1GallonAnd3dot78liter_ShouldReturnEqaulsTo7dot57liters() {
        Quantity gallonValue = new Quantity(Units.GALLON, 1.0);
        Quantity literValue1 = new Quantity(Units.LITRE, 3.78);
        double sumValue = gallonValue.unitsAddition(literValue1);
        Assert.assertEquals(7.57,sumValue,0.1);
    }

    @Test
    public void given1LiterAnd1000ml_ShouldReturnEqualsTo2Liters() {
        Quantity literValue1 = new Quantity(Units.LITRE, 1.0);
        Quantity milliliterValue = new Quantity(Units.MILLILITER, 1000.0);
        Quantity literValue2 = new Quantity(Units.LITRE, 2.0);
        double sumValue = literValue1.unitsAddition(milliliterValue);
        boolean result = literValue2.compare(new Quantity(Units.LITRE, sumValue));
        Assert.assertTrue(result);
    }
}
