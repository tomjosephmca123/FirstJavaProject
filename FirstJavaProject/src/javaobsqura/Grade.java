package javaobsqura;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total mark");
		int n=sc.nextInt();
		if(n<40)
			System.out.println("failed");
		else if(n>=40 && n<=60)
			System.out.println("Grade D");
		else if(n>=61 && n<=70)
			System.out.println("Grade C");
		else if(n>=71 && n<=80)
			System.out.println("Grade B");
		else if(n>=81 && n<=100)
			System.out.println("Grade A");
	}

}
