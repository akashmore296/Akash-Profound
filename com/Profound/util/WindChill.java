/******************************************************************************
 *  Purpose: Calculating Wind chill
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

public class WindChill{
	
	public static void main(String args[]){
		//Taking values from user
		double temperature=Double.parseDouble(args[0]);
		double windSpeed=Double.parseDouble(args[1]);
		//calculating Winchill using formulae
		double windChill=35.74+0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(windSpeed,0.16);
		System.out.println("Wind Chill is: "+windChill);
 	}
}