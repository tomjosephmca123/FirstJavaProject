package javaobsqura;

public class Student {
	int id;
	String name,cource;
	double fees;

	public Student(int id, String name, String cource, double fees) {
		this(id,name,cource);
		this.fees = fees;
	}

	public Student(int id, String name, String cource) {
		
		this.id = id;
		this.name = name;
		this.cource = cource;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1=new Student(11,"tom","b.tech");
		Student obj2=new Student(11,"tom","b.tech",25000.55);
		obj1.display();
		obj2.display();

	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(cource);
		System.out.println(fees);
		
	}

}
