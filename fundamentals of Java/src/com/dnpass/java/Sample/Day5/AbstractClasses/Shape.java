package com.dnpass.java.Sample.Day5.AbstractClasses;


public abstract class Shape 
{
	protected String name;
	 public Shape(String Shapename)
	 {
		 name = Shapename;
	 }
	 
	 public void setShape(String Shapename)
	 {
		 name = Shapename;
	 }
	 public String getShape()
	 {
		 return name;
	 }
	 abstract public float calculateArea(); 

}