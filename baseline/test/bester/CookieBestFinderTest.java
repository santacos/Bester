package bester;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CookieBestFinderTest {

    @Test
    public void shouldReturnNullWhenCallFindTheBestOneMethodWithNull() {
        BestFinder<Cookie> finder = new BestFinder<Cookie>();

        assertNull(finder.findTheBestOne(null));
    }

    @Test
    public void shouldReturnTheBestWhenCompareTwoRectangles() {
        Cookie r1 = new Cookie(10);
        Cookie r2 = new Cookie(5);
        Cookie[] cookies = {r1, r2};
        BestFinder<Cookie> finder = new BestFinder<Cookie>();
        assertEquals(r1, finder.findTheBestOne(cookies));
    }
}
