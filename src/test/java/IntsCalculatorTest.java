import org.junit.jupiter.api.Test;
import ru.kristinak.HW.Ints;
import ru.kristinak.HW.IntsCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntsCalculatorTest {

    @Test
    public void sumTest() {
        //arrange
        Ints calculator = new IntsCalculator();

        //act
        int result = calculator.sum(5, 3);
        int expected = 8;

        //assert
        assertEquals(expected, result);
    }

    @Test
    public void multTest() {
        //arrange
        Ints calculator = new IntsCalculator();

        //act
        int result = calculator.mult(2, 3);
        int expected = 6;

        //assert
        assertEquals(expected, result);
    }

    @Test
    public void powTest() {
        //arrange
        Ints calculator = new IntsCalculator();

        //act
        int result = calculator.pow(3, 2);
        int expected = 9;

        //assert
        assertEquals(expected, result);
    }
}
