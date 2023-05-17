package javaobsqura;

public class Bike extends Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj=new Bike();
		obj.display();
		Car obj1=new Bike();//upcasting
		obj1.display();
		new Bike().display();
	}
	public void display() {
		System.out.println("bike is running");
	}

}
