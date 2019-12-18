package com.bridgelabz.quantitymeasurement;

public enum Units {
    INCH(1.0), FEET(12.0), YARD(36.0), CENTIMETER(0.4);

    private final double baseUnitConversion;

    Units(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public double getValue() {
        return this.baseUnitConversion;
    }

}
