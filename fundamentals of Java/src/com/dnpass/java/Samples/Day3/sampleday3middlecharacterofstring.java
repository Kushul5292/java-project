package com.dnpass.java.Samples.Day3;
import java.util.Scanner;
public class sampleday3middlecharacterofstring {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println("The middle character of the string is:"+middle(str)+"\n");
	}
	
	public static String middle(String str)
	{
		int position;
		int length;
		if(str.length() % 2 == 0)
		{
			position = str.length() / 2-1;
			length = 2;
		}
		else
		{
			position = str.length()/2;
			length = 1;
		}
		return str.substring(position,position + length);
	}

}
