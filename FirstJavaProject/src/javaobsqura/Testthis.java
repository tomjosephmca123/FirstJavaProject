package javaobsqura;

public class Testthis {
	int id;
	String name;
	Testthis(int id,String name){
		this.id=id;
		this.name=name;
		System.out.println(id+"\n"+name);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testthis obj1=new Testthis(11,"tom");
		Testthis obj2=new Testthis(12,"ram");

	}

}
