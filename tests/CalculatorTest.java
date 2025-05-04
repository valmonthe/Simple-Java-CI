import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(6, Calculator.add(3, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, Calculator.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(15, Calculator.multiply(3, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, Calculator.divide(4, 2), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        Calculator.divide(5, 0);
    }
}
