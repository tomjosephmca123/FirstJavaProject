package javaobsqura;

public class Dog extends Animal{
	String colour="black";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj=new Dog();
		obj.displayColour();
	}
	public void displayColour() {
		System.out.println(colour);
		System.out.println(super.colour);//super class variable
		super.displayColour();//super class method
	}

}
