package domain.length;

/**
 * Created by aakash on 7/29/2015.
 */
public class Metres extends Length{

  final double converSionFactor = 100;

    public Metres(double length) {
        super(100*length);
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
        return l.getLengthValue()/100;
    }
}
