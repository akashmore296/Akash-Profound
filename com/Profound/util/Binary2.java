/******************************************************************************
 *  Purpose: decimal to binary
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   14-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

import java.util.Scanner;

public class Binary2
{
	static int decimalNumber,temp,reminder;
	public static void main(String args[])
	{
		decimalNumber=Integer.parseInt(args[0]);
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter Representation for String");
		System.out.println("Nibble.4");
		System.out.println("1 Byte.8");
		System.out.println("2 Byte.16");
		int byteString=Scanner.nextInt();
		int digits[]=new int[byteString];
		temp=decimalNumber;
		for(int i=0;temp!=0;i++)
		{
			reminder=temp%2;
			temp=temp/2;
			digits[i]=reminder;	
		}
		System.out.println("Binary Equivalent of "+decimalNumber+" is ");
		for(int i=byteString-1;i>=0;i--)
		{
			System.out.print(digits[i]);
		}	
	}
}