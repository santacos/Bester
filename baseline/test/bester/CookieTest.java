package bester;

import org.junit.Test;

import static org.junit.Assert.*;

public class CookieTest {
    @Test
    public void shouldReturnTrueWhenThisCookieIsBetterThanOther() {
        Cookie c1 = new Cookie(10);
        Cookie c2 = new Cookie(5);

        assertTrue(c1.better(c2));
    }

    @Test
    public void shouldReturnFalseWhenThisCookieIsNotBetterThanOther() {
        Cookie c1 = new Cookie(5);
        Cookie c2 = new Cookie(10);

        assertFalse(c1.better(c2));
    }
}