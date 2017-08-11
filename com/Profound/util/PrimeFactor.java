/******************************************************************************
 *  Purpose: Find out the factors for number
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
		//take no for factorization from user
		int N=Integer.parseInt(args[0]);
		System.out.println("Following are the factors of "+N);
		//finding factors using prime factorization method
		for(int i=1;i*i<=N;i++)
		{
			if(N%i==0)
			{
				System.out.println(i);
			}
		}
	}
}