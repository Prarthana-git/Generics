package com.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
private TestMaximum testMaximum;
int maximumNumber;


/**
 * Function to test if first integer position is maximum
 */
@Test
public void firstPosition_ifMaximum_returnFirstPosition()
{
	testMaximum= new TestMaximum();
	maximumNumber=testMaximum.findMaximumInteger(2,3,1);
	Assert.assertEquals(3, maximumNumber);
	
}

/**
 * Function to test if second integer position is maximum
 */
@Test
public void secondPosition_ifMaximum_returnsThirdPosition()
{
	testMaximum = new TestMaximum();
    maximumNumber = testMaximum.findMaximumInteger(2, 3, 1);
    Assert.assertEquals(3, maximumNumber);
}
/**
 * Function to test if third integer position is maximum
 */
@Test
public void thirdPosition_ifMaximum_returnsThirdPosition() {
    testMaximum = new TestMaximum();
    maximumNumber = testMaximum.findMaximumInteger(2, 3, 1);
    Assert.assertEquals(3, maximumNumber);
}
}