/******************************************************************************
 *  Purpose: gambling
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
 
 package com.Profound.util;
 
 import java.util.Scanner;
 
 public class Gambling {

	static int stake,goal,trials;
	static int bets = 0;       
        static int wins = 0;      

	public static void main(String args[])
	{ 
		stake  = Integer.parseInt(args[0]);   
        	goal   = Integer.parseInt(args[1]);   
        	trials = Integer.parseInt(args[2]);    

        	for (int i = 0; i < trials; i++) {
           		int cash = stake;
            		while (cash > 0 && cash < goal) {
              			bets++;
               		 	if (Math.random() < 0.5) 
				cash++;    
                	 	else                     
				cash--;     
            		}
            		if (cash == goal) 
			wins++;           
        	}
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + (100.0 * wins) / trials);
        System.out.println("Avg bets           = " + (1.0 * bets) / trials);
	}
}
