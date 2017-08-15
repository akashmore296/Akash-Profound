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
		int decimalNumber=Integer.parseInt(args[0]);
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter The length of string that you want");
		System.out.println("4.Number<15");
		System.out.println("8.Number<255");
		int byteString=Scanner.nextInt();
		int digits[]=new int[byteString];
		int digitCounter=0;
		temp=decimalNumber;
		for(int i=0;temp!=0;i++)
		{
			reminder=temp%2;
			temp=temp/2;
			digits[i]=reminder;	
			digitCounter++;
		}
		System.out.println("Binary Equivalent of "+decimalNumber+" is ");
		for(int i=byteString-1;i>=0;i--)
		{
			System.out.print(digits[i]);
		}	
	}
}