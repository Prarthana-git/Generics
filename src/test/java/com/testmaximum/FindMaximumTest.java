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
/**
 * Function to test if first float position is maximum
 */
@Test
public void firstFloatPosition_ifMaximum_returnsFirstPosition()
{
	TestMaximum maximum=new TestMaximum();
	float max=maximum.findMaximumFloat((float)8.7,(float)8.8,(float)8.9);
	Assert.assertEquals(8.9,max,0.01);
}

/**
 * Function to test if second float position is maximum
 */
@Test
public void secondFloatPosition_ifMaximum_returnsSecondPosition() {
    TestMaximum maximum = new TestMaximum();
    double max = maximum.findMaximumFloat((float)8.7, (float)8.8, (float)8.9);
    Assert.assertEquals(8.9,max,0.01);
}

/**
 * Function to test if third float position is maximum
 */
@Test
public void thirdFloatPosition_ifMaximum_returnsThirdPosition() {
    TestMaximum maximum = new TestMaximum();
    double max = maximum.findMaximumFloat((float)8.7, (float)8.8, (float)8.9);
    Assert.assertEquals(8.9, max, 0.01);
}
}
























