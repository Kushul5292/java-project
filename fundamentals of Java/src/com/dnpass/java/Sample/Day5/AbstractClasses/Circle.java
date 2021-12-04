package com.dnpass.java.Sample.Day5.AbstractClasses;
public class Circle extends Shape{
	final double pi = Math.PI;
	private int r;
	public Circle(String Shapename,int radius)
	{
		super(Shapename);
		this.r = radius;
		
	}	
	public float calculateArea()
	{
		
		return  (float) (pi * Math.pow(r, 2));
	}
	public void display()
	{
		System.out.format("%.2f%n",calculateArea());
	}

}