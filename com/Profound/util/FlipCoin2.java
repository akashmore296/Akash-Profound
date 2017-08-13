/******************************************************************************
 *  Purpose: coin flip
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
 
 package com.Profound.util;
 
 import java.util.Scanner;
 
 public class FlipCoin2 {

	static int times;
	static float headCtr=0,totalCtr=0;
	static float tailCtr,percentOfHead,percentOfTails;

	public static void main(String args[]){
		times=Integer.parseInt(args [0]);
		for(int i=0;i<times;i++)
		{
			if(Math.random()>0.5)
			{
			headCtr++;
			}
			totalCtr++;
		}
		tailCtr=totalCtr-headCtr;
		System.out.println("Number of heads is "+headCtr);
		System.out.println("Number of tails is "+tailCtr);
		percentOfHead=(headCtr/totalCtr)*100;
		System.out.println("Percentage of heads is"+percentOfHead);
		percentOfTails=100-percentOfHead;
		System.out.println("Percentage of heads is"+percentOfTails);
	}
}
