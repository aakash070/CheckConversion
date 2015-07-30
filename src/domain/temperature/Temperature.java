package domain.temperature;

/**
 * Created by aakash on 7/30/2015.
 */
public abstract class Temperature {

    private double temperature;

    public Temperature(double temperature) {
        this.temperature = tempBaseValue(temperature);
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Temperature))
            return false;

        Temperature that = (Temperature) o;

        return Double.compare(that.temperature, temperature) == 0;
    }

    public abstract double tempBaseValue(double temperature);
}
