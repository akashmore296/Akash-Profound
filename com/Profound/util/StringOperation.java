package com.Profound.util;

import java.util.Scanner;

public class StringOperation {
	
	public static boolean palindrome(String string){
		int length=string.length();
		for(int i=0,j=length-1;i<=length/2;i++,j--) {
			if(string.charAt(i)!=string.charAt(j)) return false;
		}
		return true;	
	}
	
	public static void main(String args[]) {
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter the String ");
		String stringA=Scanner.next();
		boolean isPalindrome=palindrome(stringA);
		if(isPalindrome==true) System.out.println(stringA+" is a palindrome");
		else System.out.println(stringA+" is not a palindrome");
	}
}