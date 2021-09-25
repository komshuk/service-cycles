package ru.netology.sqr;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldRange() {
        SQRService sqrService = new SQRService ();
        int expected = 3;
        int actual = sqrService.range(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRangeMaximum() {
        SQRService sqrService = new SQRService();
        int expected = 84;
        int actual = sqrService.range(200, 9999);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRangeMinimum() {
        SQRService sqrService = new SQRService();
        int expected = 3;
        int actual = sqrService.range(100,150 );
        assertEquals(expected, actual);
    }
    @Test
    public void shouldRangeMinimumNegative() {
        SQRService sqrService = new SQRService();
        int expected = 0;
        int actual = sqrService.range(-500,-300 );
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRangeMinimumNegativePositive() {
        SQRService sqrService = new SQRService();
        int expected = 48;
        int actual = sqrService.range(-500,3300 );
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRangeMinimumNegativeMaximum() {
        SQRService sqrService = new SQRService();
        int expected = 89;
        int actual = sqrService.range(-500,1_000_03 );
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRangeMinimumNegativeMaximumPositive() {
        SQRService sqrService = new SQRService();
        int expected = 50;
        int actual = sqrService.range(-9_999_99,3500 );
        assertEquals(expected, actual);
    }
}