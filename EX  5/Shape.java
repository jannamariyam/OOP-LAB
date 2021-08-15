/*==================================================================================================================================================
4. Create a Graphics package that has classes and interfaces for figures Rectangle, Triangle, Square and Circle. Test the package by finding the area of these figures.
====================================================================================================================================================

import Graphics.*;
import java.util.Scanner;

class Shapes{
	public static void main(String[] args){
		int l,b,h,r,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth of the Rectangle : ");
		l=sc.nextInt();
		b=sc.nextInt();
		RectangleA rect=new RectangleA(l,b);
		rect.area();
		System.out.println("Enter the base and height of the Triangle : ");
		b=sc.nextInt();
		h=sc.nextInt();
		TriangleA tri=new TriangleA(b,h);
		tri.area();
		System.out.println("Enter the side of the Square : ");
		s=sc.nextInt();
		SquareA sq=new SquareA(s);
		sq.area();
		System.out.println("Enter the radius of the Circle : ");
		r=sc.nextInt();
		CircleA cir=new CircleA(r);
		cir.area();
		
		
	}
}
/* ===================================================================================================================================================
OUTUT
=====================================================================================================================================================

C:\Users\jinu\JAVA PROGRAMS\Experiment 5>javac Shape.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 5>java Shapes
Enter the length and breadth of the Rectangle :
4
2
Area = 8
Enter the base and height of the Triangle :
4
3
Area = 6
Enter the side of the Square :
5
Area = 25
Enter the radius of the Circle :
3
Area = 27

=====================================================================================================================================================*/