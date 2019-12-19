package com.bridgelabz.quantitymeasurement;

public enum Units {
    INCH(1), FEET(12), YARD(36), CENTIMETER(0.4),
    MILLILITER(1.0),LITRE(1000.0), GALLON(3780.0);

    private final double baseUnitConversion;

    Units(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public double getValue() {
        return this.baseUnitConversion;
    }
}
