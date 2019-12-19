package com.bridgelabz.quantitymeasurement;

public class Quantity {

    public final Double value;
    public Units units;
    public Quantity(Units unit, Double value) {
        this.units=unit;
        this.value=value;
    }

    public boolean compare(Quantity thatUnits) {
        Double value1 = this.units.getValue()*this.value;
        Double value2= thatUnits.units.getValue()*thatUnits.value;
        return (value1.compareTo(value2)==0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.value, value) == 0 &&
                                units == quantity.units;
    }

    public double unitsAddition(Quantity thatUnits) {
        Double value1 = this.units.getValue()*this.value;
        Double value2= thatUnits.units.getValue()*thatUnits.value;
        return (value1 + value2);
    }
}
