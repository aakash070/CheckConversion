package domain.volume;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

/**
 * Created by aakash on 7/30/2015.
 */
public class Volume {

    private double volume;

    public Volume(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Volume volume1 = (Volume) o;

        return Double.compare(volume1.volume, volume) == 0;

    }

}
