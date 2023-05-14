package sky.pro.calculator2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sky.pro.calculator2.exception.DivZeroException;
import sky.pro.calculator2.service.CalculatorService;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    private final CalculatorService out = new CalculatorService();

    @Test
    public void plusTest() {
        int actual1 = out.plus(1, 2);
        int actual2 = out.plus(3, 5);
        assertEquals(3, actual1);
        assertEquals(8, actual2);

    }

    @Test
    public void minusTest() {
        int actual1 = out.minus(3, 1);
        int actual2 = out.minus(2, 5);
        assertEquals(2, actual1);
        assertEquals(-3, actual2);

    }

    @Test
    public void multiplyTest() {
        int actual1 = out.multiply(3, 1);
        int actual2 = out.multiply(2, 5);
        assertEquals(3, actual1);
        assertEquals(10, actual2);

    }

    @Test
    public void divideTest() {
        double actual1 = out.divide(3, 1);
        double actual2 = out.divide(2, 5);
        assertEquals(3, actual1);
        assertEquals(0.4, actual2);

    }

    @Test
    public void negativeDivideTest() {

        assertThrows(DivZeroException.class, () -> out.divide(3, 0));
        assertThrows(DivZeroException.class, () -> out.divide(-2, 0));

    }
}
