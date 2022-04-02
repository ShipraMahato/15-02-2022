package com.java;

public class DispEvenOdd {
// Display even and odd numbers between 1 to 100
	public static void main(String[] args)
	{
		System.out.println("Even Numbers");

		for(int a = 1; a <= 100; a++) 
		{
			if(a%2==0)
				System.out.println("Even Number = "+a);
		}
		System.out.println("Odd Numbers");

		for(int a = 1; a <= 100; a++) 
		{
			if(a%2==1)
				System.out.println("odd number = "+ a);
		}
	}
}
