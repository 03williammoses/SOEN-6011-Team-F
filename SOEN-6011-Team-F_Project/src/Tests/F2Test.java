package Tests;

import org.junit.Assert;
import org.junit.Test;

import teamF.calc.F2;
/**
 * This class is used to test the basic reqirements for the tan(x) function
 * 
 * @author William Moses Stalin Jebadoss
 * @studentID 40186129
 *
 */
public class F2Test {
	
	/**
	 * Invalid Output
	 */
    @Test
    public void test1() {
        double x = 270;
        Assert.assertEquals(F2.getTanX(String.valueOf(x)), "Error :Value must not be the odd multiple of pi/2");
    }
    
	/**
	 * Invalid Output
	 */
    @Test
    public void test2() {
        double x = 90;
        Assert.assertEquals(F2.getTanX(String.valueOf(x)), "Error :Value must not be the odd multiple of pi/2");
    }
    
    /**
     * Valid Positive Input
     */
    @Test
    public void test3() {
        double x = 290;
        Assert.assertEquals(F2.getTanX(String.valueOf(x)), "-2.74749");
    }
    
    /**
     * Valid Negative Input
     */
    @Test
    public void test4() {
        double x = -160;
        Assert.assertEquals(F2.getTanX(String.valueOf(x)), "0.36397");
    }
    
    /**
     * Reducing the angle to lay between 0 and 180
     */
	@Test
    public void test5() {
        double x = 275;
        Assert.assertEquals(String.valueOf(F2.reducesAnguleTaxX(x)), "95.0");
    }
	
	/**
     * 
     */
	@Test
    public void test6() {
        double x = Double.NaN;
        Assert.assertEquals(String.valueOf(F2.getTanX(String.valueOf(x))), "Error :Value is NaN or not finite");
    }

	/**
     * 
     */
	@Test
    public void test7() {
        Assert.assertEquals(String.valueOf(F2.getTanX(" ")), "Error :Input should be a real number");
    }
}