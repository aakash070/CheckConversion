package tests;

import domain.length.Centimetres;
import domain.length.Feet;
import domain.length.Inch;
import domain.length.Metres;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aakash on 7/30/2015.
 */
public class LengthTest {

    @Test
    public void checkComparisonBetweenMetreAndCentimetre() {

        assertTrue(new Metres(3).equals(new Centimetres(300)));
    }

    @Test
    public void checkConversionFromCentimetreToFeet() {
        double inches = Inch.convert(new Feet(3));

        assertEquals(36,inches,0.00001);
        assertTrue(new Inch(inches).equals(new Feet(3)));
    }

}