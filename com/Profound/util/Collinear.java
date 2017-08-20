package com.Profound.util;

import java.util.Scanner;

public class Collinear {
	
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
		
	
	public static void main(String args[]) {
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter the Co-ordinates of x1,y1,x2,y2,x3,y3");
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
		
	}
	
}