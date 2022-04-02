package com.java;

public class LoopExample2 {
// Display employee id and employee salary
	public static void main(String[] args)
	{
		int employeeIds[] = {2, 5, 3, 9, 4};

		double employeeSalaries[] = {4520.45,3450.44, 3550.36, 2640.78, 5370.57};
		
		System.out.println("Employee id :");

		for(int employeeId: employeeIds) 
		{ 
			
			System.out.println(employeeId); 
		}

		System.out.println("*****************");
		
		System.out.println("Employee salary : ");
		
		for(double employeeSalary: employeeSalaries)
		{
			
			System.out.println(employeeSalary);
		}

	}

}
