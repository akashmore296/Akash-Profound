/******************************************************************************
 *  Purpose: decimal to binary
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

public class Binary
{
	static int decimalNumber,binaryNumber=0,temp,reminder,base=1;
	public static void main(String args[])
	{
		int decimalNumber=Integer.parseInt(args[0]);
		temp=decimalNumber;
		while(temp!=0)
		{
			reminder=temp%2;
			temp=temp/2;
			binaryNumber=binaryNumber+reminder*base;
			base=base*10;
		}
	System.out.println("Binary equivalent of "+decimalNumber+" is "+binaryNumber);
	}
}
		
