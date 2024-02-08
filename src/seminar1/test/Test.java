package seminar1.test;

import seminar1.calculator.Calculator;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.plus(5, 2);
        calculator.minus(5, 2);
        calculator.multi(5, 2);
        calculator.division(5, 2);
    }
}