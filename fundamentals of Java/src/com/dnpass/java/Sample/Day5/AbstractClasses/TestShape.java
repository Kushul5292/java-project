package com.dnpass.java.Sample.Day5.AbstractClasses;
import java.util.Scanner;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Circle\nRectangle\n Enter the Shape name");
	Scanner sc = new Scanner(System.in);
	String N = sc.nextLine();
	if(N.equals("Circle"))
	{
		System.out.println("Enter the Radius");
		int R=sc.nextInt();
		Circle c =new Circle(N,R);
		c.display();
	}
	else if(N.equals("Rectangle"))
	{
		System.out.println("Enter the Length and Breath");
		int L=sc.nextInt();
		int B=sc.nextInt();
		Rectangle r =new Rectangle(N,L,B);
		r.display();
	}
	else
	{
		System.out.println("Invalid");
	}
      
	}

}