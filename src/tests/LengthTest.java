package tests;

import domain.Centimetres;
import domain.Feet;
import domain.Inch;
import domain.Metres;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aakash on 7/30/2015.
 */
public class LengthTest {

    @Test
    public void checkComparisonBetweenMetreAndCentimetre() {
        Metres metres = new Metres(3);
        Centimetres centimetres = new Centimetres(300);

        assertTrue(metres.equals(centimetres));
    }

    @Test
    public void checkConversionFromCentimetreToFeet() {
        Feet feet = new Feet(3);
        double inches = Inch.convert(feet);
        Inch inch = new Inch(inches);

        assertEquals(36,inches,0.00001);
        assertTrue(inch.equals(feet));
    }

}