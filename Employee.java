package com.ot9.execptionsassignments;

import com.demo.exception.EmployeeException;

class Salary
{
	public void validateSalary(int sal) throws EmployeeException
	{
		if(sal<3000)
		{
			throw new EmployeeException("Salary must be above 3000");
		}
		else
		{
			System.out.println("Your validated salary is "+sal);
		}
	}
}

public class Employee extends Salary {

	public static void main(String[] args) throws EmployeeException {
		Salary s = new Salary();
		s.validateSalary(3000);
	}

}
