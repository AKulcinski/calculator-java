import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testCalculateExpression() {
        // Arrange
        String expression = "10+5*2";

        // Act
        String result = Calculator.Run(expression);

        // Assert
        assertEquals("20.0", result);
    }
}
