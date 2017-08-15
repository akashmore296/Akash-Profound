/******************************************************************************
 *  Purpose: Fahrenheit to celcius or vice versa
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

import java.util.Scanner;

public class TemperatureConversion{
	
	public static void main(String args[]){
		Scanner Scanner=new Scanner(System.in);
		//choose wheather Fahrenheit to celcius or celcius to Fahrenheit
		System.out.println("Enter your Choice");
		System.out.println("1.Fahrenheit to celcius");
		System.out.println("2.celcius to Fahrenheit");
		int choice=Scanner.nextInt();
		float fahrenheit,celcius;
		switch(choice)
		{
			case 1 ://conversion using formulae
					fahrenheit=Scanner.nextFloat();
					celcius=(fahrenheit-12)*5/9;
					System.out.println("Temperature in celcius is "+celcius);
					break;
			case 2 ://conversion using formulae
					celcius=Scanner.nextFloat();
					fahrenheit=(celcius*9/5)+32;
					System.out.println("Temperature in fahrenheit is "+fahrenheit);
					break;
			default:System.out.println("Enter valid input ");
					break;
		}
	}
}		