import at.vietze.divisionCalc.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class divisionCalcControllerTest {

    @Test
    public void testDivisionOfTwoPositivIntegers () {
        // Arrange
        Calculator calc = new Calculator();
        int a = 10;
        int b = 2;

        // Act
        float res = calc.div(a, b);

        // Assert
        Assertions.assertEquals(5.0, res);
    }

}
