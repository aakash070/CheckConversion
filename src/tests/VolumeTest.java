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
        Ounce onz = new Ounce(2);
        double tsp = TeaSpoon.convert(onz);

        TeaSpoon teaSpoon = new TeaSpoon(tsp);

        assertEquals(12,tsp,0.00001);
        assertTrue(teaSpoon.equals(onz));
    }
}