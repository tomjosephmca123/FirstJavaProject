package javaobsqura;

public class Divisible extends Add{
	int num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisible obj=new Divisible();
		obj.divisible();

	}
	public void divisible() {
		num=super.add();
		System.out.println("sum is "+num);
		if(num%10==0)
			System.out.println("divisible by 10");
		else
			System.out.println("not divisible by 10");
	}

}
