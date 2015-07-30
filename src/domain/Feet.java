package domain;

/**
 * Created by aakash on 7/30/2015.
 */
public class Feet extends Length{

    final double conversionFactor = 12*2.54;

    public Feet(double length) {
        super(length*12*2.54);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public double getLengthValue() {
        return super.getLength();
    }

    public static double convert(Length l) {
        return l.getLengthValue()/(12*2.54);
    }
}
