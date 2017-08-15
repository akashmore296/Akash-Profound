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
		int xCoOrdinate=Integer.parseInt(args[0]);
		int yCoOrdinate=Integer.parseInt(args[1]);
		double dist=Math.sqrt(Math.pow(xCoOrdinate,2)+Math.pow(yCoOrdinate,2));//calculating using formulae
		System.out.println("Distance from ("+xCoOrdinate+","+yCoOrdinate+")to (0,0) is ="+dist);
	}
}