/******************************************************************************
 *  Purpose: To return minValue and maxValue to return max from array of integer 
 *  values given in a parameter
 *  @author  Akash More
 *  @version 1.0
 *  @since   19-08-2017
 *
 ******************************************************************************/

package com.Profound.util;

import java.util.Scanner;

public class MathFunctionArray {
	
	static int noOfElements,largest,smallest,stringIndex;
	
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
	
	public static void main(String args[]) {
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter the no of strings in array");
		noOfElements=Scanner.nextInt();
		String[] stringArray=new String[noOfElements];
		System.out.println("Enter the elements of array");
		for(int i=0;i<noOfElements;i++)
		{
			stringArray[i]=Scanner.next();
		}
		stringIndex=maxValue(stringArray,noOfElements);
		System.out.println("Maximum valued String is "+stringArray[stringIndex]);
		stringIndex=minValue(stringArray,noOfElements);
		System.out.println("Minimum valued String is "+stringArray[stringIndex]);
	}
}