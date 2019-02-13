class Calc
{
   publc static void main(String args[])
  {
    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);
    int c=a+b;
    System.out.println("sum of a and b is" + c);
    int c=a-b;
    System.out.println("sub of a and b is" + c);
    int c=a*b;
    System.out.println("mul of a and b is" + c);
    int c=a/b;
    System.out.println("div of a and b is" + c);    
  }
  

}