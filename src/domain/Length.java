package domain;

/**
 * Created by aakash on 7/29/2015.
 */
public abstract class Length {

    private double length;

    public Length(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    //   public abstract double convertToBase(double l);


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;

        Length length1 = (Length) o;

        return Double.compare(length1.length, length) == 0;

    }

   public abstract double getLengthValue();
}
