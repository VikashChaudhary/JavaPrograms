public class Dummy
{ 
   final int x;
  
       {
	System.out.println(x);
	y = 5;
        System.out.println(y);
	}
{
	System.out.println(x);
	x = 5;
}
	public Dummy()
	{
		System.out.println(x);
	}
public static void main(String args[])
	{	
Dummy d1 = new Dummy();
Dummy d2 = new Dummy();

}
}
