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
        Double value2= thatUnits.units.getValue()*thatUnits.value;
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

    public boolean addAndCompare(Length inchValue1, Length inchValue2, Length inchValue3) {
        Double value1 = inchValue1.units.getValue() * inchValue1.value;
        Double value2 = inchValue2.units.getValue() * inchValue2.value;
        Double sum = value1 + value2;
        Length sumValue = new Length(Units.INCH, sum);
        return sumValue.compare(inchValue3);
    }
}
