package org.apache.commons.imaging;

import org.junit.Test;

import static org.junit.Assert.*;

public class PixelDensityTest {

    @Test
    public void testCreateFromPixelsPerCentimetre() {
        PixelDensity pixelDensity = PixelDensity.createFromPixelsPerCentimetre(300, 200);

        assertNotNull(pixelDensity);
        assertTrue(pixelDensity.isInCentimetres());

        assertFalse(pixelDensity.isInInches());
        assertFalse(pixelDensity.isInMetres());
        assertFalse(pixelDensity.isUnitless());

        assertEquals(300, pixelDensity.getRawHorizontalDensity(), 0.001);
        assertEquals(200, pixelDensity.getRawVerticalDensity(), 0.001);
    }

    @Test
    public void testCreateFromPixelsPerInch() {
        PixelDensity pixelDensity = PixelDensity.createFromPixelsPerInch(300, 200);

        assertNotNull(pixelDensity);
        assertFalse(pixelDensity.isInCentimetres());

        assertFalse(pixelDensity.isInMetres());
        assertFalse(pixelDensity.isUnitless());
        assertTrue(pixelDensity.isInInches());

        assertEquals(300, pixelDensity.getRawHorizontalDensity(), 0.001);
        assertEquals(200, pixelDensity.getRawVerticalDensity(), 0.001);
    }

    @Test
    public void testCreateFromPixelsPerMetre() {
        PixelDensity pixelDensity = PixelDensity.createFromPixelsPerMetre(300, 200);

        assertNotNull(pixelDensity);
        assertFalse(pixelDensity.isInCentimetres());
        assertFalse(pixelDensity.isInInches());
        assertFalse(pixelDensity.isUnitless());

        assertTrue(pixelDensity.isInMetres());

        assertEquals(300, pixelDensity.getRawHorizontalDensity(), 0.001);
        assertEquals(200, pixelDensity.getRawVerticalDensity(), 0.001);
    }

    @Test
    public void testCreateUnitless() {
        PixelDensity pixelDensity = PixelDensity.createUnitless(300, 200);

        assertNotNull(pixelDensity);
        assertFalse(pixelDensity.isInCentimetres());
        assertFalse(pixelDensity.isInInches());
        assertFalse(pixelDensity.isInMetres());

        assertTrue(pixelDensity.isUnitless());

        assertEquals(300, pixelDensity.getRawHorizontalDensity(), 0.001);
        assertEquals(200, pixelDensity.getRawVerticalDensity(), 0.001);
    }

    @Test
    public void testHorizontalDensityCentimetres() {
        final double expectedDensity = 300.0;
        PixelDensity pixelDensity = PixelDensity.createFromPixelsPerCentimetre(300, 200);

        assertEquals(expectedDensity, pixelDensity.horizontalDensityCentimetres(), 0.001);
        assertEquals(this.centimeterToInch(expectedDensity), pixelDensity.horizontalDensityInches(), 0.001);
    }

    @Test
    public void testHorizontalDensityInches() {
        final double expectedDensity = 300.0;
        PixelDensity pixelDensity = PixelDensity.createFromPixelsPerInch(300, 200);

        assertEquals(expectedDensity, pixelDensity.horizontalDensityInches(), 0.001);
        assertEquals(this.inchToCentimeter(expectedDensity), pixelDensity.horizontalDensityCentimetres(), 0.001);
    }

    @Test
    public void testHorizontalDensityMetres() {
        final double expectedDensity = 300.0;
        PixelDensity pixelDensity = PixelDensity.createFromPixelsPerMetre(300, 200);

        assertEquals(expectedDensity, pixelDensity.horizontalDensityMetres(), 0.001);
        assertEquals(expectedDensity / 100, pixelDensity.horizontalDensityCentimetres(), 0.001);
    }

    @Test
    public void testVerticalDensityCentimetres() {
        final double expectedDensity = 200.0;
        PixelDensity pixelDensity = PixelDensity.createFromPixelsPerCentimetre(300, 200);

        assertEquals(expectedDensity, pixelDensity.verticalDensityCentimetres(), 0.001);
        assertEquals(this.centimeterToInch(expectedDensity), pixelDensity.verticalDensityInches(), 0.001);

    }

    @Test
    public void testVerticalDensityInches() {
        final double expectedDensity = 200.0;
        PixelDensity pixelDensity = PixelDensity.createFromPixelsPerInch(300, 200);

        assertEquals(expectedDensity, pixelDensity.verticalDensityInches(), 0.001);
        assertEquals(this.inchToCentimeter(expectedDensity), pixelDensity.verticalDensityCentimetres(), 0.001);
    }

    @Test
    public void testVerticalDensityMetres() {
        PixelDensity pixelDensity = PixelDensity.createFromPixelsPerMetre(300, 200);
        assertEquals(200.0, pixelDensity.verticalDensityMetres(), 0.001);
    }

    private double centimeterToInch(double centimeters) {
        return centimeters * 2.54;
    }

    private double inchToCentimeter(double centimeters) {
        return centimeters / 2.54;
    }
}
