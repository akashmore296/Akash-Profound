/******************************************************************************
 *  Purpose: Sum of two dice
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 
 package com.Profound.util;
 
 public class SumOfTwoDice {
	
	public static void main(String arg[]){
		int diceOne=(int)(Math.random()*6+1);
		System.out.println("Dice 1 :"+diceOne);
		int diceTwo=(int)(Math.random()*6+1);
		System.out.println("Dice 2 :"+diceTwo);
		int sumOfDice=diceOne+diceTwo;
		System.out.println("Sum of Two Dice is :"+sumOfDice);
	}
 }