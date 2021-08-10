package Tests;

import org.junit.Assert;
import org.junit.Test;

import teamF.calc.F2;

public class F2Test {
	
	/**
	 * Invalid Output
	 */
    @Test
    public void test1() {
        double x = 270;
        Assert.assertEquals(F2.getTanX(x), "Error :Value must not be the odd multiple of pi/2");
    }
    
    /**
     * Valid Positive Input
     */
    @Test
    public void test2() {
        double x = 290;
        Assert.assertEquals(F2.getTanX(x), "-2.74749");
    }
    
    /**
     * Valid Negative Input
     */
    @Test
    public void test3() {
        double x = -160;
        Assert.assertEquals(F2.getTanX(x), "0.36397");
    }
    
    /**
     * Reducing the angle to lay between 0 and 180
     */
	@Test
    public void test4() {
        double x = 275;
        Assert.assertEquals(String.valueOf(F2.reducesAnguleTaxX(x)), "95.0");
    }
	
	
}