package com.bridgelabz.quantitymeasurement;

public class Length {

    private static final double FEET_TO_INCH = 12.0;
    enum Unit{FEET,INCH, YARD, INVALID_UNIT}
    private final Unit unit;
    private final Double value;


    public boolean compare(Length thatUnits) {
        if (this.unit.equals(Unit.FEET) && thatUnits.unit.equals(Unit.FEET))
            return Double.compare(this.value,thatUnits.value)==0;
        if (this.unit.equals(Unit.FEET) && thatUnits.unit.equals(Unit.INCH))
            return Double.compare(this.value*FEET_TO_INCH,thatUnits.value)==0;
        if (this.unit.equals(Unit.INCH)&& thatUnits.unit.equals(Unit.FEET))
            return Double.compare(this.value/FEET_TO_INCH,thatUnits.value)==0;
        if (this.unit.equals(Unit.YARD) && thatUnits.unit.equals(Unit.INCH))
            return Double.compare(this.value*FEET_TO_INCH*3,thatUnits.value)==0;
        return false;
    }
    public Length(Unit unit, Double value) {
        this.unit=unit;
        this.value=value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }
}
