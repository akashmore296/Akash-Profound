package com.Profound.util;

import java.util.Scanner;

public class StringFunction{
	
	/*Method checks wheather two strings are anagram or not. It returns true if strings are
	 *anagram and returns false if strings are not anagram 	*/
	public static boolean checkAnagram(String String1,String String2) {
		char array1[]=String1.toCharArray();
		char array2[]=String2.toCharArray();
		int length1=String1.length();
		int length2=String2.length();
		if(length1==length2) {
			//sorting array 1
			for(int i=0;i<length1;i++) {
				for(int j=i+1;j<length1;j++) {
					if(array1[i]<array1[j]) {
						char temp=array1[i];
						array1[i]=array1[j];
						array1[j]=temp;
					}
				}
			}
			//sorting array 2
			for(int i=0;i<length2;i++) {
				for(int j=i+1;j<length2;j++) {
					if(array2[i]<array2[j]) {
						char temp=array2[i];
						array2[i]=array2[j];
						array2[j]=temp;
					}
				}
			}
			for(int i=0;i<length1;i++) {
				if(array1[i]!=array2[i]) return false;
			}
			return true;			
		}
		else {
			return false;
		}
	}
	
	/*Method checks wheather string is palindrome or not. It returns true if string is
	 *palindrome and returns false if string is not palindrome 	*/
	public static boolean checkPalindrome(String String1) {
		char array[]=String1.toCharArray();
		int length=String1.length();
		for(int i=0,j=length-1;i<length/2;i++,j--) {
			if(array[i]!=array[j]) return false;
		}
		return true;
	}
	
	public static void main(String args[]){
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter String 1");
		String String1=Scanner.next();
		System.out.println("Enter String 2");
		String String2=Scanner.next();
		boolean isAnagram=checkAnagram(String1,String2);
		if(isAnagram==true) System.out.println(String1+" and "+String2+" are Anagram");
		else System.out.println(String1+" and "+String2+" are not anagram");
		boolean isPalindrome=checkPalindrome(String1);
		if(isPalindrome==true) System.out.println(String1+" is a palindrome");
		else System.out.println(String1+" is not a palindrome");
		isPalindrome=checkPalindrome(String2);
		if(isPalindrome==true) System.out.println(String2+" is a palindrome");
		else System.out.println(String2+" is not a palindrome");
		
	}
}