package javaobsqura;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		if(n>0)
			System.out.println("no is positive");
		else if(n<0)
			System.out.println("no is negetive");
	}

}
