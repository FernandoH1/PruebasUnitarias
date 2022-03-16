package co.com.sofka.app.calculator;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BasicCalculatorTest extends TestCase {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    //VALORES SUMA
    @DisplayName("Testing Suma")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "1,    1,   2",
            "2,    2,   4",
            "49,  51, 100",
            "1,  100, 101"
    })
    //TEST SUMA
    public void testAddition(Long first, Long second, Long expectedResult) {
        Assertions.assertEquals(expectedResult, basicCalculator.addition(first, second),
                    () -> first + " + " + second + " should equal " + expectedResult);
    }

    //VALORES RESTA
    @DisplayName("Testing Resta")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "1,    1,   0",
            "5,    2,   3",
            "49,  51, -2",
            "1,  100, -99"
    })
    //TEST RESTA
    public void testSubstraction(Long first, Long second, Long expectedResult) {
        Assertions.assertEquals(expectedResult, basicCalculator.substraction(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    //VALORES MULTIPLICACIÓN
    @DisplayName("Testing Multiplicación")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "1,    1,   1",
            "2,    2,   4",
            "5,    6,   30",
            "-1,  100,   -100"
    })
    //TEST MULTIPLICACIÓN
    public void testMultiply(Long first, Long second, Long expectedResult) {
        Assertions.assertEquals(expectedResult, basicCalculator.multiply(first, second),
                () -> first + " x " + second + " should equal " + expectedResult);
    }

    //VALORES DIVISIÓN
    @DisplayName("Testing Multiplicación")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "1,    1,   1",
            "20,    2,   10",
            "-25,    5,   -5",
            "124,  4,  31 "
    })

    //TEST DIVISIÓN
    public void testDivision(Long first, Long second, Long expectedResult) {
        Assertions.assertEquals(expectedResult, basicCalculator.division(first, second),
                () -> first + " x " + second + " should equal " + expectedResult);
    }
}