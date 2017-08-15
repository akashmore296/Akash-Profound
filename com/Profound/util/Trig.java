/******************************************************************************
 *  Purpose: Understanding trigonametric functions
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

public class Trig {
	
	public static void main(String args[]) {
		//taking values in degrees
		double degrees=Double.parseDouble(args[0]);
		//taking values in radians
		double radians=Math.toRadians(degrees);
		double sine=Math.sin(radians);
		System.out.println("sin ("+degrees+")="+sine);
		double cos=Math.cos(radians);
		System.out.println("cos ("+degrees+")="+cos);
		double tan=Math.tan(radians);
		System.out.println("tan ("+degrees+")="+tan);
		System.out.println(sine+"/"+cos+")="+(sine/cos));
		double one=sine*sine + cos*cos;
		System.out.println(sine*sine+"+"+cos*cos+"="+one);
	}
}