public class Student
{
String name;
int rollno;
String branch;
int sap_id;
void SetAttribute(String n,int r,String b,int s)
{
name=n;
rollno=r;
branch=b;
sap_id=s;
}
void getAttribute()
{
System.out.println("name="+name+",rollno="+rollno+",branch="+branch+",sap_id="+sap_id);
}
public static void main(String args[])
{
Student s1= new Student();
s1.SetAttribute("vikash",60,"bigdata",500060175);
s1.getAttribute();
}
}
