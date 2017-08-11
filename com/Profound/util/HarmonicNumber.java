/******************************************************************************
 *  Purpose: Find out the Harmonic Number
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

public class HarmonicNumber
{
	
	public static void main(String[]args)
	{	
		//taking n for series from user
		int n = Integer.parseInt(args[0]);
		double sum=0;
		System.out.println("Harmonic series is:");
		//Printing and calculating the harmonic series
		for(int i=1;i<=n;i++)
		{
		System.out.print("1/"+i+" + ");
		sum=sum + (1.0/i);
		}
		//calculating the sum for harmonic series
		System.out.print("="+sum);
	}
}