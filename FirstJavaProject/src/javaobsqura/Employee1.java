package javaobsqura;

import java.util.Scanner;

public class Employee1 {
	   public int basicPay;
	   public int deduction;
	   public int bonus;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter basic pay,deduction,bouns");
		basicPay=sc.nextInt();
		deduction=sc.nextInt();
		bonus=sc.nextInt();
		sc.close();
	}
}
