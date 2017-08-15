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
		Scanner Scanner=new Scanner(System.in);
		//initializing array as counter for numbers
		int[] counter={0,0,0,0,0,0,0};
		System.out.println("Press 0 for Roll a dice");
		int roll=Scanner.nextInt();
		while(roll==0)
		{
			//calculate 6 faces of dice by using formulae
			double dice1=Math.random()*6+1;
			int dice=(int) dice1;
			System.out.println("Rolled no is "+dice);
			//use switch for for counting number of dice faces
			switch(dice)
			{
				case 1:counter[1]++;
						break;
				case 2:counter[2]++;
						break;
				case 3:counter[3]++;
						break;
				case 4:counter[4]++;
						break;
				case 5:counter[5]++;
						break;
				case 6:counter[6]++;
						break;
				default :System.out.println("Something went wrong");
							break;
			}
			//counter[0] is use for total no of dice rolled by user
			counter[0]++;
			System.out.println("If want to roll dice again then Press 0");
			roll=Scanner.nextInt();
		}
		//intialize times for finding out the largest counter for faces
		int times=counter[1];
		int number=1;
		//find out the largest counter of faces and store the dice face
		for(int i=1;i<7;i++)
		{
			if(times<counter[i])
			{
				number=i;
				times=counter[i];
			}	
		}
		System.out.println(number+" is repeated "+times+" times out of "+counter[0]);
	}
}		