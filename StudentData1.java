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
class OldStudent extends Student2
{  
void branch()
{
System.out.println("branch..."); 
} 
} 
class StudentData1
{
public static void main(String args[])
{
OldStudent s = new OldStudent();
s.branch();
s.sapid();
s.name();
}
}