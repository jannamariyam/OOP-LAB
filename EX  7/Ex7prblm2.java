/*=======================================================================================================================================================
2. Define 2 classes; one for generating Fibonacci numbers and other for displaying even numbers in a  given range.Implement using threads. (Runnable Interface)
=========================================================================================================================================================*/
import java.util.Scanner;
class fibonacci implements Runnable {
	int n;
	Thread t;	//creating thread
	fibonacci(int n)//constructor
	{
	 t=new Thread(this); //initialising thread object
	 this.n=n;
	}
	public void run()  
	{
	 try
	 { 
	   int a=0,b=0,c=1;
           for(int i=1;b<=n;i++)
           {
            a=b;
            b=c;
            c=a+b;
            System.out.println("Fibonacci:"+a);
	    Thread.sleep(1000);
	   }
	 }
 	 catch(Exception e){}

	}
}
class even implements Runnable
{
 	int x;
	Thread t;
	even(int x)
	{
	 t=new Thread(this);
	 this.x=x;
	}
	public void run()
	{
	 
	 try
	 {
	  for(int i=1;i<=x;i++)
	  {
	   if(i%2==0)
	   {
	    System.out.println("Even:"+i);
	    Thread.sleep(1000);
	   }
	  }
	 }
	  catch(Exception e){}
	}
}
class Ex7Prblm2{
 public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the  limit of fibonacci:");
	int l1=in.nextInt();
	System.out.println("Enter the  limit of even:");
	int l2=in.nextInt();
	fibonacci f=new fibonacci(l1);  //creating object of fibonacci
	even e=new even(l2); 	
	f.t.start();	//starting thread
	e.t.start();
 }
}

/* ==================================================================================================================================================
output
====================================================================================================================================================*/

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 7

C:\Users\jinu\JAVA PROGRAMS\Experiment 7>javac  Ex7Prblm2.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 7>java Ex7Prblm2
Enter the  limit of fibonacci:
42
Enter the  limit of even:
20
Fibonacci:0
Even:2
Fibonacci:1
Even:4
Fibonacci:1
Even:6
Fibonacci:2
Even:8
Fibonacci:3
Even:10
Fibonacci:5
Even:12
Fibonacci:8
Even:14
Fibonacci:13
Even:16
Fibonacci:21
Even:18
Fibonacci:34
Even:20

=================================================================================================================================================*/	