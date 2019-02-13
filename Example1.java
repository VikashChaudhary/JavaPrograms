class Student
{
void f1()
{
System.out.println("gggg");
}
public String toString()
{
	String str="Hello World";
 	return str;
}
}
public class Example1
{
public static void main(String args[])
{
	Student s1=new Student();

	s1.f1();
	System.out.println(s1);		
}
}