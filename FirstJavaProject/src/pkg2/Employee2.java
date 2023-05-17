package pkg2;
import javaobsqura.Employee1;

public class Employee2 extends Employee1{
	public float hra;
	public float pf;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public void calc() {
		super.getData();
		hra=(super.basicPay*5)/100;
		pf=(super.basicPay*20)/100;
		
	}

}
