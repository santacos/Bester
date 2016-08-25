package bester;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class RectangleBestFinderTest {

    @Test
    public void shouldReturnTheBestWhenCompareTwoRectangles() {
        Rectangle r1 = new Rectangle(10, 10);
        Rectangle r2 = new Rectangle(10, 5);
        Rectangle[] rectangles = {r1, r2};
        BestFinder<Rectangle> finder = new BestFinder<Rectangle>();
        assertEquals(r1, finder.findTheBestOne(rectangles));
    }

    @Test
    public void shouldReturnTheBestWhenCompareTwoRectangleWithDifferentArea() {
        Rectangle r1 = new Rectangle(10, 7);
        Rectangle r2 = new Rectangle(10, 5);
        Rectangle[] rectangles = {r1, r2};
        BestFinder<Rectangle> finder = new BestFinder();
        assertEquals(r1, finder.findTheBestOne(rectangles));
    }

    @Test
    public void shouldReturnTheThirdRectangleWhenCompareThreeRectanglesAndTheThirdOneIsTheBest() {
        Rectangle r1 = new Rectangle(10, 7);
        Rectangle r2 = new Rectangle(10, 5);
        Rectangle r3 = new Rectangle(10, 10);
        Rectangle[] rectangles = {r1, r2, r3};
        BestFinder<Rectangle> finder = new BestFinder();
        assertEquals(r3, finder.findTheBestOne(rectangles));
    }
}
