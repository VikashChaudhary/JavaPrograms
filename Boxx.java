public class Boxx
{
int l;
int b;
int h;
void setData(int l,int b,int h)
{ 
this.l = l;
this.b = b;
this.h = h;
}
void getData()
{
System.out.println(l);
System.out.println(b);
System.out.println(h);
}
public static void main(String args[])
{
Boxx b1=new Boxx();
b1.setData(10,12,13);
b1.getData();
}}
