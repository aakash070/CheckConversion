package domain.volume;

/**
 * Created by aakash on 7/30/2015.
 */
public class TableSpoon extends Volume{

    private static double conversionFactor = 3;

    public TableSpoon(double volume) {
        super(volume);
    }

    @Override
    public double getConversionFactor() {
        return conversionFactor;
    }

    public static double convert(Volume volume) {
        return volume.getVolume()/conversionFactor;
    }

    public TableSpoon add(Volume volume) {
        return new TableSpoon((this.getVolume()+volume.getVolume())/conversionFactor);
    }
}
