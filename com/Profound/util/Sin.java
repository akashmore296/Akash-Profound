/******************************************************************************
 *  Purpose: Calculate sin x using taylor series
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   14-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

public class Sin {
	
	static double sinx,x,temp;
    static int term;
	
	/*
	* Method returns an integer value containing fatorial value of number
	* but method returns 0 when number is equal to 1.
	*/	
	public static int factorial(int number){
		if(number==1)
		return 0;
		int fact=1;
		for(int i=1;i<=number;i++){
		fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String args[]) {
		x = Double.parseDouble(args[0]);
		term = Integer.parseInt(args[1]);
		x = x%(2*Math.PI);
		term--;
		sinx=x;
		System.out.print(x);
		for(int i=3;term!=0;i+=2)
		{
			temp=(Math.pow(x,i))/(double)factorial(i);
			if (i % 4 == 1){
				sinx -= temp;
				System.out.print("-"+(float)(Math.pow(x,i))+"/"+(int)factorial(i));
			}
			else if (i % 4 == 3) {
				sinx += temp;
				System.out.print("+"+(float)(Math.pow(x,i))+"/"+(int)factorial(i));
			}
			term--;
		}
		System.out.println(" = " +sinx);			
	}
}