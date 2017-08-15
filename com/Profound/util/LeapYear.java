package com.Profound.util;

public class LeapYear {
	
	public static void main(String arg[]) {
		int year=Integer.parseInt(arg[0]);
		boolean isLeapYear=(year%4==0);
		isLeapYear=isLeapYear && (year%100!=0) || (year%400==0);
		if(isLeapYear==true)
		{
			System.out.println(year+" is Leap Year");
		}
		else
		{
			System.out.println(year+" not is Leap Year");
		
		}
	}
}					