package javaobsqura;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character");
		String n=sc.next();
		switch(n) {
		case "a":
			System.out.println("vowel");
			break;
		case "e":
			System.out.println("vowel");
			break;
		case "i":
			System.out.println("vowel");
			break;
		case "o":
			System.out.println("vowel");
			break;
		case "u":
			System.out.println("vowel");
			break;
		default:
			System.out.println("not a vowel");
			break;
		}

	}

}
