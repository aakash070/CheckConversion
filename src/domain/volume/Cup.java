package domain.volume;

/**
 * Created by aakash on 7/30/2015.
 */
public class Cup extends Volume{

    public Cup(double volume) {
        super(volume*48);
    }

    @Override
    public double getVolumeValue() {
        return super.getVolume();
    }

    public static double convert(Volume volume) {
        return volume.getVolumeValue()/48;
    }
}
