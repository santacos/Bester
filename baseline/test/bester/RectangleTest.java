package bester;

import org.junit.Test;
import org.w3c.dom.css.Rect;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RectangleTest {
    @Test
    public void areaShouldBeEqualToLengthyMultipliedByBreadth() throws Exception {
        assertEquals(6.0, new Rectangle(2, 3).area());
        assertEquals(0.0, new Rectangle(0, 1).area());
        assertEquals(3.75, new Rectangle(1.5, 2.5).area());
    }

    @Test
    public void shouldReturnTrueWhenThisRectangleIsBetterThanTheOther() {
        Rectangle r1 = new Rectangle(10, 10);
        Rectangle r2 = new Rectangle(10, 5);
        assertTrue(r1.better(r2));
    }

    @Test
    public void shouldReturnFalseWhenThisRectangleIsNotBetterThanTheOther() {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(10, 10);
        assertFalse(r1.better(r2));
    }


}
