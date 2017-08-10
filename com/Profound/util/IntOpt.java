/******************************************************************************
 *  Purpose: Understanding the precidence in java
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   09-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

import java.util.Scanner;

public class IntOpt {
	
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three no");
		float a=sc.nextInt();
		float b=sc.nextInt();
		float c=sc.nextInt();
		float operation=a+b*c;
		System.out.println(a+"+"+b+"*"+c+"="+operation);
		operation=c+a/b;
		System.out.println(c+"+"+a+"/"+b+"="+operation);
		operation=a*b+c;
		System.out.println(a+"*"+b+"+"+c+"="+operation);
		operation=a%b*c;
		System.out.println(a+"%"+b+"*"+c+"="+operation);
	}
}