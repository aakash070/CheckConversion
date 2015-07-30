package domain.volume;

/**
 * Created by aakash on 7/30/2015.
 */
public class TableSpoon extends Volume{

    public TableSpoon(double volume) {
        super(volume*3);
    }

    @Override
    public double getVolumeValue() {
        return super.getVolume();
    }

    public static double convert(Volume volume) {
        return volume.getVolumeValue()/3;
    }
}
