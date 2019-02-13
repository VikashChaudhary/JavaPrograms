public class Dummy2
{
private static int x =10;
Dummy2()
{
System.out.println(x);
}
static
{
System.out.println(x);
x= 12;
}
public static void main(String args[])
{ 
new Dummy2();
new Dummy2();
}
}