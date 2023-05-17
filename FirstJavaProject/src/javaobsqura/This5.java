package javaobsqura;

public class This5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		This5 s1=new This5();
		s1.m();
	}
	public void m() {
		
		n(this);
	}
	public void n(This5 obj) {
		
		System.out.println("method n invoked");
	}

}
