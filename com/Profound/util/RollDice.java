/******************************************************************************
 *  Purpose: Roll a dice and find out highest probability
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   12-08-2017
 *
 ******************************************************************************/


package com.Profound.util;

import java.util.Scanner;

public class RollDice
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		//initializing array as counter for numbers
		int[] a={0,0,0,0,0,0,0};
		//take input from user for rolling the dice 
		System.out.println("Press 0 for Roll a dice");
		int roll=s.nextInt();
		//roll the dice as much time user wants by using for loop
		while(roll==0)
		{
			//calculate 6 faces of dice by using formulae
			double dice1=Math.random()*6+1;
			int dice = (int) (dice1);
			System.out.println("Rolled no is "+dice);
			//use switch for for counting number of dice faces
			switch(dice)
			{
				case 1:a[1]++;
						break;
				case 2:a[2]++;
						break;
				case 3:a[3]++;
						break;
				case 4:a[4]++;
						break;
				case 5:a[5]++;
						break;
				case 6:a[6]++;
						break;
				default :System.out.println("Something went wrong");
							break;
			}
			//a[0] is use for total no of dice rolled by user
			a[0]++;
			System.out.println("If want to roll dice again then Press 0");
			roll=s.nextInt();
		}
		//intialize times for finding out the largest counter for faces
		int times=a[1];
		int number=1;
		//find out the largest counter of faces and store the dice face
		for(int i=1;i<7;i++)
		{
			if(times<a[i])
			{
				number=i;
				times=a[i];
			}
			
		}
		//print the face with no of times that is repeated
		System.out.println(number+" is repeated "+times+" times out of "+a[0]);
	}
}














				