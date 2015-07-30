package domain.volume;

/**
 * Created by aakash on 7/30/2015.
 */
public class Ounce extends Volume{

    public Ounce(double volume) {
        super(volume*6);
    }

    @Override
    public double getVolumeValue() {
        return super.getVolume();
    }

    public static double convert(Volume volume) {
        return volume.getVolumeValue()/6;
    }
}
