package javaobsqura;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int n1=sc.nextInt();
		System.out.println("enter second number");
		int n2=sc.nextInt();
		System.out.println("enter third number");
		int n3=sc.nextInt();
		if(n1>n2 && n1>n3)
			System.out.println(n1+" is largest");
		else if(n2>n1 && n2>n3)
			System.out.println(n2+" is largest");
		else if(n3>n2 && n3>n1)
			System.out.println(n3+" is largest");
	}

}
