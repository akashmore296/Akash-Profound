/******************************************************************************
 *  Purpose: Print table for the power of two
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

public class PowerOf2{
		
	public static void main(String[]args){
		//taking power for 2 from user
		int n = Integer.parseInt(args[0]);
		int powerof2=1;
		//print no with power
		for(int i=0;i<=n;i++){
			System.out.println(+i+ " "+powerof2);
			powerof2 = 2 * powerof2;
		}
	}
}
	