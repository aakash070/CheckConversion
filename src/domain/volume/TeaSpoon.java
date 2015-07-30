package domain.volume;

/**
 * Created by aakash on 7/30/2015.
 */
public class TeaSpoon extends Volume{

    public TeaSpoon(double volume) {
        super(volume);
    }

    @Override
    public double getVolumeValue() {
        return super.getVolume();
    }

    public static double convert(Volume volume) {
        return volume.getVolumeValue();
    }

}
