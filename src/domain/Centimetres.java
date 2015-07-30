package domain;

/**
 * Created by aakash on 7/29/2015.
 */
public class Centimetres extends Length{

    final double conversionFactor = 1;

    public Centimetres(double length) {
        super(1*length);
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
        return l.getLengthValue();
    }
}
