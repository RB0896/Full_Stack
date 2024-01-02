package com.ot9.assignment;

public class Shape {
	void area(int length)
	{
		System.out.println("Area of square is "+(length*length));
	}
	void area(int length, int width)
	{
		System.out.println("Area of Rectangle is "+(length*width));
	}
	void perimeter(int side)
	{
		System.out.println("Perimeter of Square is "+(4*side));
		
	}
	void perimeter(int length,int width)
	{
		System.out.println("Perimeter of Rectangle is "+(2*length+2*width));
	}
	public static void main(String[] args) {
		Shape obj =new Shape();
		obj.area(2);;
		obj.area(2, 3);
		obj.perimeter(4);
		obj.perimeter(4, 5);
	}

}
