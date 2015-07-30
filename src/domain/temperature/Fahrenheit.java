package domain.temperature;

/**
 * Created by aakash on 7/30/2015.
 */
public class Fahrenheit extends Temperature{

    public Fahrenheit(double temperature) {
        super(temperature);
    }

    @Override
    public double tempBaseValue(double temperature) {
        return (((temperature-32)*5)/9);
    }

    public static Fahrenheit convert(Temperature t) {
        return new Fahrenheit(((t.getTemperature()*9)/5)+32);
    }
}
