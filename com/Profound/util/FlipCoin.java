/******************************************************************************
 *  Purpose: Coin flip and findout percentage of head vs tails
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
 
 package com.Profound.util;
 
 import java.util.Scanner;
 
 public class FlipCoin {
	
	public static void main(String arg[]){
		int noOfTimes=0;
		int headCounter=0;
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Press 0 of flip the coin");
		int flip=Scanner.nextInt();
		while(flip==0)
		{
			if(Math.random()<0.5)
			{
				headCounter++;
				System.out.println("Heads");
			}
			else
			{
				System.out.println("Tails");
			}
			noOfTimes++;
			System.out.println("If you want to flip coin again then press 0 ");
			flip=Scanner.nextInt();
		}
		float percentOfHeads=(float)(headCounter*100)/noOfTimes;
		System.out.println("Percentage of Heads :"+percentOfHeads);
		float percentOfTails=100-percentOfHeads;
		System.out.println("Percentage of Tails :"+percentOfTails);
	}
 }