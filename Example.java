class Account{
double balance;
String AccHolderName;
double transactionAmount;
int AccNo;
static double rate;
void set(double b,String a,double t,int acc)
{
balance=b;
AccHolderName=a;
transactionAmount=t;
AccNo=acc;
}
void get()
{
System.out.println("Balance="+balance);
System.out.println("Holder="+AccHolderName);
System.out.println("Transaction Amount="+transactionAmount);
System.out.println("Account Number="+AccNo);
}
static void f1()
{
	rate=87687.0;
}
}
public class Example
{
public static void main(String args[])
{
 Account a1=new Account();
 a1.set(546416463.0,"Vibhor",5465.0,3534);
 a1.get();
 a1.rate= 8.0;
 System.out.println("RAte="+Account.rate);
}
}