package calculator;

public class Calculator implements ICalculator {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    public double sumDouble(double a, double b) {
        return a + b;
    }

    public double divideDouble(double a, double b) {
        return a / b;
    }

    public double multiplyDouble(double a, double b) {
        return a * b;
    }

    public double subtractDouble(double a, double b) {
        return a - b;
    }
}
