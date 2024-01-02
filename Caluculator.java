package com.ot9.assignment;

public class Caluculator {
	void add(int a, int b)
	{
		System.out.println("The addition of int and int is " +(a+b));
		
	}
	void add(double a , double b)
	{
		System.out.println("The addition of double and double is "+(a+b));
	}
	void add(int a, double b)
	{
		System.out.println("The addition of int and double is :"+(a+b));
	}
	void add(double a, int b)
	{
		System.out.println("The addition of double and int is "+(a+b));
	}
	
	
	void diff(int a, int b)
	{
		System.out.println("The difference of int and int is " +(a-b));
		
	}
	void diff(double a , double b)
	{
		System.out.println("The differnce of double and double is "+(a-b));
	}
	void diff(int a, double b)
	{
		System.out.println("The difference of int and double is :"+(a+b));
	}
	void diff(double a, int b)
	{
		System.out.println("The difference of double and int is "+(a+b));
	}
	
	void mul(int a, int b)
	{
		System.out.println("The multiplication of int and int is " +(a*b));
		
	}
	void mul(double a , double b)
	{
		System.out.println("The Multiplication of double and double is "+(a*b));
	}
	void mul(int a, double b)
	{
		System.out.println("The Multiplication of int and double is :"+(a*b));
	}
	void mul(double a, int b)
	{
		System.out.println("The Multiplication of double and int is "+(a*b));
	}
	
	
	void div(int a, int b)
	{
		System.out.println("The Division of int and int is " +(a/b));
		
	}
	void div(double a , double b)
	{
		System.out.println("The Division of double and double is "+(a/b));
	}
	void div(int a, double b)
	{
		System.out.println("The Division of int and double is :"+(a/b));
	}
	void div(double a, int b)
	{
		System.out.println("The Division of double and int is "+(a/b));
	}
	
	public static void main(String[] args) {
		Caluculator obj = new Caluculator();
		obj.add(1, 2);
		obj.add(1.555555, 2.44444);
		obj.add(1, 3.9);
		obj.add(1.2333, 2);
		obj.diff(3, 2);
		obj.diff(3.444, 2.3333);
		obj.diff(5, 2.33);
		obj.diff(2.4, 1);
		obj.mul(1, 0);
		obj.mul(2, 3);
		obj.mul(1, 0.2);
		obj.mul(1.55555555, 1.777777777777);
		obj.div(1,2);
		obj.div(4.55, 2.1000000);
		obj.div(10000, 2.444);
		obj.add(100009.22222, 3);
		
	}
}


