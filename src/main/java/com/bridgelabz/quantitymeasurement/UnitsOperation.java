package com.bridgelabz.quantitymeasurement;

public class UnitsOperation {

    public final Double value;
    public Units units;

    public UnitsOperation(Units unit, Double value) {
        this.units=unit;
        this.value=value;
    }

    public double unitsAdditionOperation(UnitsOperation thatUnits) {
        Double value1 = this.units.getValue()*this.value;
        Double value2= thatUnits.units.getValue()*thatUnits.value;
        return (value1 + value2);
    }

}
