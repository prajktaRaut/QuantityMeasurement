package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnFeet() {
        Feet feet1 = new Feet(0.0);
        Feet feet2= new Feet(0.0);
        Assert.assertEquals(feet1,feet2);
    }
}
