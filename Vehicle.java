package com.ot9.assignment;
class Truck
{
	void load()
	{
		System.out.println("Loading");
	}
}
class Car extends Truck
{
	void accelarate()
	{
		System.out.println("is accelarting");
	}
	void goFast()
	{
		System.out.println("is going fast");
	}
}
class Bus extends Car
{
	void pickPassengers()
	{
		System.out.println("Pick passengers");
	}
}

public class Vehicle  extends Bus{

	public static void main(String[] args) {
	Vehicle obj = new  Vehicle();
	obj.load();
	obj.accelarate();
	obj.goFast();
	obj.pickPassengers();
			

	}

}
class Road {

	
	public static void main(String[] args) {
		Truck obj =new Truck();
		Bus obj1 = new Bus();
		Car obj2 = new Car();
		obj.load();
		obj1.accelarate();
		obj1.pickPassengers();
		obj2.goFast();


	}
}
