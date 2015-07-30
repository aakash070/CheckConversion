package domain.temperature;

/**
 * Created by aakash on 7/30/2015.
 */
public class Celsius extends Temperature{

    public Celsius(double temperature) {
        super(temperature);
    }

    @Override
    public double tempBaseValue(double temperature) {
        return temperature;
    }

    public static Celsius convert(Temperature t) {
        return new Celsius(t.getTemperature());
    }
}
