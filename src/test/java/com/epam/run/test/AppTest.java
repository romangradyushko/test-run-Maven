package com.epam.run.test;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	private static int less = 1;
    private static int more = 2;
 
    public static void testAppPositiveTest() {
        Assert.assertTrue(more > less);
        System.out.println("Passed");
    }

    public static void testAppNegativeTestMore() {
        Assert.assertTrue(less > more);
    }

    public static void testAppNegativeTestEquals() {
        Assert.assertTrue(less == more);
    }

}
