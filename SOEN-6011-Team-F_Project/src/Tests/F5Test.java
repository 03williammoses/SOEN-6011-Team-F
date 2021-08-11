package Tests;

/*
 * F5Test.java
 * Version: 1.0
 * July 30, 2021
 * Copyright: Naveen Vuppula
 */

import org.junit.Assert;
import org.junit.Test;

import teamF.calc.F5;

/**
 * Class which is responsible for unit testing F5.
 */
public class F5Test {
    
    F5 f5obj = new F5();
    
    /**
     * Test case: 1, Requirement ID: 1
     */
    @Test
    public void test1() {
        double a = 10;
        double base = 20;
        int power = 5;
        Assert.assertEquals(3.2E7, f5obj.calc_F5(a, base, power), 0.00000000001);
    }
    
    /**
     * Test case: 2, Requirement ID: 2
     */
    @Test
    public void test2() {
        double a = 125.89;
        double base = 20.77;
        int power = 3;
        Assert.assertEquals(1127978.24379937, f5obj.calc_F5(a, base, power), 0.00000000001);
    }
    
    /**
     *  Test case: 3, Requirement ID: 3
     */
    @Test
    public void test3() {
        double a = 16;
        double base = -4;
        int power = -5;
        Assert.assertEquals(-0.015625, f5obj.calc_F5(a, base, power), 0.00000000001);
    }
    
    /**
     * Test case: 4, Requirement ID: 3
     */
    @Test
    public void test4() {
        double a = -17;
        double base = -18;
        int power = -13;
        Assert.assertEquals(8.164063143585415E-16, f5obj.calc_F5(a, base, power), 0.00000000001);
    }
    
    /**
     * Test case: 5, Requirement ID: 4
     */
    @Test
    public void test5() {
        double a = 78.46;
        double base = 9.12;
        int power = 3;
        Assert.assertEquals(59515.874426879986, f5obj.calc_F5(a, base, power), 0.00000000001);
    }
    
    /**
     * Test case: 6, Requirement ID: 4
     */
    @Test
    public void test6() {
        double a = -67.4;
        double base = -34.5;
        int power = -6;
        Assert.assertEquals(-3.99710287578037E-8, f5obj.calc_F5(a, base, power), 0.00000000001);
    }
    
    /**
     * Test case: 7, Requirement ID: 5
     */
    @Test
    public void test7() {
        double a = -12.64;
        double base = 8.3;
        int power = 0;
        Assert.assertEquals(-12.64, f5obj.calc_F5(a, base, power), 0.00000000001);
    }

    /**
     * Test case: 8, Requirement ID: 5
     */
    @Test
    public void test8() {
        double a = 79.43;
        double base = 0;
        int power = 0;
        Assert.assertEquals(79.43, f5obj.calc_F5(a, base, power), 0.00000000001);
    }
    
    /**
     * Test case: 9, Requirement ID: 6
     */
    @Test
    public void test9() {
        double a = -198.34;
        double base = 0;
        int power = 5;
        Assert.assertEquals(0.0, f5obj.calc_F5(a, base, power), 0.00000000001);
    }
    
    /**
     * Test case: 10, Requirement ID: 7
     */
    @Test(expected = IllegalArgumentException.class)
    public void test10() {
        double a = 18;
        double base = 0;
        int power = -19;
        f5obj.calc_F5(a, base, power);
    }
    
    /**
     * Test case: 11, Requirement ID: 8
     */
    @Test
    public void test11() {
        double a = 547.8;
        double base = 158.992;
        int power = 81;
        Assert.assertEquals(1.1220677971207875E+181, f5obj.calc_F5(a, base, power), 0.00000000001);
    }
    
    /**
     * Test case: 12, Requirement ID: 9
     */
    @Test
    public void test12() {
        double a = 0.0001245;
        double base = -0.00000000456;
        int power = 6;
        Assert.assertEquals(1.1193306795214109E-54, f5obj.calc_F5(a, base, power), 0.00000000001);
    }
    
    /**
     * Test case: 13, Requirement ID: 10
     */
    @Test(expected = ArithmeticException.class)
    public void test13() {
        double a = 178.32;
        double base = 89.9324561;
        int power = 512;
        f5obj.calc_F5(a, base, power);
    }
    
    /**
     * Test case: 14, Requirement ID: 10
     */
    @Test(expected = ArithmeticException.class)
    public void test14() {
        double a = -912.34;
        double base = 567.87;
        int power = 890;
        f5obj.calc_F5(a, base, power);
    }
    
    /**
     * Test case: 15, Requirement ID: 11
     */
    @Test(expected = NumberFormatException.class)
    public void test15() {
        double a = 12.54;
        String base = "7.8st";
        int power = 9;
        f5obj.calc_F5(a, Double.parseDouble(base), power);
    }
}