/******************************************************************************
 *  Purpose: decimal to binary with nibble exchange
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   15-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

public class NibbleExchange {
	
	static int decimalNumber,temp,reminder;
	
	public static void main(String args[]){
		int decimalNumber=Integer.parseInt(args[0]);
		int digits[]=new int[8];
		temp=decimalNumber;
		//converting decimal no into binary no and storing each digit in array
		for(int i=0;temp!=0;i++)
		{
			reminder=temp%2;
			temp=temp/2;
			digits[i]=reminder;
		}
		System.out.println("Binary Equivalent of "+decimalNumber+" is ");
		for(int i=7;i>=0;i--)
		{
			System.out.print(digits[i]);
		}	
		System.out.println("\nBinary Equivalent of "+decimalNumber+" after nibble exchange is ");
		//exchanging nibbles
		for(int i=7,j=3;i>=4;i--,j--)
		{
			int tempDigit=digits[i];
			digits[i]=digits[j];
			digits[j]=tempDigit;
		}
		int decimalNumberAfterExchange=0;
		//displaying results of nibble exchange and converting it into decimal format
		for(int i=7;i>=0;i--)
		{
			decimalNumberAfterExchange=decimalNumberAfterExchange+digits[i]*(int)Math.pow(2,i);
			System.out.print(digits[i]);
		}	
		System.out.println("\nDecimal Equivalent after nibble exchange : "+decimalNumberAfterExchange);
	}
}