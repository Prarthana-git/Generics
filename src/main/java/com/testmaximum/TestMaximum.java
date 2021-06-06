package com.testmaximum;
import java.util.*;
import java.lang.Comparable;

public class TestMaximum {
 
public static void main(String[] args)
  {
    @SuppressWarings("unchecked")
    List<Integer> integerList=new ArrayList<>(List.of(3,2,1,4,5));
    List<String> stringList=new ArrayList<>(List.of("H","A","S","I"));
    List<String> floatList=new ArrayList<>(List.of("5.1","4.1","3.1","1.1"));
 
    sortArrays(integerList,stringList,floatList);
    System.out.println(integerList);
    System.out.println(stringList);
    System.out.println(floatList);
  
  }
/**
 * This function is used to sort the arraylist using wildcard objects
 * @param arr
 */

private static void sortArrays(List<? extends Comparable>... arr) {
	for (List<? extends Comparable> list : arr) {
        Collections.sort(list);
        System.out.println(Collections.max(list));
	
  }    
 }
}
 