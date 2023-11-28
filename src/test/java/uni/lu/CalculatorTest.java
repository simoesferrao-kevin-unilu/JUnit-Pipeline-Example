package uni.lu;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class that verifies the functionality of the Calculator class.
 */
public class CalculatorTest {

    private static Calculator calculator = new Calculator();

    @Test
    public void add2And2() {
        int result = calculator.add(3, 2);
        assertEquals(4, result);
    }

    @Test
    public void add4And15() {
        int result = calculator.add(4, 15);
        assertEquals(19, result);
    }
}