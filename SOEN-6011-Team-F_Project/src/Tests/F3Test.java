package Tests;

import java.util.InputMismatchException;

import org.junit.Assert;
import org.junit.Test;

import teamF.calc.F3;
/**
 * This class is used to test the basic reqirements for the hyperbolic sin function
 * 
 * @author Harsh
 * 
 *
 */
public class F3Test {
	
	
    /**
     * This testcase calculates the Positive input
     */
    @Test
    public void test3() {
        double x = 2;
        Assert.assertEquals(F3.getSinhx(String.valueOf(x)), "3.62686");
    }
    
    /**
     * This testcase calculates the Negative input
     */
    @Test
    public void test4() {
        double x = -8;
        Assert.assertEquals(F3.getSinhx(String.valueOf(x)), "-1490.47883");
    }
    
    /**
     * This testcase calculates sinh(x) value of 0
     */
	@Test
    public void test5() {
        double x = 0;
        Assert.assertEquals(F3.getSinhx(String.valueOf(x)), "0.00000");
    }
	
	
	/**
	 * This testcase will calculates the NaN as input
     */
	@Test
    public void test7()  {
        double x = Double.NaN;
        try {
			String.valueOf(F3.getSinhx(String.valueOf(x)));
		} catch (ArithmeticException e) {
			Assert.assertEquals(e.getMessage(),"Value is NaN or not finite");
		}
    }

	/**
	 * This testcase will calculates a single space string as input
     */
	@Test
    public void test8() {
		try {
			String.valueOf(F3.getSinhx(" "));
		} catch (NumberFormatException e) {
			Assert.assertEquals(e.getMessage(),"Input should be a real number");
		}
    }
	
	/**
	 * This testcase will calculates a string as input
     */
	@Test
    public void test9() {
		try {
			String.valueOf(F3.getSinhx("abcd"));
		} catch (NumberFormatException e) {
			Assert.assertEquals(e.getMessage(),"Input should be a real number");
		}
    }
	
	/**
     * This testcase will calculates the value of Negative floating input
     */
    @Test
    public void test10() {
        double x = -1.5;
        Assert.assertEquals(F3.getSinhx(String.valueOf(x)), "-2.12928");
    }
}