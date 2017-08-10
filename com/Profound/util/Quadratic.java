/******************************************************************************
 *  Purpose: Determining the roots of Quadratic equation
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

import java.util.Scanner;

class Quadratic
{
	public static void main(String args[])
	{
		int a,b,c;
		double root1,root2,delta;
		Scanner s=new Scanner(System.in);
		//taking values of a,b,c from user
		System.out.println("Given Quadratic Equation:ax^2+bx+c\n");
		System.out.println("Enter the a:\n");
		a=s.nextInt();
		System.out.println("Enter the b:\n");
		b=s.nextInt();
		System.out.println("Enter the c:\n");
		c=s.nextInt();
		System.out.println("Given Quadratic Equation: "+a+"x^2+"+b+"x+"+c+"\n");
		delta=b*b-4*a*c;
		//calculating roots if Roots are real and unequal
		if(delta>0)
		{
			System.out.println("Roots are real and unequal");
			root1=(-b+Math.sqrt(delta))/(2*a);
			root2=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("First root is :"+root1);
			System.out.println("Second root is :"+root2);
		}
		//calculating roots if Roots are real and equal
		else if(delta==0)
		{
			System.out.println("Roots are real and equal");
			root1=(-b+Math.sqrt(delta))/(2*a);
			System.out.println("First root is :"+root1);
		}
		else
		{
			System.out.println("Roots are imagenery");
		}
	}
}