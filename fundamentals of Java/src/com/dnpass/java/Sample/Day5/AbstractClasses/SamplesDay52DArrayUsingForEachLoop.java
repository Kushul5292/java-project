package com.dnpass.java.Sample.Day5.AbstractClasses;

public class SamplesDay52DArrayUsingForEachLoop {

	public static void main(String[] args) {
		int [][] arrayNumber2d = {{44,52,23},{467,875,236}};
	      for(int array[]:arrayNumber2d)
	      {
	        for(int elements : array)
	        {
	          System.out.println(" " + elements);
	        }
	        System.out.println();
	      }
		// TODO Auto-generated method stub

	}

}
