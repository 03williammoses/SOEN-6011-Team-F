package teamF.calc;
/*
 * F5.java
 * Version: 1.0
 * July 30, 2021
 * Copyright: Naveen Vuppula
 */

/**
 * Class which is responsible for calculating F5.
 */
public class F5 {
    /**
     * Method to calculate the value of function F5 by taking input values.
     */
    public double calc_F5(double a, double base, int power) {
        // Check base conditions.
        if (power == 0) {
            return a;
        } else if (base == 0) {
            if (power > 0) {
                return 0;
            } else if (power < 0) {
                throw new IllegalArgumentException("Base = 0 and Power < 0 results in " 
            + "Division by Zero issue.");
            }
        } else if (a == 0) {
            return 0;
        }

        double value = 1;
        boolean isNegative = false;

        if (power < 0) {
            isNegative = true;
            power = -1 * power;
        }

        // Do base^power.
        while (power > 0) {
            if (power % 2 == 1) {
                value = value * base;
            }

            power = power / 2;
            base = base * base;
        }

        // Calculate the result.
        double result;
        if (isNegative) {
            result = a / value;
        } else {
            result = a * value;
        }
        
        //Check for infinity values.
        if (result == Double.POSITIVE_INFINITY) {
            throw new ArithmeticException("Result exceeded Maximum Value of "
        + Double.MAX_VALUE);
        } else if (result == Double.NEGATIVE_INFINITY) {
            throw new ArithmeticException("Result exceeded Minimum Value of " 
        + Double.MIN_VALUE);
        }else {
            return result;
        }
    }
}