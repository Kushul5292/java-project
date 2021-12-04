package com.dnpass.java.Samples.Day3;
import java.util.Scanner;
public class sampleday3smallestofthreenumbers {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		System.out.println("Enter the first number");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		System.out.println("Enter the Second number");
		num2=sc.nextInt();
		System.out.println("Enter the Third number");
		num3=sc.nextInt();
		if(num1<num2 && num1<num3)
		{
			System.out.println("num1 is smaller number");
		}
		else if(num2<num1 && num2<num3)
		{
			System.out.println("num2 is smaller number");
		}
		else if(num3<num1 && num3<num2)
		{
			System.out.println("num3 is smaller number");
		}
		else
		{
			System.out.println("Invalid number");
		}
			
			
		
		// TODO Auto-generated method stub

	}

}
