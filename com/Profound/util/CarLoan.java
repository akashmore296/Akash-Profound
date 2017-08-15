/******************************************************************************
 *  Purpose: Determines Monthly Payment for Car loan
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

public class CarLoan {
	
	public static void main(String args[]){
		float principal=Float.parseFloat(args[0]);
		float year=Float.parseFloat(args[1]);
		float rate=Float.parseFloat(args[2]);
        float n=12*year;
		float r=rate/(12*100);
		double x=Math.pow(1+r,(-n));
		double payment=(principal*r)/(1-x);//calculating payments using formulae
		System.out.println("Monthly payments Over the "+year+" Years is "+payment);
	}
}