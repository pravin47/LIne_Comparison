package com.Line_compa;
import java.util.*;
public class Line_Comparison {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO LINE COMPARISON COMPUTATION PROGRAM ON MASTER BRANCH");
		System.out.println("Enter the x1 and y1 co-ordinates");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter the x2 and y2 co-ordinates");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double lenght_of_line = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("\n Lenght Of Line is = " + lenght_of_line);
	}

}
