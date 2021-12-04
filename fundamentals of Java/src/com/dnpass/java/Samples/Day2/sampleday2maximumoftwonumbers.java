package com.dnpass.java.Samples.Day2;

import java.util.Scanner;

public class sampleday2maximumoftwonumbers {

	public static void main(String[] args) {
	    System.out.println("Enter the Value of a : ");
	    Scanner sc = new Scanner(System.in);
	    int a=sc.nextInt();
	    System.out.println("Enter the value of b :");
	    int b=sc.nextInt();
	    if(a>b)
	    {
	      System.out.println("a is a maximum Number...! ");
	    }
	    else if(a<b)
	    {
	      System.out.println("b is a maximum Number...! ");
	    }
	    else
	    {
	    	System.out.println("Both are same numbers");
	    }
	    	
	    
	}

}
