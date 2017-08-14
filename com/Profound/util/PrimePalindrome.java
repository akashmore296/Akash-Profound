

/******************************************************************************
 *  
 *  Purpose: Prime Palindrome
 *
 *  @author  Akash More
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/


package com.Profound.util;


public class PrimePalindrome {
			
	public static void main(String args[]) {
		int flag=0;
		for(int i=0;i<=100000;i++) {
			flag=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=1;
				}
			}
			if(flag!=1)
			{
				int temp=i;
				int ctr=0;
				while(temp!=0)
				{
					temp=temp/10;
					ctr++;
				}
				temp=i;
				ctr=ctr-1;
				int reverse=0;
				for(int k=0;temp!=0;k++)
				{
					int reminder=temp%10;
					int b=(int) Math.pow(10,ctr-k);
					reverse=reverse+reminder*b;
					temp=temp/10;	
				}
				//System.out.println("Reverse  "+i+"\t"+reverse);
				if(reverse==i)
				{
					System.out.println("Palindrome No is "+i);
			
				}
			}			
		}
	}
}
					


