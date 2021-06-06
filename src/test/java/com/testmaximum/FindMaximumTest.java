package com.testmaximum;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

	/**
     * UC1.1, UC1.2 and UC1.3
     */
    @Test
    public void MaxValueAtFirstPosition() {
        Integer max = TestMaximum.findMax(9,3,2);
        Assert.assertSame(9, max);
    }

    @Test
    public void MaxValueAtSecondPosition() {
        Integer max = TestMaximum.findMax(3,7,2);
        Assert.assertSame(7, max);
    }

    @Test
    public void MaxValueAtThirdPosition() {
        Integer max = TestMaximum.findMax(2,3,8);
        Assert.assertSame(8, max);
    }

    /**
     * testcase when all elements have same value
     */
    @Test
    public void CheckMaxWhenAllElementAreSame() {
        Integer max = TestMaximum.findMax(9,9,9);
        Assert.assertSame(9, max);
    }


    /**
     * UC2..testcases
     */
    @Test
    public void firstFloatMaxValueReturnFirst() {
        Float max = TestMaximum.findMax(9.01f, 6.01f, 3.01f);
        Assert.assertThat(max, CoreMatchers.equalTo(9.01f));
    }

    @Test
    public void secondFloatMaxValueReturnSecond() {
        Float max = TestMaximum.findMax(3.01f, 9.01f, 6.01f);
        Assert.assertThat(max, CoreMatchers.equalTo(9.01f));
    }

    @Test
    public void thirdFloatMaxValueReturnThird() {
        Float max = TestMaximum.findMax(6.01f, 3.01f, 9.01f);
        Assert.assertThat(max, CoreMatchers.equalTo(9.01f));
    }

    /**
     * UC3: testcases..
     */
    @Test
    public void firstStringMaxReturnFirst() {
        String max = TestMaximum.findMax("Girl","Boy","Animal");
        Assert.assertThat(max, CoreMatchers.equalTo("Girl"));
    }

    @Test
    public void secondStringMaxReturnSecond() {
        String max = TestMaximum.findMax("Boy","Girl","Animal");
        Assert.assertThat(max, CoreMatchers.equalTo("Girl"));
    }

    @Test
    public void thirdStringMaxReturnThird() {
        String max =TestMaximum.findMax("Boy","Animal","Girl");
        Assert.assertThat(max, CoreMatchers.equalTo("Girl"));
    }

    /**
     * After refactor the code : testcases
     */
    @Test
    public void ReturnMaxFloat() {
        Float max = TestMaximum.findAnyMax(9.01f, 6.01f, 3.01f);
        Assert.assertThat(max, CoreMatchers.equalTo(9.01f));
    }
    @Test
    public void ReturnMaxString() {
        String max = TestMaximum.findAnyMax("Boy","Girl","Animal");
        Assert.assertThat(max, CoreMatchers.equalTo("Girl"));
    }
    @Test
    public void ReturnMaxInteger() {
        Integer max = TestMaximum.findAnyMax(1, 2, 3);
        Assert.assertThat(max, CoreMatchers.equalTo(3));
    }

    /**
     * testcases for generics class
     */
    @Test
    public void anyTypeReturnMaxInteger() {
        Integer max = new TestMaximum<Integer>(1,2,3).findAnyMax();
        Assert.assertThat(max, CoreMatchers.equalTo(3));
    }
    @Test
    public void anyTypeReturnMaxFloat() {
        Float max = new TestMaximum<Float>(1.01f, 2.02f, 3.03f).findAnyMax();
        Assert.assertThat(max, CoreMatchers.equalTo(3.03f));
    }
    @Test
    public void anyTypeReturnMaxString() {
        String max = new TestMaximum<String>("Boy", "Girl", "Animal").findAnyMax();
        Assert.assertThat(max, CoreMatchers.equalTo("Girl"));
    }

    /**
     * find max more than 3 variables in parameters
     */
    @Test
    public void IntegerMaxReturnThirdMultiParameter() {
        Integer max = TestMaximum.findAnyMax(5,3,2,6,7,1,9);
        Assert.assertThat(max, CoreMatchers.equalTo(9));
    }
    @Test
    public void FloatMaxReturnThirdMultiParameter() {
        Float max = TestMaximum.findAnyMax(1.0f,5.0f,6.0f,3.0f,7.0f);
        Assert.assertThat(max, CoreMatchers.equalTo(7.0f));
    }
}
























