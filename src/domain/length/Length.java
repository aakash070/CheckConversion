package domain.length;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

/**
 * Created by aakash on 7/29/2015.
 */
public abstract class Length {

    private double length;

    public Length(double length) {
        this.length = length*this.getConversionFactor();
    }

    public double getLength() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Length))
            return false;
        Length length1 = (Length) o;

        return Double.compare(length1.length, length) == 0;
    }

   public abstract double getConversionFactor();
}
