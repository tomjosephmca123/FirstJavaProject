package javaobsqura;

import java.util.Scanner;

public class StringPali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n;
		String rev="";
		char ch;
		System.out.println("enter the string");
		n=sc.next();
		for(int i=n.length()-1;i>=0;i--) {
			ch=n.charAt(i);
			rev=rev+ch;
			
		}
		System.out.println(rev);
		if(rev.equals(n))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}

}
