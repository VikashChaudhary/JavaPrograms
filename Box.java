public class Box
{
int l;
int b;
int h;
void Setbox(int length,int height,int breath)
{ 
l=length;
h=height;
b=breath;
}
void getbox()
{
System.out.println("lenght="+l+",height="+h+"breath="+b);
}
public static void main(String args[])
{
Box b1=new Box();
b1.Setbox(2,4,7);
b1.getbox();
}

}
