package javaobsqura;

import java.util.Scanner;

public class License {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		if(age>=18)
			System.out.println("eligible for driving license");
		else
			System.out.println("not eligible for driving license");
	}

}
