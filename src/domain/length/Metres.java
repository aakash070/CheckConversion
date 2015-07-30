package domain.length;

/**
 * Created by aakash on 7/29/2015.
 */
public class Metres extends Length{

    private static double conversionFactor = 100;

    public Metres(double length) {
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

    public Metres add(Length length) {
        return new Metres((this.getLength()+length.getLength())/conversionFactor);
    }
}
