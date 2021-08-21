/*===================================================================================================================================================
2. Find the average of N positive integers, raising a user defined exception for each negative input.
====================================================================================================================================================*/
import java.util.Scanner;

class NegativeInteger extends Exception
{
	NegativeInteger(String str)
	{
		super(str);
	}
}

class Nmbrz
{
	public static void main(String args[])
	{
		int n,i,b,s=0;
		float avg;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of integer : ");
		n=sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter "+n+" positive integers :");
		try{
			for(i = 0 ; i < n ; i++){
				b=sc.nextInt();
				if (b < 0)
					throw new NegativeInteger("The entered value is a negative integer ");
				else
					a[i]=b;
			}
		}
		catch(NegativeInteger e){
			System.out.println("Caught an Exception: \n "+e);
			System.exit(1);
		}

		for(i = 0 ; i < n ; i++){
			s = s + a[i];
			
		}
		avg = s / n;
		System.out.println("Average = "+avg);
		
	}
}
/*===================================================================================================================================================
OUTPUT
=====================================================================================================================================================

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 6

C:\Users\jinu\JAVA PROGRAMS\Experiment 6>javac Ex6prblm2.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 6>java Nmbrz
Enter the number of integer : 4
Enter 4 positive integers :
12
45
-2
Caught an Exception:
 NegativeInteger: The entered value is a negative integer


C:\Users\jinu\JAVA PROGRAMS\Experiment 6>java Nmbrz
Enter the number of integer : 3
Enter 3 positive integers :
12
3
13
Average = 9.0
====================================================================================================================================================*/