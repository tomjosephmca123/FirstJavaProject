package javaobsqura;

public class ThisConstructor {
	ThisConstructor(){
		this(10);
		System.out.println("default constructor invoked");
		
	}
	ThisConstructor(int n){
		System.out.println("parameterized constructor invoked");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConstructor obj1=new ThisConstructor();

	}

}
