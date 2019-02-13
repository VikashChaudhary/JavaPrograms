interface Drawable
{float = 3.14;  
void draw();  
}  
class Rectangle implements Drawable
{  
public void draw()
{
i = 9;
System.out.println("i");
}  
}  
class Circle implements Drawable
{  
public void draw()
{
System.out.println("drawing circle");
}  
}    
class TestInterface1
{  
public static void main(String args[])
{  
Drawable d=new Circle();
getDrawable();  
d.draw();  
}}  