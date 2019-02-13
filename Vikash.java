class A
{
static int y=4;
}
class Child extends A
{
static
{
 y=5;
}
}
public class Vikash
{
public static void main(String args[])
{
System.out.println("y="+Child.y);
}
}