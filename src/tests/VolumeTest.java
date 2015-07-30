package tests;

import domain.volume.Cup;
import domain.volume.Ounce;
import domain.volume.TableSpoon;
import domain.volume.TeaSpoon;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aakash on 7/30/2015.
 */
public class VolumeTest {

    @Test
    public void checkComparisonBetweenTbspAndCup() {

        assertTrue(new TableSpoon(16).equals(new Cup(1)));
    }

    @Test
    public void checkConversionFromOunceToTeaspoon() {
        double tsp = TeaSpoon.convert(new Ounce(2));
        assertEquals(12,tsp,0.00001);
        assertTrue(new TeaSpoon(tsp).equals(new Ounce(2)));
    }
}