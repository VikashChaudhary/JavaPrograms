class A
	{
		int x=8;
	}
class B extends A
	{ 
		int x=9;
		void f1()
		{
			int x=7;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		}
	}
public class Super{
public static void main(String args[])
{
B b1 = new B();
b1.f1();
}}
