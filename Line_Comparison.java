package com.Line_compa;

import java.util.*;
<<<<<<< HEAD

public class Line_Comparison {
=======
public class LineComparison {
>>>>>>> uc1_Calculate_line_Lenght

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO LINE COMPARISON COMPUTATION PROGRAM ON MASTER BRANCH");
		System.out.println("Enter the x1 and y1 co-ordinates");

		int x1 = sc.nextInt();
		int y1 = sc.nextInt();

		System.out.println("Enter the x2 and y2 co-ordinates");

		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		double Lenght_of_Line1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("\n Lenght Of Line 1 is = " + Lenght_of_Line1);

		System.out.println("Enter the x3 and y3 co-ordinates");

		int x3 = sc.nextInt();
		int y3 = sc.nextInt();

		System.out.println("Enter the x4 and y4 co-ordinates");

		int x4 = sc.nextInt();
		int y4 = sc.nextInt();

		double Lenght_of_Line2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

		System.out.println("\n Lenght of Line 2 is =" + Lenght_of_Line2);

		Double lenght1 = new Double(Lenght_of_Line1);
		Double lenght2 = new Double(Lenght_of_Line2);
		System.out.println(lenght1.equals(lenght2));
		System.out.println(lenght1.compareTo(lenght2));
	}

}

