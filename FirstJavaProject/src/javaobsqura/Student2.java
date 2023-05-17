package javaobsqura;

class Student2{
static String clg="sgc college";
int id;
String name;
public static void main(String args[]){
Student2 s1=new Student2();
Student2 s2=new Student2();
s1.id=101;
s1.name="Tom";
s2.id=102;
s2.name="Ram";
s1.display();
s2.display();
}
void display(){
System.out.println(clg);
System.out.println(id);
System.out.println(name);
}
}