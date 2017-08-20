/******************************************************************************
 *  Purpose: To Perform various Math Functions
 *  @author  Akash More
 *  @version 1.0
 *  @since   17-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

import java.util.Scanner;

public class MathFunction {
	
	static double sum=0,cosx,sinx,x,temp,epsilon,dollars, period, futureValue,compoundInterest,presentValue;;
	static int term,decimalNumber,binaryNumber=0,tempDecimal,reminder,base=1,numberFromUser;
	static int noOfElements,largest,smallest,stringIndex;
	
	//Method returns double value containing harmonic number of given number
	public static double harmonic(int number) {
		for(int i=1;i<=number;i++) sum=sum + (1.0/i);	
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
			if (i % 4 == 1) sinx -= temp;
			else if (i % 4 == 3)  sinx += temp;
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
			if (i % 4 == 2) cosx -= temp;
			else if (i % 4 == 0) cosx += temp;
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
		while (Math.abs(temp - number/temp) > epsilon*temp)  temp = (number/temp + temp) / 2.0; 
		return temp;
	}
	
	/*Method takes number and error tolerence from user and findout its Square root 
	using Newtons law*/
	public static double sqrt(double number,double epsilon) {
		temp = number;
		while (Math.abs(temp - number/temp) > epsilon*temp)  temp = (number/temp + temp) / 2.0; 
		return temp;
	}
	
	/*
	* Method returns a boolean value containing true if number is prime and 
	* false if number is not prime
	*/
	public static boolean isPrime(int number){
		for(int i=2;i<number;i++){
			if(number%i==0) return false;	
		}
		return true;
	 }
	 
	 /*
	* Method returns an integer value containing factorial value of number
	* but method returns 0 when number is equal to 1.
	*/	
	public static long factorial(int number){
		if(number==1)
		return 0;
		int fact=1;
		for(int i=1;i<=number;i++) fact = fact*i;
		return fact;
	}
	
	//Method returns future value by using formulae
	public static double futureValue(double c, double r, double t){
		futureValue=c*(Math.pow((1+r),t));
		return futureValue;
	}
	
	//Method returns presentValue value by using formulae
	public static double presentValue(double c, double r, double t){
		presentValue=c/(Math.pow((1+r),t));
		return presentValue;
	}
	
	/*Method return largest no from the array here we pass the array of integers and no 
	 *of elements in that array */
	public static int maxValue(int[] array,int noOfElements) {
		largest=array[0];
		for(int i=0;i<noOfElements;i++) largest=Math.max(largest,array[i]);
		return largest;
	}
	
	/*Method returns smallest no from the array here we pass the array of integers and no 
	 *of elements in that array */
	public static int minValue(int[] array,int noOfElements) {
		smallest=array[0];
		for(int i=0;i<noOfElements;i++) smallest=Math.min(smallest,array[i]);
		return smallest;
	}
	
	/*Method returns string index of array which contains largest string length here we 
	 *pass the array of string and  no of elements in that array */
	public static int maxValue(String[] stringArray,int noOfElements) {
        int[] stringLenght = new int[noOfElements];
		for (int i = 0; i < noOfElements; i++) stringLenght[i] = stringArray[i].length();
		stringIndex=0;
        largest = stringLenght[0];
        for (int i = 0; i < noOfElements; i++) {
            if (stringLenght[i] > largest) {
                largest = stringLenght[i];
				stringIndex=i;
            }
        }
        return stringIndex;
	}
	
	/*Method returns string index of array which contains smallest string length here we 
	 *pass the array of string and  no of elements in that array */
	public static int minValue(String[] stringArray,int noOfElements) {
		int[] stringLenght = new int[noOfElements];
		for (int i = 0; i < noOfElements; i++) stringLenght[i] = stringArray[i].length();
		stringIndex=0;
        smallest = stringLenght[0];
        for (int i = 0; i < noOfElements; i++) {
            if (stringLenght[i] < smallest) {
                smallest = stringLenght[i];
				stringIndex=i;
            }
        }
        return stringIndex;
	}
	
	/*Method returns true or false depending upon wheather coordinates are collinear using
	 *slope or not */
	public static boolean checkCollinearUsingSlope(int x1,int y1,int x2,int y2,int x3,int y3) {
		double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
		return slopeAB==slopeBC && slopeBC==slopeAC && slopeAB==slopeAC;
	}
	
	/*Method returns true or false depending upon wheather coordinates are collinear using
	 *area or not */
	public static boolean checkCollinearUsingArea(int x1,int y1,int x2,int y2,int x3,int y3) {
		double area=((x1-x2)*(y2-y3))-((x2-x3)*(y1-y2));
		area=area/2;
		return area==0;
	}
	 
	/*
    * The main function is written to take choice from user and call appropriate method to perform
	* operations
    */
	public static void main(String args[]){
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter your Choice");
		System.out.println("1.To find Harmonic number,binary,sin,cos,factorial,squarer root of number and  "+ 
		" check number is prime or not");
		System.out.println("2.To find out square root of no by taking error tolerence from user");
		System.out.println("3.To calculate future and present value");
		System.out.println("4.To Find out Largest and Smallest integer number from array");
		System.out.println("5.To Find out Largest and Smallest string from array");
		System.out.println("6.To check the wheather coordinates are colinear or not using slope and area");
		int choice=Scanner.nextInt();
		switch(choice) {
			case 1: System.out.println("Enter the Number");
					numberFromUser = Scanner.nextInt();
					System.out.println("Harmonic number of "+numberFromUser+" is= "+harmonic(numberFromUser));
					System.out.println("Binary equivalent of "+numberFromUser+" is= "+binary(numberFromUser));
					System.out.println("Sin "+numberFromUser+" = "+sin(numberFromUser));
					System.out.println("Cos "+numberFromUser+" = "+cosine(numberFromUser));
					System.out.println("Factorial of "+numberFromUser+" = "+factorial(numberFromUser));
					if(isPrime(numberFromUser)==true) System.out.println(numberFromUser+" is Prime number");
					else System.out.println(numberFromUser+" is not Prime number");
					System.out.println("Square Root of "+numberFromUser+" = "+sqrt(numberFromUser));
					break;
					
			case 2:	System.out.println("Enter the Number");
					numberFromUser = Scanner.nextInt();
					System.out.println("Enter the epsilon");
					epsilon=Scanner.nextDouble();
					System.out.println("Square Root of "+numberFromUser+" with epsilon "+epsilon+" = "
					+sqrt(numberFromUser,epsilon));
					break;
			
			case 3:	System.out.println("Enter Dollars,CI and Period");
					dollars = Scanner.nextInt();
					compoundInterest = Scanner.nextInt();
					period = Scanner.nextInt();
					System.out.println("Amount of money u will have if u invested "+dollars+
					" dollars today is "+futureValue(dollars,compoundInterest,period));
					System.out.println("Amount of money that would have to be investet now is "
					+presentValue(dollars,compoundInterest,period));
					break;
					
			case 4:	System.out.println("Enter the no of elements");
					noOfElements=Scanner.nextInt();
					int[] array=new int[noOfElements];
					System.out.println("Enter the elements of array");
					for(int i=0;i<noOfElements;i++) array[i]=Scanner.nextInt();
					System.out.println("Maximum value in array is "+maxValue(array,noOfElements));
					System.out.println("Minimum value in array is "+minValue(array,noOfElements));	
					break;
			
			case 5:	System.out.println("Enter the no of strings in array that u want");
					noOfElements=Scanner.nextInt();
					String[] stringArray=new String[noOfElements];
					System.out.println("Enter the elements of array");
					for(int i=0;i<noOfElements;i++) stringArray[i]=Scanner.next();
					stringIndex=maxValue(stringArray,noOfElements);
					System.out.println("Maximum valued String is "+stringArray[stringIndex]);
					stringIndex=minValue(stringArray,noOfElements);
					System.out.println("Minimum valued String is "+stringArray[stringIndex]);
					break;
					
			case 6:	System.out.println("Enter the Co-ordinates of x1,y1,x2,y2,x3,y3");
					int x1=Scanner.nextInt();
					int y1=Scanner.nextInt();
					int x2=Scanner.nextInt();
					int y2=Scanner.nextInt();
					int x3=Scanner.nextInt();
					int y3=Scanner.nextInt();
					boolean checkCollinear=checkCollinearUsingSlope(x1,y1,x2,y2,x3,y3);
					if(checkCollinear==true) System.out.println("A("+x1+","+y1+"),B("+x2+","+y2+")and"+
					"C("+x3+","+y3+") are collinear using slope");
					else System.out.println("A("+x1+","+y1+"),B("+x2+","+y2+")and"+
					"C("+x3+","+y3+") are not collinear using slope");
					checkCollinear=checkCollinearUsingArea(x1,y1,x2,y2,x3,y3);
					if(checkCollinear==true) System.out.println("A("+x1+","+y1+"),B("+x2+","+y2+")and "+
					"C("+x3+","+y3+") are collinear using area");
					else System.out.println("A("+x1+","+y1+"),B("+x2+","+y2+")and "+
					"C("+x3+","+y3+") are not collinear using area");	
					break;
					
			default:System.out.println("Enter Valid input");
					break;
		}
	}
}