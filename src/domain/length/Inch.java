package domain.length;

/**
 * Created by aakash on 7/30/2015.
 */
public class Inch extends Length{

    private static double conversionFactor = 2.54;

    public Inch(double length) {
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

    public Inch add(Length length) {
        return new Inch((this.getLength()+length.getLength())/conversionFactor);
    }
}
