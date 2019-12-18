package com.bridgelabz.quantitymeasurement;

public class Length {

    public final Double value;
    public Units units;
    public Length(Units unit, Double value) {
        this.units=unit;
        this.value=value;
    }

    public boolean compare(Length thatUnits) {
        Double value1 = this.units.getValue()*this.value;
        Double value2= Double.valueOf(Math.round(thatUnits.units.getValue()*thatUnits.value));
        return (value1.compareTo(value2)==0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                                units == length.units;
    }
}
