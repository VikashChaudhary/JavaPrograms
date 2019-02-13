public class constructor
{
int l;
int b; 
int h;

public constructor()
{
l=3;b=5;h=8;
}
public constructor(int length,int breadth,int height)
{
l = length;
b = breadth;
h = height;
}
void getData()
{System.out.println(l); 
System.out.println(b); 
System.out.println(h); 
}
public static void main(String args[])
{
constructor b1 =new constructor();
constructor b2 =new constructor(2,4,5);
b1.getData();
b2.getData();
}}