/******************************************************************************
 *  Purpose: To calculate future and present value
 *  
 *  @author  Akash More
 *  @version 1.0
 *  @since   19-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

public class CompoundFutureAndPresent{
	
	static double dollars, period, futureValue,compoundInterest,presentValue;

	//Method returns future value by using formulae
	public static double futureValue(double c, double r, double t){
		futureValue=c*(Math.pow((1+r),t));
		return futureValue;
	}
	
	//Method returns presentValue value by using formulae
	public static double presentValue(double c, double r, double t){
		presentValue=c/(Math.pow((1+r),t));
		return presentValue;
	}
  
	public static void main(String[]args){
		dollars = Double.parseDouble(args[0]);
		compoundInterest = Double.parseDouble(args[1]);
		period = Double.parseDouble(args[2]);
		System.out.println("Amount of money u will have if u invested "+dollars+
		" dollars today is "+futureValue(dollars,compoundInterest,period));
		System.out.println("Amount of money that would have to be investet now is "
		+presentValue(dollars,compoundInterest,period));
	}
}
	
	
	