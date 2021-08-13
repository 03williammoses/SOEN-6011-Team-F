package Tests;

import java.util.InputMismatchException;

import org.junit.Assert;
import org.junit.Test;

import teamF.calc.F2;
/**
 * This class is used to test the basic reqirements for the tangent function
 * 
 * @author William Moses Stalin Jebadoss
 * @studentID 40186129
 *
 */
public class F2Test {
	
	/**
	 * 
	 * This testcase will evaluate the value of
	 * invalid input which is an odd multiple of pi/2
	 * 
	 */
    @Test
    public void test1() {
        double x = 270;
        try {
        	F2.getTanX(String.valueOf(x));
		} catch (InputMismatchException e) {
			Assert.assertEquals(e.getMessage(),"Value must not be the odd multiple of pi/2");
		}
    }
    
	/**
	 * 
	 * This testcase will evaluate the value of 
	 * invalid input which is an odd multiple of pi/2
	 * 
	 */
    @Test
    public void test2() {
        double x = 90;
        try {
        	F2.getTanX(String.valueOf(x));
		} catch (InputMismatchException e) {
			Assert.assertEquals(e.getMessage(),"Value must not be the odd multiple of pi/2");
		}
    }
    
    /**
     * This testcase will evaluate the value of Positive input
     */
    @Test
    public void test3() {
        double x = 290;
        Assert.assertEquals(F2.getTanX(String.valueOf(x)), "-2.74749");
    }
    
    /**
     * This testcase will evaluate the value of Negative input
     */
    @Test
    public void test4() {
        double x = -160;
        Assert.assertEquals(F2.getTanX(String.valueOf(x)), "0.36397");
    }
    
    /**
     * This testcase will evaluate reducing the angle to lay between 0 and 180
     */
	@Test
    public void test5() {
        double x = 275;
        Assert.assertEquals(String.valueOf(F2.reducesAnguleTaxX(x)), "95.0");
    }
	
	/**
	 * This testcase will evaluate the NaN as input
     */
	@Test
    public void test6()  {
        double x = 60;
		Assert.assertNotEquals(F2.getTanX(String.valueOf(x)),"Value is NaN or not finite");
    }
	
	/**
	 * This testcase will evaluate the NaN as input
     */
	@Test
    public void test7()  {
        double x = Double.NaN;
        try {
			String.valueOf(F2.getTanX(String.valueOf(x)));
		} catch (ArithmeticException e) {
			Assert.assertEquals(e.getMessage(),"Value is NaN or not finite");
		}
    }

	/**
	 * This testcase will evaluate a single space spring as input
     */
	@Test
    public void test8() {
		try {
			String.valueOf(F2.getTanX(" "));
		} catch (NumberFormatException e) {
			Assert.assertEquals(e.getMessage(),"Input should be a real number");
		}
    }
	
	/**
	 * This testcase will evaluate a single space spring as input
     */
	@Test
    public void test9() {
		try {
			String.valueOf(F2.getTanX("abcd"));
		} catch (NumberFormatException e) {
			Assert.assertEquals(e.getMessage(),"Input should be a real number");
		}
    }
	
	/**
	 * This testcase will evaluate a single space spring as input
     */
	@Test
    public void test10() {
		Assert.assertEquals(F2.getTanX("-1"),"-0.01746");
    }
}