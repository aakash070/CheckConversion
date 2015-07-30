package tests;

import domain.temperature.Celsius;
import domain.temperature.Fahrenheit;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aakash on 7/30/2015.
 */
public class TemperatureTest {

    @Test
    public void checkComparisonBetweenCelsiusAndFahrenheit(){
        assertTrue(new Celsius(40).equals(new Fahrenheit(104)));
    }

    @Test
    public void checkConversionFromFahrenheitToCelsius() {

        assertEquals(40,Celsius.convert(new Fahrenheit(104)).getTemperature(),0.00001);
    }

}