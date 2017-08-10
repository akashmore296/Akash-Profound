/******************************************************************************
 *  Purpose: Determine wheather the season is spring or not
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   09-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

public class SpringSeason
{
	public static void main(String arg[])
	{
		int month=Integer.parseInt(arg[0]);
		int day=Integer.parseInt(arg[1]);
		//checking the seasonusing boolean
		boolean isSpring=(month==3 && day>=20 && day<=31)||
						(month==4 && day>=1 && day<=30)||
						(month==5 && day>=1 && day<=31)||
						(month==6 && day>=1 && day<=20);
		if(isSpring==true)
		{
			System.out.println("Season is Spring");
		}
		else
		{
			System.out.println("Season is not Spring");
		}
		
		
	}
}
		