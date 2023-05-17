package javaobsqura;

public class Factorial {
	int n;
	static int s=1;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial obj1=new Factorial();
		obj1.factorial(4);

	}
	public void factorial(int n){
		this.n=n;
		while(n>0) {
			s=s*n;
			n=n-1;
		}
		factorialdis();
	}
	public void factorialdis(){
		System.out.println("factorial is "+s);
	}

}
