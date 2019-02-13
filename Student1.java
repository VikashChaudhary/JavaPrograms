
class Student1 
{
void name()
{
System.out.println("name of student");
}
class Student2 extends Student1
{
void sapid()
{
System.out.println("sapid..");
}
public static void main(String args[])
{ 
Student2 s1 = new Student2(System.in);
s1.name();
s1.sapid();
}
}}