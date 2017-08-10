/******************************************************************************
 *  Purpose: Calculate the distance between two coordinates
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

public class Distance
{
	public static void main(String args[])
	{
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);//taking coordinates
		double dist=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));//calculating using formulae
		System.out.println("Distance from ("+x+","+y+")to (0,0) is ="+dist);
	}
}