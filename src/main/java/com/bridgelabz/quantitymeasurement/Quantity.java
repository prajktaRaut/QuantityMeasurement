package com.bridgelabz.quantitymeasurement;

public class Quantity {

    public final Double value;
    public Units units;
    public Quantity(Units unit, Double value) {
        this.units=unit;
        this.value=value;
    }

    public boolean compare(Quantity thatUnits, Units comparingUnitType) {
        switch (comparingUnitType) {
            case CELSIUS :
                Double value1 = ((this.value * 9 / 5)+ 32);
                Double value2 = thatUnits.value;
                return (value1.compareTo(value2)==0);
            default:
                value1 = this.units.getValue()*this.value;
                value2= thatUnits.units.getValue()*thatUnits.value;
                return (value1.compareTo(value2)==0);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.value, value) == 0 &&
                                units == quantity.units;
    }
}
