package gitty.up;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(2, Calculator.add(1, 1));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, Calculator.subtract(2, 1));
    }
}

