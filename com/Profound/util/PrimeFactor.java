/******************************************************************************
 *  Purpose: Find out the factors for number using prime factorization
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
 
package com.Profound.util;

public class PrimeFactor
{
	
	public static void main(String args[])
	{
		int Number=Integer.parseInt(args[0]);
		System.out.println("Following are the factors of "+Number);
		//finding factors using prime factorization method
		for(int i=1;i*i<=Number;i++)
		{
			if(Number%i==0)
			{
				System.out.println(i);
			}
		}
	}
}