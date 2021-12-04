package com.dnpass.java.Sample.Day1;
import java.util.Scanner;

public class sampleday1fizzbuzz {

		public static void main(String[] args) {
		    int a=3,b=5;
		    for(int i=1;i<=100;i++)
		    {
		      if(i%a==0 && i%b==0)
		      {	
		    		System.out.println(+i+"Fizz Buzz");
		      }
		      else if(i%a==0)
		      {
		        System.out.println(+i+"Fizz");
		      }
		      else if(i%b==0)
		      {
		        System.out.println(+i+"Buzz"); 
		      }
		      else
		      {
		    	  System.out.println(i);
		      }
		    }


	}

}
