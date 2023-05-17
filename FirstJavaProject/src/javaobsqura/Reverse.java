package javaobsqura;


public class Reverse {
	int n;
	static int s=0;
	
	Reverse(int n){
		this.n=n;
		while(n!=0){
			int r=n%10;			
			s=s*10+r;		
			n=n/10;
			}
		
	}
	Reverse(){
		this(123);
		
		System.out.println("Reverse is "+s);
	}
	

	public static void main(String[] args) {
		Reverse obj2=new Reverse();

	}

}
