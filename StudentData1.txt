
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
class BabyStudent3 extends Student2
{  
void branch()
{
System.out.println("branch...");}  
}  
class StudentData
{
public static void main(String args[])
{
Student2 s = new Student2();
s.branch();
s.name();
s.sapid();
}
}