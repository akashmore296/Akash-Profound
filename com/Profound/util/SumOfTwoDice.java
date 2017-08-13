/******************************************************************************
 *  Purpose: sum of two dice
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 
 package com.Profound.util;
 
 public class SumOfTwoDice {
	
	public static void main(String arg[]){
		//taking random values from user
		int diceOne=(int)(Math.random()*6+1);
		int diceTwo=(int)(Math.random()*6+1);
		//sum of dice
		int sumOfDice=diceOne+diceTwo;
		sumOfDice=Math.round(sumOfDice);
		System.out.println("Sum of Two Dice is :"+sumOfDice);
	}
 }
		
