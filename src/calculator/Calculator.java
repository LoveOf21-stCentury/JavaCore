package calculator;

/**
 * Calculator
 */
public class Calculator {
    public int a;
    public int b;

    /**
     * a + b
     * @param a addend
     * @param b addend
     */

    public void plus(int a, int b) {
        System.out.println(a + b);
    }

    /**
     * a - b
     * @param a minuend
     * @param b subtrahend
     */
    public void minus(int a, int b) {
        System.out.println(a - b);
    }

    /**
     * a * b
     * @param a multiplicand
     * @param b multiplying
     */
    public void multi(int a, int b) {
        System.out.println(a * b);
    }

    /**
     * a / b
     * @param a dividend
     * @param b divisor
     */
    public void division(int a, int b) {
        System.out.println(a / b);
    }
}
