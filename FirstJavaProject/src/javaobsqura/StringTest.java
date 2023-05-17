package javaobsqura;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2=new String("hello");
		String s3="hello";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println("hello".compareTo("iello"));
		System.out.println(s1.concat(s3));

	}

}
