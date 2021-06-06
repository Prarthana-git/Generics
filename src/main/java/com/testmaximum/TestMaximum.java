package com.testmaximum;

public class TestMaximum {
	
    Integer num1;
    Integer num2;
    Integer num3;

    TestMaximum() {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    public Integer findMaximumInteger(Integer num1, Integer num2, Integer num3) {
        //num1 is largest so far
        Integer max = num1;
        if (num2.compareTo(max) > 0) {
            //num2 is largest so far
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            //num3 is largest so far
            max = num3;
        }
        return max;
    }
}
