/******************************************************************************
 *  Purpose: To calculate harmonic,sin,cosine,binary number,factorial,square 
 *  root of number
 *  @author  Akash More
 *  @version 1.0
 *  @since   18-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

import java.util.Scanner;

public class MathFunction {
	
	static double sum=0,cosx,sinx,x,temp,epsilon;
	static int term,decimalNumber,binaryNumber=0,tempDecimal,reminder,base=1,numberFromUser;
	
	//Method returns double value containing harmonic number of given number
	public static double harmonic(int number) {
		for(int i=1;i<=number;i++)
		{
			sum=sum + (1.0/i);
		}
		return sum;
	}
	
	//Method returns double value containing sin of angle using taylor series with term=3
	public static double sin(int number) {
		term=3;
		x=number;
		x = x%(2*Math.PI);
		sinx=x;
		for(int i=3;term!=0;i+=2)
		{
			temp=(Math.pow(x,i))/(double)factorial(i);
			if (i % 4 == 1){
				sinx -= temp;
			}
			else if (i % 4 == 3) {
				sinx += temp;
			}
			term--;
		}
		return sinx;			
	}
	
	//Method returns double value containing cosine of angle using taylor series with term=3
	public static double cosine(int number) {
		term=3;
		x=number;
		x = x%(2*Math.PI);
		cosx=1;
		for(int i=2;term!=0;i+=2)
		{
			temp=(Math.pow(x,i))/(double)factorial(i);
			if (i % 4 == 2){
				cosx -= temp;
			}
			else if (i % 4 == 0) {
				cosx += temp;
			}
			term--;
		}
		return cosx;	
	}
	
	//Method returns integer value containing the binary number of the given decimal number
	public static long binary(int number) {
		decimalNumber=number;
		tempDecimal=decimalNumber;
		while(tempDecimal!=0)
		{
			reminder=tempDecimal%2;
			tempDecimal=tempDecimal/2;
			binaryNumber=binaryNumber+reminder*base;
			base=base*10;
		}
		return binaryNumber;
	}
	
	//Method takes number from user and findout its Square root using Newtons law
	public static double sqrt(double number) {
		epsilon = 1e-15;
		temp = number;
		while (Math.abs(temp - number/temp) > epsilon*temp) {
            temp = (number/temp + temp) / 2.0;
        }
		return temp;
	}
	
	/*Method takes number and error tolerence from user and findout its Square root 
	using Newtons law*/
	public static double sqrt(double number,double epsilon) {
		temp = number;
		while (Math.abs(temp - number/temp) > epsilon*temp) {
            temp = (number/temp + temp) / 2.0;
        }
		return temp;
	}
	
	/*
	* Method returns an integer value containing factorial value of number
	* but method returns 0 when number is equal to 1.
	*/	
	public static long factorial(int number){
		if(number==1)
		return 0;
		int fact=1;
		for(int i=1;i<=number;i++){
		fact = fact*i;
		}
		return fact;
	}
	
	/*
	* Method returns a boolean value containing true if number is prime and 
	* false if number is not prime
	*/
	public static boolean isPrime(int number){
		for(int i=2;i<number;i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	 }
	
	public static void main(String args[]){
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		numberFromUser = Scanner.nextInt();
		System.out.println("Harmonic number of "+numberFromUser+" is= "+harmonic(numberFromUser));
		System.out.println("Binary equivalent of "+numberFromUser+" is= "+binary(numberFromUser));
		System.out.println("Sin "+numberFromUser+" = "+sin(numberFromUser));
		System.out.println("Cos "+numberFromUser+" = "+cosine(numberFromUser));
		System.out.println("Factorial of "+numberFromUser+" = "+factorial(numberFromUser));
		if(isPrime(numberFromUser)==true) System.out.println(numberFromUser+" is Prime number");
		else System.out.println(numberFromUser+" is not Prime number");
		System.out.println("Square Root of "+numberFromUser+" = "+sqrt(numberFromUser));
		System.out.println("Enter the epsilon");
		epsilon=Scanner.nextDouble();
		System.out.println("Square Root of "+numberFromUser+" with epsilon "+epsilon+" = "+sqrt(numberFromUser,epsilon));
	}
}