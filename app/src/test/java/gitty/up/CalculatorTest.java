package gitty.up;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test public void appHasAGreeting() {
        Calculator classUnderTest = new Calculator();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
