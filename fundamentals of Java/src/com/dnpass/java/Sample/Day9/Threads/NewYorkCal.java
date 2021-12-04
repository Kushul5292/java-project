package com.dnpass.java.Sample.Day9.Threads;
import java.util.Calendar;
import java.util.TimeZone;

public class NewYorkCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calNewYork = Calendar.getInstance();
		calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		System.out.println("the time in New York :"+ calNewYork.get(Calendar.HOUR_OF_DAY) 
		+":"+calNewYork.get(Calendar.MINUTE) +":"+ calNewYork.get(Calendar.SECOND));
		
		
		Calendar cal= Calendar.getInstance();
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

}
