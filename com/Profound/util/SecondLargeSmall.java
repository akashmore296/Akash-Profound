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
		Scanner sc=new Scanner(System.in);
		int a[]=new int[100];
		System.out.println("Enter the no of elements");
		int noOfElements=sc.nextInt();
		System.out.println("Enter the elements of array");
		for(int i=0;i<noOfElements;i++)
		{
			a[i]=sc.nextInt();
		}
		int largest=a[0];
		int secondLargest=a[0];
		for(int i=0;i<noOfElements;i++)
		{
			if (a[i]>largest)
			{			
				secondLargest=largest;
				largest=a[i];
			}
			else if(a[i]<largest && a[i]>secondLargest)
			{
				secondLargest=a[i];
			}
		}
		System.out.println(secondLargest+" is Second largest number");
	}
}
		
	
