package javaobsqura;

public class HrManager extends Manager{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HrManager obj=new HrManager();
		int total=obj.basicSalary+obj.hra;
		System.out.println("basic salary in Employe+hra in Manager="+total);
	}

}
