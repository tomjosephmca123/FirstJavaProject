package javaobsqura;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int rem=n%2;
		if(rem==0)
			System.out.println("no is even");
		else
			System.out.println("no is odd");

	}

}
