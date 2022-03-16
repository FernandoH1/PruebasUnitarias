package co.com.sofka.app;

import co.com.sofka.app.calculator.BasicCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App{

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number 1: ");
        String textNumber1 = bufferedReader.readLine();

        System.out.println("Enter number 2: ");
        String textNumber2 = bufferedReader.readLine();

        Long number1 = Long.valueOf(textNumber1);
        Long number2 = Long.valueOf(textNumber2);

        BasicCalculator calculator = new BasicCalculator();
        Long result_Suma = calculator.addition(number1, number2);
        Long result_Resta = calculator.substraction(number1, number2);
        Long result_Division = calculator.division(number1, number2);
        Long result_Multiplicacion = calculator.multiply(number1, number2);


        System.out.println(number1 + " + " + number2 + " = " + result_Suma);
        System.out.println(number1 + " - " + number2 + " = " + result_Resta);
        System.out.println(number1 + " / " + number2 + " = " + result_Division);
        System.out.println(number1 + " x " + number2 + " = " + result_Multiplicacion);
    }

}
