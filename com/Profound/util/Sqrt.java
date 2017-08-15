/******************************************************************************
 *  Purpose: Squareroot of number
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 
 package com.Profound.util;
 
 public class Sqrt {
	
	public static void main(String args[]){
		 double number = Double.parseDouble(args[0]);
		 double epsilon = 1e-15;
		 double temp = number;
		while (Math.abs(temp - number/temp) > epsilon*temp) {
            temp = (number/temp + temp) / 2.0;
        }
		System.out.println((float)temp);
	}
 }