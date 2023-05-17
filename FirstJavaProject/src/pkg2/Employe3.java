package pkg2;


public class Employe3 extends Employee2{
	float totalSalary;

	public static void main(String[] args) {
		Employe3 obj3=new Employe3();
		obj3.calc();
	}
	public void calc() {
		super.calc();
		totalSalary=(super.basicPay+super.hra-super.pf-super.deduction+super.bonus);
		System.out.println("basic pay="+super.basicPay+"\n"+"deduction="+super.deduction+"\n"+"hra="+super.hra+"\n"+"pf="+super.pf+"\n"+"bonus="+super.bonus+"\n"+"Total salary="+totalSalary);
	}

}
