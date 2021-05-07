import java.util.Scanner;
public class Ex1Prblm4{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input First Number: ");
		double x = in.nextDouble();
		System.out.println("Input Second Number: ");
		double y = in.nextDouble();
		System.out.println("Input Third Number: ");
		double z= in.nextDouble();
		if(x<y && y<z)
		{
			System.out.println("Increasing order");
		}
		else if(x>y && y>z)
			System.out.println("Decreasing order");
		else
		{
			System.out.println("Neither increasing or decreasing order");
		}
	}
}

/*

OUTPUT

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS

C:\Users\jinu\JAVA PROGRAMS>javac Ex1Prblm4.java

C:\Users\jinu\JAVA PROGRAMS>java Ex1Prblm4
Input First Number:
1
Input Second Number:
3
Input Third Number:
6
Increasing order

C:\Users\jinu\JAVA PROGRAMS>javac Ex1Prblm4.java

C:\Users\jinu\JAVA PROGRAMS>java Ex1Prblm4
Input First Number:
6
Input Second Number:
4
Input Third Number:
2
Decreasing order

C:\Users\jinu\JAVA PROGRAMS>javac Ex1Prblm4.java

C:\Users\jinu\JAVA PROGRAMS>java Ex1Prblm4
Input First Number:
1
Input Second Number:
9
Input Third Number:
4
Neither increasing or decreasing order

*/
