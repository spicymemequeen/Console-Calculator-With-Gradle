package ch.bbw.ceur.console_calculator;

/*
Calculator Class
@author celina urwank
@version 16.11.2018
 */

public class Calculator {

    public Calculator() { }

    public int addition(int num1, int num2) {

        long value = (long) num1 + (long) num2;

        if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
            throw new java.lang.ArithmeticException();
        }

        return num1 + num2;
    }

    public int subtraction(int num1, int num2) {

        long value = (long) num1 - (long) num2;

        if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
            throw new java.lang.ArithmeticException();
        }
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public String converterToHex(int num1) {
        return Integer.toHexString(num1);
    }

}