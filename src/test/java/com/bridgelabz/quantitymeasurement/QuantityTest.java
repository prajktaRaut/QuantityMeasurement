package com.bridgelabz.quantitymeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnFeet() {
        Quantity feetValue1 = new Quantity(Units.FEET,0.0);
        Quantity feetValue2= new Quantity(Units.FEET,0.0);
        Assert.assertEquals(feetValue1,feetValue2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Quantity feetValue1 = new Quantity(Units.FEET,0.0);
        Quantity feetValue2 = new Quantity(Units.FEET,1.0);
        boolean equals = feetValue1.equals(feetValue2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Quantity inchValue1 = new Quantity(Units.INCH,0.0);
        Quantity inchValue2 = new Quantity(Units.INCH,0.0);
        Assert.assertEquals(inchValue1,inchValue2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEquals() {
        Quantity inchValue1 = new Quantity(Units.INCH,0.0);
        Quantity inchValue2 = new Quantity(Units.INCH,1.0);
        Assert.assertNotEquals(inchValue1,inchValue2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Quantity feetValue = new Quantity(Units.FEET, 0.0);
        Quantity inchValue = new Quantity(Units.INCH, 0.0);
        Assert.assertNotEquals(feetValue,inchValue);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldRetrunEqualLength() {
        Quantity feetValue = new Quantity(Units.FEET, 0.0);
        Quantity inchValue = new Quantity(Units.INCH, 0.0);
        boolean compareCheck = feetValue.compare(inchValue,Units.INCH);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldNotReturnEqual() {
        Quantity feetValue = new Quantity(Units.FEET, 0.0);
        Quantity inchValue = new Quantity(Units.INCH, 0.0);
        boolean compareCheck = feetValue.compare(inchValue,Units.INCH);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAndFeet_ShouldReturnEqualLength() {
        Quantity feetValue1 = new Quantity(Units.FEET, 1.0);
        Quantity feetValue2 = new Quantity(Units.FEET, 1.0);
        boolean compareCheck = feetValue1.compare(feetValue2,Units.INCH);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_ShouldRetrunEqual() {
        Quantity inchValue = new Quantity(Units.INCH, 12.0);
        Quantity feetValue = new Quantity(Units.FEET, 1.0);
        boolean compareCheck = inchValue.compare(feetValue,Units.INCH);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given10InchAnd1Feet_ShouldReturnNotEqual() {
        Quantity inchValue = new Quantity(Units.INCH, 10.0);
        Quantity feetValue = new Quantity(Units.FEET, 1.0);
        boolean compareCheck = inchValue.compare(feetValue,Units.INCH);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldRetrunEqual() {
        Quantity feetValue = new Quantity(Units.FEET, 1.0);
        Quantity inchValue = new Quantity(Units.INCH, 12.0);
        boolean compareCheck = feetValue.compare(inchValue,Units.INCH);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenFeetNull_ShouldReturnFalse() {
        Quantity feetValue = new Quantity(Units.FEET,null);
        boolean result = feetValue.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void givenInchNull_ShouldReturnFalse() {
        Quantity inchValue = new Quantity(Units.INCH, null);
        boolean result = inchValue.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void givenBothFeet_HasSameReferance_ShouldReturnEquals() {
        Quantity feetValue1 = new Quantity(Units.FEET, 0.0);
        Quantity feetValue2 = new Quantity(Units.FEET, 0.0);
        Assert.assertEquals(feetValue1, feetValue2);
    }

    @Test
    public void givenDifferentUnits_HasDifferentReferance_ShouldReturnNotEquals() {
        Quantity inchValue = new Quantity(Units.INCH, 0.0);
        Quantity feetValue = new Quantity(Units.FEET, 0.0);
        Assert.assertNotEquals(inchValue, feetValue);
    }

    @Test
    public void givenBothInches_HasSameReferance_ShouldReturnEquals() {
        Quantity inchValue1 = new Quantity(Units.INCH, 0.0);
        Quantity inchValue2 = new Quantity(Units.INCH, 0.0);
        Assert.assertEquals(inchValue1, inchValue2);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnEqual() {
        Quantity yardValue = new Quantity(Units.YARD, 1.0);
        Quantity inchValue = new Quantity(Units.INCH, 36.0);
        boolean result = yardValue.compare(inchValue,Units.INCH);
        Assert.assertTrue(result);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnEqual() {
        Quantity inchValue = new Quantity(Units.INCH, 36.0);
        Quantity yardValue = new Quantity(Units.YARD, 1.0);
        boolean result = inchValue.compare(yardValue,Units.YARD);
        Assert.assertTrue(result);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnEqual() {
        Quantity yardValue = new Quantity(Units.YARD, 1.0);
        Quantity feetValue = new Quantity(Units.FEET, 3.0);
        boolean result = yardValue.compare(feetValue,Units.YARD);
        Assert.assertTrue(result);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnEqual() {
        Quantity feetValue = new Quantity(Units.FEET, 3.0);
        Quantity yardValue = new Quantity(Units.YARD, 1.0);
        boolean result = feetValue.compare(yardValue,Units.YARD);
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnNotEqual() {
        Quantity feetValue = new Quantity(Units.FEET, 1.0);
        Quantity yardValue = new Quantity(Units.YARD, 1.0);
        boolean result = feetValue.compare(yardValue,Units.YARD);
        Assert.assertFalse(result);
    }

    @Test
    public void given1InchAnd1Yard_ShouldReturnNotEqual() {
        Quantity inchValue = new Quantity(Units.INCH, 1.0);
        Quantity yardValue = new Quantity(Units.YARD, 1.0);
        boolean result = inchValue.compare(yardValue,Units.YARD);
        Assert.assertFalse(result);
    }

    @Test
    public void given2InchAnd5Cm_ShouldReturnEqual() {
        Quantity inchValue = new Quantity(Units.INCH, 3.0);
        Quantity centimeterValue = new Quantity(Units.CENTIMETER, 7.5);
        boolean result = inchValue.compare(centimeterValue,Units.CENTIMETER);
        Assert.assertTrue(result);
    }

    @Test
    public void given2inchPlus2InchAnd4Inch_ShouldReturnEqualsTo4Inch() {
        Quantity inchValue1 = new Quantity(Units.INCH, 2.0);
        Quantity inchValue2 = new Quantity(Units.INCH, 2.0);
        Quantity inchValue3 = new Quantity(Units.INCH, 4.0);
        double sumValue = inchValue1.unitsAddition(inchValue2);
        boolean result = inchValue3.compare(new Quantity(Units.INCH, sumValue),Units.INCH);
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetAnd2Inch_ShouldReturnEqaulsTo14Inch() {
        Quantity feetValue = new Quantity(Units.FEET, 1.0);
        Quantity inchValue1 = new Quantity(Units.INCH, 2.0);
        Quantity inchValue2 = new Quantity(Units.INCH, 14.0);
        double sumValue = feetValue.unitsAddition(inchValue1);
        boolean result = inchValue2.compare(new Quantity(Units.INCH, sumValue),Units.INCH);
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqaulsTo24Inch() {
        Quantity feetValue1 = new Quantity(Units.FEET, 1.0);
        Quantity feetValue2 = new Quantity(Units.FEET, 1.0);
        Quantity inchValue = new Quantity(Units.INCH, 24.0);
        double sumValue = feetValue1.unitsAddition(feetValue2);
        boolean result = inchValue.compare(new Quantity(Units.INCH, sumValue),Units.INCH);
        Assert.assertTrue(result);
    }

    @Test
    public void given2InchAnd2dot5cm_ShouldReturnEqaulsTo3Inch() {
        Quantity inchValue1 = new Quantity(Units.INCH, 2.0);
        Quantity centimeterValue = new Quantity(Units.CENTIMETER, 2.5);
        Quantity inchValue2 = new Quantity(Units.INCH, 3.0);
        double sumValue = inchValue1.unitsAddition(centimeterValue);
        boolean result = inchValue2.compare(new Quantity(Units.INCH, sumValue),Units.INCH);
        Assert.assertTrue(result);
    }

    @Test
    public void given1LitreAnd1Litre_ShouldReturnEquals() {
        Quantity liter1 = new Quantity(Units.LITRE, 1.0);
        Quantity litre2 = new Quantity(Units.LITRE, 1.0);
        boolean result = liter1.compare(litre2,Units.LITRE);
        Assert.assertTrue(result);
    }

    @Test
    public void given1LitreAnd1000Mililiter_ShouldReturnEquals() {
        Quantity literValue = new Quantity(Units.LITRE, 1.0);
        Quantity miliLiterValue = new Quantity(Units.MILLILITER, 1000.0);
        boolean result = literValue.compare(miliLiterValue,Units.LITRE);
        Assert.assertTrue(result);
    }

    @Test
    public void given1GallonAnd3dot78Litre_ShouldReturnEquals() {
        Quantity gallonValue = new Quantity(Units.GALLON, 1.0);
        Quantity literValue = new Quantity(Units.LITRE, 3.78);
        boolean result = gallonValue.compare(literValue,Units.LITRE);
        Assert.assertTrue(result);
    }

    @Test
    public void given1GallonAnd3dot78liter_ShouldReturnEqaulsTo7dot57liters() {
        Quantity gallonValue = new Quantity(Units.GALLON, 1.0);
        Quantity literValue = new Quantity(Units.LITRE, 3.78);
        double sumValue = gallonValue.unitsAddition(literValue);
        Assert.assertEquals(7.57,sumValue,0.1);
    }

    @Test
    public void given1LiterAnd1000ml_ShouldReturnEqualsTo2Liters() {
        Quantity literValue1 = new Quantity(Units.LITRE, 1.0);
        Quantity milliliterValue = new Quantity(Units.MILLILITER, 1000.0);
        Quantity literValue2 = new Quantity(Units.LITRE, 2.0);
        double sumValue = literValue1.unitsAddition(milliliterValue);
        boolean result = literValue2.compare(new Quantity(Units.LITRE, sumValue),Units.LITRE);
        Assert.assertTrue(result);
    }

    @Test
    public void given1KgAnd1000Gram_ShouldReturnEquals() {
        Quantity kilogramValue = new Quantity(Units.KILOGRAM, 1.0);
        Quantity gramValue = new Quantity(Units.GRAM, 1000.0);
        boolean result = kilogramValue.compare(gramValue,Units.KILOGRAM);
        Assert.assertTrue(result);
    }

    @Test
    public void given1TonneAnd1000Kg_ShouldReturnEquals() {
        Quantity tonneValue = new Quantity(Units.TONNE, 1.0);
        Quantity kilogramValue = new Quantity(Units.KILOGRAM, 1000.0);
        boolean result = tonneValue.compare(kilogramValue,Units.KILOGRAM);
        Assert.assertTrue(result);
    }

    @Test
    public void given1TonneAnd1000Gram_ShouldReturnEqualsTo1001Kg() {
        Quantity tonneValue = new Quantity(Units.TONNE, 1.0);
        Quantity gramValue = new Quantity(Units.GRAM, 1000.0);
        Quantity kilogramValue = new Quantity(Units.KILOGRAM, 1001.0);
        double sumValue = tonneValue.unitsAddition(gramValue);
        boolean result = kilogramValue.compare(new Quantity(Units.LITRE, sumValue),Units.KILOGRAM);
        Assert.assertTrue(result);
    }

    @Test
    public void given1CelsiusAnd33dot8Fahrenheit_ShouldRetrunEqual() {
        Quantity celsiusValue = new Quantity(Units.CELSIUS, 1.0);
        Quantity fahrenheitValue = new Quantity(Units.FAHRENHEIT, 33.8);
        boolean result = celsiusValue.compare(fahrenheitValue,Units.CELSIUS);
        Assert.assertTrue(result);
    }

    @Test
    public void given212FahrenheitAnd100Celsius_ShouldReturnEqual() {
        Quantity celsius = new Quantity(Units.CELSIUS, 100.0);
        Quantity fahrenheit = new Quantity(Units.FAHRENHEIT, 212.0);
        boolean result = celsius.compare(fahrenheit, Units.CELSIUS);
        Assert.assertTrue(result);
    }
}
