package com.dnpass.java.Samples.Day2;

import java.util.Scanner;

public class sampleday2minimumofthreenumbers
{
	public static void main(String[] args)
  {	
	int a,b,c;
	System.out.println("Enter value of a:");
	Scanner sc =new Scanner(System.in);
	a=sc.nextInt();
	System.out.println("Entered value of b:");
	b=sc.nextInt();
	System.out.println("Enter value of c:");
	c=sc.nextInt();
	sc.close();
	if(a<b)
	{
		System.out.println("a is minimum number");
	}
	else if(b<c)
	{
		System.out.println("b is minimum number");
	}
	else if(c<a)
	{
		System.out.println("c is minimum number");
	}
	else
	{
		System.out.println("Three Numbers are same");
	}
  }

}
