package com.dnpass.java.Sample.Day5.AbstractClasses;

public class SamplesDay52dArrayUsingForloop {

	public static void main(String[] args) {
		int[][] values = { { 4,7,9 }, { 13,67,78 }, { 24, 58, 69 } };
        
        System.out.println("Elements are :");
        for(int i=0; i< values.length; i++) {
                for(int j=0; j< values[i].length; j++) {
                        System.out.print(values[i][j] + "\t");
                }
                System.out.println("");
        }
		// TODO Auto-generated method stub

	}

}
