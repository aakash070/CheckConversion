package domain.volume;

/**
 * Created by aakash on 7/30/2015.
 */
public class Cup extends Volume{

    private static double conversionFactor = 48;

    public Cup(double volume) {
        super(volume);
    }

   @Override
    public double getConversionFactor() {
        return conversionFactor;
    }

    public static double convert(Volume volume) {
        return volume.getVolume()/conversionFactor;
    }

    public Cup add(Volume volume) {
        return new Cup((this.getVolume()+volume.getVolume())/conversionFactor);
    }
}
