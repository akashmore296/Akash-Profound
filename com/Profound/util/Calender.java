/******************************************************************************
 *  Purpose: Print calender and calculate day of the week
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   17-08-2017
 *
 ******************************************************************************/
 
package com.Profound.util;

import java.util.Scanner;

public class Calender {
	
	static int day,year,month;
	static String dayName;
	static int x,y1,m1,d1;
	
	/* this method takes day month and year from user and calculates which day falls of
	 * the week Returns 0 for Sunday, 1 for Monday, and so on */
	public static int day(int day,int month,int year){
		y1=year-(14-month)/12;
		x=y1+y1/4-y1/100+y1/400;
		m1=month+12*((14-month)/12)-2;
		d1=(day+x+(31*m1)/12)%7;
		return d1;
	}
	
	/* this method returns true if the given year is a leap year and 
	 *	returns false if the given year is not leap year */
	public static boolean isLeapYear(int year) {
        if  ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) return true;
        return false;
    }
		
	/* this method takes day of the week from the day method and return 
	  string which is the name of the day */
	public static String dayOfWeek(int day,int month,int year){
		d1=day(day,month,year);
		switch(d1){
			case 0:dayName="Day of the week is Sunday ";
			break;
			case 1:dayName="Day of the week is Monday " ;
			break;
			case 2:dayName="Day of the week is Tuesday " ;
			break;
			case 3:dayName="Day of the week is Wednesday" ;
			break;
			case 4:dayName="Day of the week is Thursday " ;
			break;
			case 5:dayName="Day of the week is Friday " ;
			break;
			case 6:dayName="Day of the week is Saturday " ;
			break;
		}	
		return dayName;
	}
	
	/* this method takes month and year from user and display calender 
	   for that */
	public static void displayCalender(int month,int year)
	{
		//name of the month
		String[] months = {"", "January", "February", "March","April", "May", "June",
							"July", "August", "September","October", "November", "December"};
		//days in that month
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//29 days in feb month if year is leap year
		if (month == 2 && isLeapYear(year)) 
			days[month] = 29;
		//displaying header for calender
		System.out.println("   " + months[month] + " " + year);
        System.out.println(" S\tM\tTu\tW\tTh\tF\tS");
		int startingDay = day(1, month, year);
		for (int i = 0; i < startingDay; i++)
		{
            System.out.print("\t");
		}
		for (int i = 1; i <= days[month]; i++) {
            System.out.print(i+"\t");
            if (((i + startingDay) % 7 == 0) || (i == days[month])) 
			System.out.println();
        }
	
	}
	
	
	public static void main(String args[]){
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter your Choice for Calender");
		System.out.println("1.Findout Day of the week");
		System.out.println("2.Print Calendar of Month");
		int choice=Scanner.nextInt();
		switch(choice) {
			case 1:	System.out.println("Enter the Date in DD MM YYYY format");
					day=Scanner.nextInt();
					month=Scanner.nextInt();
					year=Scanner.nextInt();
					dayName=dayOfWeek(day,month,year);
					System.out.println(dayName);
					break;
			case 2:	System.out.println("Enter the Month and Year in MM YYYY format");
					month=Scanner.nextInt();
					year=Scanner.nextInt();
					displayCalender(month,year);
					break;
			default:System.out.println("Enter valid input");
					break;
		}
	}
}
		