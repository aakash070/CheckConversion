package domain.volume;

/**
 * Created by aakash on 7/30/2015.
 */
public class Ounce extends Volume{

    private static double conversionFactor = 6;

    public Ounce(double volume) {
        super(volume);
    }

    @Override
    public double getConversionFactor() {
        return conversionFactor;
    }

    public static double convert(Volume volume) {
        return volume.getVolume()/conversionFactor;
    }

    public Ounce add(Volume volume) {
        return new Ounce((this.getVolume()+volume.getVolume())/conversionFactor);
    }
}
