/******************************************************************************
 *  Purpose: Coin flip and findout percentage of head vs tails
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
 
 package com.Profound.util;
 
 public class FlipCoin2 {

	static int times;
	static float headCounter=0,totalCounter=0;
	static float tailCounter,percentOfHead,percentOfTails;

	public static void main(String args[]){
		times=Integer.parseInt(args [0]);
		for(int i=0;i<times;i++)
		{
			if(Math.random()>0.5)
			{
				headCounter++;
			}
			totalCounter++;
		}
		tailCounter=totalCounter-headCounter;
		System.out.println("Number of heads is "+headCounter);
		System.out.println("Number of tails is "+tailCounter);
		percentOfHead=(headCounter/totalCounter)*100;
		System.out.println("Percentage of heads is"+percentOfHead);
		percentOfTails=100-percentOfHead;
		System.out.println("Percentage of heads is"+percentOfTails);
	}
}
