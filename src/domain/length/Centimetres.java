package domain.length;

/**
 * Created by aakash on 7/29/2015.
 */
public class Centimetres extends Length{

    private static double conversionFactor = 1;

    public Centimetres(double length) {
        super(length);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public double getConversionFactor() {
        return conversionFactor;
    }

    public static double convert(Length length) {
        return length.getLength()/conversionFactor;
    }

    public Centimetres add(Length length) {
        return new Centimetres((this.getLength()+length.getLength())/conversionFactor);
    }
}
