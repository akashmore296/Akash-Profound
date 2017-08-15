/******************************************************************************
 *  Purpose: Find Out 2nd largest and smallest no from array
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

import java.util.Scanner;

public class SecondLargeSmall
{
	
	public static void main(String args[])
	{
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int noOfElements=Scanner.nextInt();
		int array[]=new int[noOfElements];
		System.out.println("Enter the elements of array");
		for(int i=0;i<noOfElements;i++)
		{
			array[i]=Scanner.nextInt();
		}
		int largest=array[0];
		int secondLargest=array[0];
		for(int i=0;i<noOfElements;i++)
		{
			if (array[i]>largest)
			{			
				secondLargest=largest;
				largest=array[i];
			}
			else if(array[i]<largest && array[i]>secondLargest)
			{
				secondLargest=array[i];
			}
		}
		System.out.println(secondLargest+" is Second largest number");
	}
}
		