/*1.Define 2 classes; one for generating multiplication table of 5 
and other for displaying first N prime numbers. Implement using threads. (Thread class)*/

import java.util.*;
class multitable extends Thread
{
 public void run()
 {
  //Scanner in=new Scanner(System.in);
  int n,c;
  n=5;
  System.out.println("Multiplication table of 5");
  for(int i=1;i<=10;i++)
   {
    System.out.println(n+"X"+i+"="+n*i);
    try
	{
	 Thread.sleep(2000);
	}
	catch(Exception e){}
  }  
 }
}
class prime extends Thread
{
 public void run()
 {
  Scanner in=new Scanner(System.in);
  int n,c=1,num=2;
  System.out.print("Enter number of prime numbers:");
  n=in.nextInt();
  for(int i=1;i<=n;)
   {
    for (int j=2;j<=Math.sqrt(num);j++)
    {
     if(num%j==0)
     {
      c=0;
      break;
     }
    }
    if(c!=0)
    {
	
     System.out.println(num+" ");
     i++;
     try
         {
	  Thread.sleep(2000);
	 }
	 catch(Exception e){}
    }
    c=1;
    num++;
 }
}}
public class MultiplPrime
{
 public static void main(String[] args)
 {
	multitable a=new multitable();
	prime b=new prime();
	a.start();
	b.start();
}
}

