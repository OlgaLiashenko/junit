package calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSum() {

        //Given
        int inputA = 11;
        int inputB = 22;

        //When
        ICalculator calculator = new Calculator();
        int result = calculator.sum(inputA, inputB);

        //Then
        Assert.assertEquals("Sum operation failed.", (inputA + inputB), result);
    }

    @Test
    public void testDivide() {

        //Given
        int inputA = 20;
        int inputB = 10;

        //When
        ICalculator calculator = new Calculator();
        int result = calculator.divide(inputA, inputB);

        //Then
        Assert.assertEquals("Divide operation failed.", (inputA / inputB), result);
    }

    @Test
    public void multiply() {
        //Given
        int inputA = 2;
        int inputB = 3;

        //When
        ICalculator calculator = new Calculator();
        int result = calculator.multiply(inputA, inputB);

        //Then
        Assert.assertEquals("Multiply operation is failed.", (inputA * inputB), result);
    }

    @Test
    public void subtraction() {
        //Given
        int inputA = 3;
        int inputB = 2;

        //When
        ICalculator calculator = new Calculator();
        int result = calculator.subtract(inputA, inputB);

        //Then
        Assert.assertEquals("Subtraction operation is failed", (inputA - inputB), result);
    }

    @Test
    public void sumZero() {
        int inputA = 0;
        int inputB = 0;

        ICalculator calculator = new Calculator();
        int result = calculator.sum(inputA, inputB);

        Assert.assertEquals((inputA + inputB), result);
    }

    @Test(expected = ArithmeticException.class)
    public void divideOnZero() {
        int inputA = 10;
        int inputB = 0;

        ICalculator calculator = new Calculator();

        calculator.divide(inputA, inputB);
    }

    @Test
    public void sumDouble() {
        double inputA = 0.1;
        double inputB = 0.2;

        Calculator calculator = new Calculator();
        double result = calculator.sumDouble(inputA, inputB);

        Assert.assertEquals((inputA + inputB), result);
    }

    @Test
    public void testSumBigNumber() {

        //Given
        int inputA = 2000000000;
        int inputB = 2000000000;

        //When
        ICalculator calculator = new Calculator();
        int result = calculator.sum(inputA, inputB);

        //Then
        Assert.assertEquals("Sum operation failed.", (inputA + inputB), result);
    }
}
