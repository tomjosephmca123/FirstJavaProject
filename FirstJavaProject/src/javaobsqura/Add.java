package javaobsqura;

import java.util.Scanner;


public class Add {
	int n1,n2,sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add obj=new Add();
		obj.add();

	}
	public int add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		n1=sc.nextInt();
		n2=sc.nextInt();
		sum=n1+n2;//sum
		return sum;
	}

}
