/******************************************************************************
 *  Purpose: Calculate cos x using taylor series
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   14-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

public class Cos {
	
	static double cosx,x,temp;
    static int term;
	
	/*
	* Method returns an integer value containing fatorial value of number
	* but method returns 0 when number is equal to 1.
	*/	
	public static int factorial(int number){
		if(number==0)
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
		cosx=1;
		System.out.print((int)cosx);
		for(int i=2;term!=0;i+=2)
		{
			temp=(Math.pow(x,i))/(double)factorial(i);
			if (i % 4 == 2){
				cosx -= temp;
				System.out.print("-"+(float)(Math.pow(x,i))+"/"+(int)factorial(i));
			}
			else if (i % 4 == 0) {
				cosx += temp;
				System.out.print("+"+(float)(Math.pow(x,i))+"/"+(int)factorial(i));
			}
			term--;
		}
		System.out.println(" = " +cosx);			
	}
}