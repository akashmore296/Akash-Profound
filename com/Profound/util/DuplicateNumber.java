/******************************************************************************
 *  Purpose: Find Out Repeated No in array
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/

 
package com.Profound.util;

import java.util.Scanner;

public class DuplicateNumber{
		
	public static void main(String[]args){
		Scanner Scanner = new Scanner (System.in);
		System.out.println("Enter the no. of elements:");
		int number=Scanner.nextInt();
		int array[]=new int[number];
		System.out.println("Enter the elements of array:");
		//store the elements of array
		for(int i=0;i<number;i++)
		{
			array[i]=Scanner.nextInt(); 
		}
		//compare and check wheater nos are same or not
		for(int i=0;i<number;i++)
		{
			for(int j=i+1;j<number;j++)
			{	
				if(array[i]==array[j])
				{
					System.out.println(array[j]+ " is a duplicte no.");
				}
			}
		}		
	}
}	