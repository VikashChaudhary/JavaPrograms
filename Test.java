public class Test
{ 
void Display()
{
this.show();
System.out.println("inside Display function");
}
void show()
{
System.out.println("Inside show function");
}
public static void main(String args[])
{ 
Test t1 = new Test();
t1.Display();
}
}