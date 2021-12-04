package com.dnpass.java.Samples.Day2;

import java.util.Scanner;

public class sampleday2minimumofttwonumbers {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Entered value of a:");
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Entered value of b:");
		b=sc.nextInt();
		sc.close();
		if(a<b)
		{
			System.out.println("a is minimum number");
		}
		else if(b<a)
		{
			System.out.println("b is minimum number");
		}
		else
		{
			System.out.println("both are same number");
		}
			
		
		
		// TODO Auto-generated method stub

	}

}
