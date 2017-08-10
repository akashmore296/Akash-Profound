/******************************************************************************
 *  Purpose: Determines Monthly Payment for Car loan
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

public class CarLoan{
	
	public static void main(String args[]){
		float P=Float.parseFloat(args[0]);
		float Y=Float.parseFloat(args[1]);
		float R=Float.parseFloat(args[2]);//taking arguements from user
        float n=12*Y;
		float r=R/(12*100);
		double x=Math.pow(1+r,(-n));
		double payment=(P*r)/(1-x);//calculating payments using formulae
		System.out.println("Monthly payments Over the "+Y+" Years is "+payment);
	}
}
		

		
		