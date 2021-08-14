/*
QUESTION
=================
Read 2 matrices from console and perform matrix addition */

import java.util.Scanner;
class Add2Matrix
{
	public static void main(String args[])
	{
		int m,n,c,d;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of rows and columns of matrix");
		m=in.nextInt();
		n=in.nextInt();

		int first[][] = new int[m][n];
		int second[][] = new int[m][n];
		int sum[][] = new int[m][n];
		System.out.println("Enter the elements of first  matrix");
		
		for(c=0;c<m;c++)
			for(d=0;d<n;d++)
				first[c][d] = in.nextInt();
		System.out.println("Your first matrix is :");
		for(c=0;c<m;c++)
		{
			for(d=0;d<n;d++)
				System.out.print(first[c][d]+"\t");
			System.out.println();
		}


		System.out.println("Enter the elements of second matrix");
		
		for(c=0;c<m;c++)
			for(d=0;d<n;d++)
				second[c][d] = in.nextInt();

		System.out.println("Your second matrix is :");
		for(c=0;c<m;c++)
		{
			for(d=0;d<n;d++)
				System.out.print(second[c][d]+"\t");
			System.out.println();
		}

		for(c=0;c<m;c++)
			for(d=0;d<n;d++)
				sum[c][d] = first[c][d]+second[c][d];

		System.out.println("Sum of the matrices:");
		for(c=0;c<m;c++)
		{
			for(d=0;d<n;d++)
				System.out.print(sum[c][d] + "\t");
			System.out.println();
		}
	}
}

/* OUTPUT
==================================
Microsoft Windows [Version 10.0.19041.985]
(c) Microsoft Corporation. All rights reserved.

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\experiment 2

C:\Users\jinu\JAVA PROGRAMS\experiment 2>javac Ex2Prblm2.java

C:\Users\jinu\JAVA PROGRAMS\experiment 2>java Add2Matrix
Enter number of rows and columns of matrix
3
2
Enter the elements of first  matrix
1
2
3
4
5
6
Your first matrix is :
1       2
3       4
5       6
Enter the elements of second matrix
7
8
9
0
1
2
Your second matrix is :
7       8
9       0
1       2
Sum of the matrices:
8       10
12      4
6       8

*/


