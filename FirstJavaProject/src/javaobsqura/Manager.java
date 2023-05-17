package javaobsqura;

public class Manager extends Employe{
	int hra=5000;
	int total;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager obj=new Manager();
		obj.total=obj.basicSalary+obj.hra;
		System.out.println("total salary="+obj.total);
	}

}
