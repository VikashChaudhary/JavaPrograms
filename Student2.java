
class Student1 
{
void name()
{
System.out.println("name of student");
}
}
class Student2 extends Student1
{
void sapid()
{
System.out.println("sapid..");
}
}
class Student2
{
public static void main(String args[]);
{
Student2 s = new Student2();
s.name();
s.sapid();
}
}