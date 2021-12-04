package com.dnpass.java.Samples.Day2;

import java.util.Scanner;

public class sampleday2minimumoffournumbers {

	public static void main(String[] args) {
		int a,b,c,d;
		System.out.println("Enter value of a:");
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Entered value of b:");
		b=sc.nextInt();
		System.out.println("Enter value of c:");
		c=sc.nextInt();
		System.out.println("Enter value of d:");
		d=sc.nextInt();
		sc.close();
		if(a<b)
		{
			System.out.println("a is minimum number");
		}
		else if(b<c)
		{
			System.out.println("b is minimum number");
		}
		else if(c<d)
		{
			System.out.println("c is minimum number");
		}
		else if(d<a)
		{
			System.out.println("d is minimum number");
		}
		else
		{	
			System.out.println("Four numbers are same");
		}
		// TODO Auto-generated method stub

	}

}
