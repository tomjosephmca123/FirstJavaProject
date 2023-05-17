package javaobsqura;

public class ThisMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisMethod obj1=new ThisMethod();
		obj1.m();
	}
	
	
	public void n() {
		
		System.out.println("method n is invoked");
	}
	
	
	public void m() {
		
		n();
	}

}
