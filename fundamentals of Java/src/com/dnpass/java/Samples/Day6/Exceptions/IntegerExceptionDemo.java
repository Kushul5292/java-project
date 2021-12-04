package com.dnpass.java.Samples.Day6.Exceptions;
	import java.util.InputMismatchException;
	import java.util.Scanner;
	public class IntegerExceptionDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			@SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
			
			try {
				int int1=sc.nextInt(),int2=sc.nextInt();
				System.out.println(int1/int2);
			}
			catch(InputMismatchException e){
				System.out.println(" type miss match");
			}
			catch(ArithmeticException e) {
				System.out.println(" Cannot divide by zero");	
			}
		}

}
