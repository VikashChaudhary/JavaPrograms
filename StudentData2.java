class Student1 
{
void name()
{
System.out.println("name of student");
}
}
class OldStudent extends Student1
{
void sapid()
{
System.out.println("sapid..");
}
}
class NewStudent extends OldStudent
{  
void branch()
{
System.out.println("branch..."); 
} 
} 
class StudentData2
{
public static void main(String args[])
{
NewStudent s = new NewStudent();
s.branch();
s.name();
}
}