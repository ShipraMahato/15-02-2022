package com.java;

import java.util.Scanner;

public class UserIPDispEvenOdd {
	//Finding even numbers and odd numbers between user input values
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int  start,end;

		System.out.println("Enter starting value");
		start = scanner.nextInt();

		System.out.println("Enter starting value");
		end = scanner.nextInt();
		
		System.out.println("The even numbers are");

		for(; start<= end; start++)
		{
			if(start%2==0)
				System.out.println(start);
			
		}


		System.out.println("The odd numbers are");

		System.out.println("Enter starting value");
		start = scanner.nextInt();

		System.out.println("Enter starting value");
		end = scanner.nextInt();

		for(; start<= end; start++)
		{
			if(start%2!=0)
				System.out.println(start);
			scanner.close();
		}
	}
}

