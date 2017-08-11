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
		double diceOne=(Math.random()*6);
		double diceTwo=(Math.random()*6);
		//sum of dice
		double sumOfDice=diceOne+diceTwo;
		sumOfDice=Math.round(sumOfDice);
		System.out.println("Sum of Two Dice is :"+sumOfDice);
	}
 }
		