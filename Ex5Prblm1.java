/*==================================================================================================================================================
Create an interface having prototypes of functions area() and perimeter(). Create two classes Circle and Rectangle which implements the above interface. Create a menu 
driven program to find area and perimeter of objects.
===================================================================================================================================================*/import java.util.Scanner;
interface AreaPerimeter{			//interface
 
	void input();
	void area();
	void perimeter();
}
class Circle implements AreaPerimeter{ 		//class implementing interface
	int r=0;
	double pi=3.14,area=0,perimeter=0;
	public void input(){
	  Scanner in=new Scanner(System.in);
	  r=in.nextInt();
	}
	public void area()
	{
	  area=pi*r*r;
	  System.out.println("Area of circle:"+area);
	}
	public void perimeter()
	{
	  perimeter=2*pi*r;
	  System.out.println("Perimeter of circle:"+perimeter);
   	}
}
class Rectangle implements AreaPerimeter{		//class implemeting interface
	int l=0,b=0;
	double area,perimeter;
	public void input()
	{
	   Scanner in=new Scanner(System.in);
	   l=in.nextInt();
	   b=in.nextInt();
	}
	public void area()
	{
	   area=l*b;
	   System.out.println("Area of Rectangle:"+area);
  	}
	public void perimeter()
	{
	   perimeter=2*(l+b);
	   System.out.println("Perimeter of Rectangle:"+perimeter);
	}
}
class Areaperi{
  public static void main(String [] args){
	int ch;
	Rectangle r=new Rectangle();		//creating object of class rectangle
	Circle c=new Circle();			//creating object of class circle
	Scanner in=new Scanner(System.in);
	do
	{
		System.out.println("\n==============================");
		System.out.println("Select your option");
		System.out.println("===============================\n");
		System.out.println("1.Area of circle");
		System.out.println("2.Area of Rectangle");
		System.out.println("3.Perimeter of circle");
		System.out.println("4.Perimeter of Rectangle");
		System.out.println("5.Exit\n");
		System.out.println("Enter your choice:");
		ch=in.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Enter the radius of circle  :");
				c.input();
				c.area();
				break;
			case 2:
				System.out.println("Enter the length and breadth of rectangle  :");
				r.input();
				r.area();
				break;
			case 3:
				System.out.println("Enter the radius of circle  :");
				c.input();	
				c.perimeter();
				break;
			case 4:
				System.out.println("Enter the length and breadth of rectangle  :");
				r.input();
				r.perimeter();	
				break;
			case 5:
				break;			
			default:
				System.out.println("invalid input ,choose a currect option.");
		}
	}while(ch!=5);
}}
/*===================================================================================================================================================
OUTPUT
====================================================================================================================================================

C:\Users\jinu>CD C:\Users\jinu\JAVA PROGRAMS\Experiment 5

C:\Users\jinu\JAVA PROGRAMS\Experiment 5>javac Ex5Prblm1.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 5>java Areaperi

==============================
Select your option
===============================

1.Area of circle
2.Area of Rectangle
3.Perimeter of circle
4.Perimeter of Rectangle
5.Exit

Enter your choice:
1
Enter the radius of circle  :
3
Area of circle:28.259999999999998

==============================
Select your option
===============================

1.Area of circle
2.Area of Rectangle
3.Perimeter of circle
4.Perimeter of Rectangle
5.Exit

Enter your choice:
2
Enter the length and breadth of rectangle  :
4
2
Area of Rectangle:8.0

==============================
Select your option
===============================

1.Area of circle
2.Area of Rectangle
3.Perimeter of circle
4.Perimeter of Rectangle
5.Exit

Enter your choice:
3
Enter the radius of circle  :
3
Perimeter of circle:18.84

==============================
Select your option
===============================

1.Area of circle
2.Area of Rectangle
3.Perimeter of circle
4.Perimeter of Rectangle
5.Exit

Enter your choice:
4
Enter the length and breadth of rectangle  :
4
2
Perimeter of Rectangle:12.0

==============================
Select your option
===============================

1.Area of circle
2.Area of Rectangle
3.Perimeter of circle
4.Perimeter of Rectangle
5.Exit

Enter your choice:
6
invalid input ,choose a currect option.

==============================
Select your option
===============================

1.Area of circle
2.Area of Rectangle
3.Perimeter of circle
4.Perimeter of Rectangle
5.Exit

Enter your choice:
5

//Verified
