import java.util.*;
public class fact
{
public static void main(String args[])
{
System.out.println("enter a number");
Scanner s1=new Scanner(System.in);
int x=s1.nextInt();
System.out.println("result");

int f=1;
for(int i=1;i<=x;i++)
f=f*i;
System.out.println(f);

}
}

