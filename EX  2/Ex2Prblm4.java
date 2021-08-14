======================================================================================================
Qn.Add complex numbers
======================================================================================================

import java.util.Scanner;
class Complex{
	int real;
	int img;
	Complex(int r,int i){
		real=r;
		img=i;
	}
	Complex sum(Complex c1,Complex c2){
		Complex c3=new Complex(0,0);
		c3.real=c1.real+c2.real;
		c3.img=c1.img+c2.img;
		return (c3);
	}
	public static void main(String args[])
	{       
		Complex c3;
		int r,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Real and imaginary parts of first complex number  :");
		r=sc.nextInt();
		i=sc.nextInt();
		Complex c1=new Complex(r,i);
		System.out.println("First complex number= "+c1.real+"+"+c1.img+"i");
		System.out.println("Real and imaginary parts of second complex number :");
		r=sc.nextInt();
		i=sc.nextInt();
		Complex c2=new Complex(r,i);
		System.out.println("Second complex number= "+c2.real+"+"+c2.img+"i");
		c3=c1.sum(c1,c2);
		System.out.println("Sum of two complex numbers is = "+c3.real+"+"+c3.img+"i");
		
	}
}


\* output
===================================================================================================
C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\experiment 2

C:\Users\jinu\JAVA PROGRAMS\experiment 2>javac Ex2Prblm4.java

C:\Users\jinu\JAVA PROGRAMS\experiment 2>java Complex

Real and imaginary parts of first complex number  :
2
3
First complex number= 2+3i
Real and imaginary parts of second complex number :
4
2
Second complex number= 4+2i
Sum of two complex numbers is = 6+5i
====================================================================================================*/