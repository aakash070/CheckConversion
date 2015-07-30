package domain.length;

/**
 * Created by aakash on 7/30/2015.
 */
public class Feet extends Length{

    private static double conversionFactor = 12*2.54;

    public Feet(double length) {
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

    public static double convert(Length l) {
        return l.getLength()/conversionFactor;
    }

    public Feet add(Length length) {
        return new Feet((this.getLength()+length.getLength())/conversionFactor);
    }
}
