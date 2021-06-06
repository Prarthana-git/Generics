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
	testMaximum= new TestMaximum(2,3,1);
	int maximumNumber=(int)testMaximum.testMaximum();
	Assert.assertEquals(3, maximumNumber);
	
}

/**
 * Function to test if second integer position is maximum
 */
@Test
public void secondPosition_ifMaximum_returnsThirdPosition()
{
	testMaximum = new TestMaximum(2,3,1);
    int maximumNumber = (int)testMaximum.testMaximum();
    Assert.assertEquals(3, maximumNumber);
}
/**
 * Function to test if third integer position is maximum
 */
@Test
public void thirdPosition_ifMaximum_returnsThirdPosition() {
    testMaximum = new TestMaximum(2,3,1);
    int maximumNumber =(int)testMaximum.testMaximum();
    Assert.assertEquals(3, maximumNumber);
}
/**
 * Function to test if first float position is maximum
 */
@Test
public void firstFloatPosition_ifMaximum_returnsFirstPosition()
{
	TestMaximum maximum=new TestMaximum(2,3,1);
	int max=(int)maximum.testMaximum();
	Assert.assertEquals(3,max,0.01);
}

/**
 * Function to test if second float position is maximum
 */
@Test
public void secondFloatPosition_ifMaximum_returnsSecondPosition() {
	TestMaximum maximum=new TestMaximum(2,3,1);
	int max=(int)maximum.testMaximum();
    Assert.assertEquals(3,max,0.01);
}

/**
 * Function to test if third float position is maximum
 */
@Test
public void thirdFloatPosition_ifMaximum_returnsThirdPosition() {
	TestMaximum maximum=new TestMaximum(2,3,1);
	int max=(int)maximum.testMaximum();
    Assert.assertEquals(3, max, 0.01);
}

/**
 * Function to test if first string position is maximum
 */
@Test
public void firstStringPosition_ifMaximu_returnsFirstPosition()
{
	TestMaximum maximum=new TestMaximum("Apple","Peach","Banana");
	String max=(String)maximum.testMaximum();
	Assert.assertEquals("Peach",max);
	
}
@Test
public void secondStringPosition_ifMaximum_returnsSecondPosition() {
    TestMaximum maximum = new TestMaximum("Apple", "Peach", "Banana");
    String max = (String) maximum.testMaximum();
    Assert.assertEquals("Peach", max);
}
/**
 * Function to test if third string position is maximum
 */
@Test
public void thirdStringPosition_ifMaximum_returnsThirdPosition() {
    TestMaximum maximum = new TestMaximum("Apple", "Peach", "Banana");
    String max = (String) maximum.testMaximum();
    Assert.assertEquals("Peach", max);
}
}
























