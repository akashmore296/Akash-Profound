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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three no");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double operation=a+b*c;
		System.out.println(a+"+"+b+"*"+c+"="+operation);
		operation=c+a/b;
		System.out.println(c+"+"+a+"/"+b+"="+operation);
		operation=a*b+c;
		System.out.println(a+"*"+b+"+"+c+"="+operation);
		operation=a%b*c;
		System.out.println(a+"%"+b+"*"+c+"="+operation);
	}
}