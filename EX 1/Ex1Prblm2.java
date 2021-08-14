import java.util.Scanner;
public class Ex1Prblm2{
	public static void main(String[] args)
	{
		int i,n;
		System.out.print("Input number of terms :");
		Scanner in = new Scanner(System.in);
			n = in.nextInt();
		for(i=1;i<=n;i++)
		{
		System.out.println("Number is : "+i+ "and cube of "+i+" is : "+(i*i*i));
		}
	}
}


/*OUTPUT

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS

C:\Users\jinu\JAVA PROGRAMS>javac Ex1Prblm2.java

C:\Users\jinu\JAVA PROGRAMS>java Ex1Prblm2
Input number of terms :2
Number is : 1and cube of 1 is : 1
Number is : 2and cube of 2 is : 8
