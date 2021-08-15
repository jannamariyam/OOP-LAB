/*===================================================================================================================================================
5. Create an Arithmetic package that has classes and interfaces for the 4 basic arithmetic operations. Test the package by implementing all operations on two given numbers
===================================================================================================================================================*/

import BasicOprtns.*;
import java.util.Scanner;

class BOprtns{
	public static void main(String args[]){
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\n====================================================");
		System.out.println("To perform basic arithmetic operation,Enter 2 numbers :");
		System.out.println("====================================================");
		a=sc.nextInt();
		b=sc.nextInt();
		Add oprtn1=new Add(a,b);
		oprtn1.add1();
		Sub oprtn2=new Sub(a,b);
		oprtn2.sub1();
		Mul oprtn3=new Mul(a,b);
		oprtn3.mul1();
		Div oprtn4=new Div(a,b);
		oprtn4.div1();
	}
}
/*===================================================================================================================================================
OUTPUT
=====================================================================================================================================================
Microsoft Windows [Version 10.0.19043.1165]
(c) Microsoft Corporation. All rights reserved.

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 5

C:\Users\jinu\JAVA PROGRAMS\Experiment 5>javac BOprtns.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 5>java BOprtns


====================================================
To perform basic arithmetic operation,Enter 2 numbers :
====================================================
4
6
4 + 6 = 10
4 - 6 = -2
4 * 6 = 24
4 / 6 = 0

C:\Users\jinu\JAVA PROGRAMS\Experiment 5>java BOprtns


====================================================
To perform basic arithmetic operation,Enter 2 numbers :
====================================================
10
5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

==================================================================================================================================================*/