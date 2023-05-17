package javaobsqura;

public class Programmer extends Employe{
	int bonus=4000;
	int total;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p1=new Programmer();
		p1.total=p1.basicSalary+p1.bonus;
		System.out.println("total salary is "+p1.total);

	}

}
