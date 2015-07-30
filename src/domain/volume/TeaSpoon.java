package domain.volume;

/**
 * Created by aakash on 7/30/2015.
 */
public class TeaSpoon extends Volume{

    private static double conversionFactor = 1;

    public TeaSpoon(double volume) {
        super(volume);
    }

    @Override
    public double getConversionFactor() {
        return conversionFactor;
    }

    public static double convert(Volume volume) {
        return volume.getVolume()/conversionFactor;
    }

    public TeaSpoon add(Volume volume) {
        return new TeaSpoon((this.getVolume()+volume.getVolume())/conversionFactor);
    }
}
