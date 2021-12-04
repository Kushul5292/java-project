package com.dnpass.java.Samples.Day2;

import java.util.Scanner;

public class sampleday2postiveornegetiveorzero {

	public static void main(String[] args) {
		int a;
	    System.out.println("Enter the Value of A : ");
	    Scanner sc = new Scanner(System.in);
	    a=sc.nextInt();
	    if(a<0)
	    {
	      System.out.println("The Entered Value is "+a);
	      System.out.println("& it is Negative Number...! ");
	    }
	    else if(a>0)
	    {
	      System.out.println("The Entered Value is "+a);
	      System.out.println("& it is Positive Number...! ");
	    }
	    else
	    {	
	    	System.out.println("The Entered value is "+a);
	    	System.out.println("& it is zero...!");
	    }
		// TODO Auto-generated method stub

	}

}
