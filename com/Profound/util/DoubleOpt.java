/******************************************************************************
 *  Purpose: Understanding the precidence in java using double 
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   09-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

import java.util.Scanner;

public class DoubleOpt {
	
	public static void main(String arg[]){
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter three no");
		double a=Scanner.nextDouble();
		double b=Scanner.nextDouble();
		double c=Scanner.nextDouble();
		double operation=a+b*c;
		System.out.println(a+"+"+b+"*"+c+"="+operation);
		operation=a+b/c;
		System.out.println(a+"+"+b+"/"+c+"="+operation);
		operation=a*b+c;
		System.out.println(a+"*"+b+"+"+c+"="+operation);
		operation=a%b*c;
		System.out.println(a+"%"+b+"*"+c+"="+operation);
	}
}