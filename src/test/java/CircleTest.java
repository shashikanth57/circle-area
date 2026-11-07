import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

    Circle circle = new Circle();

    @Test
    void testArea() {
        double result = circle.calculateArea(5);

        assertEquals(78.5398, result, 0.001);
    }

    @Test
    void testZeroRadius() {
        double result = circle.calculateArea(0);

        assertEquals(0, result);
    }

    @Test
    void testNegativeRadius() {
        assertThrows(IllegalArgumentException.class,
                () -> circle.calculateArea(-5));
    }
}