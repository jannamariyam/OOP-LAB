/*==================================================================================================================================================
 Qn.Write a menu driven program that would choose either in-built method or call a user defined method to sort an
 array of strings.
==================================================================================================================================================*/

import java.util.Scanner;
import java.util.Arrays;
class StringSort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of string : ");
		int n=sc.nextInt();
		String array[]=new String[n+1];
		System.out.println("Enter a string :");
		for(int i=0;i<=n;i++)
			array[i]=sc.nextLine();
		System.out.println("Choice:");
		System.out.println("1. Built-in method");
		System.out.println("2. User defined method");
		System.out.println("Enter your choice : ");
		int ch=sc.nextInt();
		switch(ch){
			case 1: Arrays.sort(array); //builtin method to sort array
				break;
			case 2: for (int i = 0; i < n; i++)   //sorting using bubble sort
            				for (int j = 0; j < n-i; j++)
                				if (array[j].compareTo(array[j+1])>0)
                				{
                    					// swap array[j+1] and array[j]
                    					String temp = array[j];
                    					array[j] = array[j+1];
                    					array[j+1] = temp;
                				}
				break;
			default:System.out.println("Invalid Input");
				break;
		}
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
}

/* OUTPUT
=======================================================================================================================
Microsoft Windows [Version 10.0.19041.985]
(c) Microsoft Corporation. All rights reserved.

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 3

C:\Users\jinu\JAVA PROGRAMS\Experiment 3>javac Ex3Prblm3.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 3>java StringSort
Enter the no. of string :
4
Enter a string :
I
HAVE
A
CAR
Choice:
1. Built-in method
2. User defined method
Enter your choice :
1
 A CAR HAVE I

C:\Users\jinu\JAVA PROGRAMS\Experiment 3>java StringSort
Enter the no. of string :
4
Enter a string :
I
HAVE
A
CAR
Choice:
1. Built-in method
2. User defined method
Enter your choice :
2
 A CAR HAVE I
============================================================================================================================*/