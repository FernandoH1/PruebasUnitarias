package co.com.sofka.app.calculator;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long addition(Long number1, Long number2) {
        logger.info( "Suma: {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long substraction(Long number1, Long number2) {
        logger.info("Resta: {} - {}", number1, number2);
        return number1 - number2;
    }

    public Long multiply(Long number1, Long number2) {
        logger.info("Multiplicación: {} x {}", number1, number2);
        return number1 * number2;
    }

    public Long division(Long number1, Long number2) {
        logger.info("División: {} / {}", number1, number2);
        if (number2 == 0) {
            throw new IllegalArgumentException("No es posible dividir entre Cero(0)");
        }
        return number1 / number2;
    }

}
