/*==================================================================================================================================================
2.Find area of different shapes using overloaded ffunctions
====================================================================================================================================================*/

import java.util.Scanner;
class Shapes
{
	double a;
	void area(double l,double b)		//overloading area to find area of rectangle
	{
	 System.out.println("Area of rectangle="+(l*b));
	}
	void area(double r)	//overloading area to find area of circle
	{
	 a=3.14*r*r;
 	 System.out.println("Area of circle="+a);
	}
	void area(int s)	//overloading area to find area of square
	{
	 System.out.println("Area of Square="+(s*s));
	}
	void area(double p,double q,double r) //overloading area to find area of triangle 
	{
	 double s=(p+q+r)/2;
	 a=s*(s-p)*(s-q)*(s-r);
	 System.out.println("Area of triangle:"+Math.sqrt(a));
	}
}
class Areas
{
 public static void main(String args[]){
	Scanner in=new Scanner(System.in); 
	Shapes s=new Shapes(); //creating object of class Shape
	double length,breadth,radius,s1,s2,s3;
	int side;
	System.out.println("\nArea of Circle");
	System.out.println("=====================");
	System.out.println("Enter radius of circle:");
	radius=in.nextDouble();
	s.area(radius);
	System.out.println("\nArea of rectangle");
	System.out.println("=====================");
	System.out.println("Enter length of rectangle:");	//getting input from user;
	length=in.nextDouble();
	System.out.println("Enter breadth of rectangle:");
	breadth=in.nextDouble(); 
	s.area(length,breadth);
	System.out.println("\nArea of square");
	System.out.println("=====================");
	System.out.println("Enter side of square:");
	side=in.nextInt();
	s.area(side);
	System.out.println("\nArea of Triangle");
	System.out.println("=====================");
	System.out.println("Enter three sides of triangle:");
	s1=in.nextDouble();
	s2=in.nextDouble();
	s3=in.nextDouble();
	s.area(s1,s2,s3);
}
}

/* ============================================================================================================================================
OUTPUT
==============================================================================================================================================


C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 4

C:\Users\jinu\JAVA PROGRAMS\Experiment 4>javac Ex4Prblm2.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 4>java Areas

Area of Circle
=====================
Enter radius of circle:
3
Area of circle=28.259999999999998

Area of rectangle
=====================
Enter length of rectangle:
6
Enter breadth of rectangle:
3
Area of rectangle=18.0

Area of square
=====================
Enter side of square:
4
Area of Square=16

Area of Triangle
=====================
Enter three sides of triangle:
2
4
6
Area of triangle:0.0

C:\Users\jinu\JAVA PROGRAMS\Experiment 4>java Areas

Area of Circle
=====================
Enter radius of circle:
3
Area of circle=28.259999999999998

Area of rectangle
=====================
Enter length of rectangle:
4
Enter breadth of rectangle:
2
Area of rectangle=8.0

Area of square
=====================
Enter side of square:
5
Area of Square=25

Area of Triangle
=====================
Enter three sides of triangle:
3
4
5
Area of triangle:6.0

==================================================================================================================================================*/
//Verified
