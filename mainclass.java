class A
{
public A()
{
System.out.println("A1");
}
public A(int x,int y)
{
System.out.println("A2");
}
}
class B extends A
{
public B()
{
this(4,5);
System.out.println("B1");
}
public B(int x)
{

System.out.println("B2");
}

public B(int u,int v)
{
super(4,2);
System.out.println("B3");
}
}
public class mainclass
{
public static void main(String args[])
{
B obj= new B();
}
}
