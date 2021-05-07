import java.util.Scanner;
public class Ex4Prblm1{
	public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Input value: ");
			double input=in.nextDouble();

			if(input>0)
			{
				if(input<1)
				{
					System.out.println("positive small number");
				}
				else if(input>100000)
				{
					System.out.println("positive large number");
				}
				else
				{
					System.out.println("positive number");
				}
			}
			else if (input<0)
			{
				if(Math.abs(input)<1)
				{
					System.out.println("negative small number");
				}
				else if(Math.abs(input)>100000)
				{
					System.out.println("negative large number");
				}
				else
				{
					System.out.println("negative number");
				}
			}
			else
			{
				System.out.println("Zero");
			}
		}
	}

/* OUTPUT

C:\Users\jinu\JAVA PROGRAMS>javac Ex4Prblm1.java

C:\Users\jinu\JAVA PROGRAMS>java Ex4Prblm1
Input value: 1000
positive number

C:\Users\jinu\JAVA PROGRAMS>javac Ex4Prblm1.java

C:\Users\jinu\JAVA PROGRAMS>java Ex4Prblm1
Input value: 0.5
positive small number

C:\Users\jinu\JAVA PROGRAMS>javac Ex4Prblm1.java

C:\Users\jinu\JAVA PROGRAMS>java Ex4Prblm1
Input value: -0.5
negative small number

C:\Users\jinu\JAVA PROGRAMS>javac Ex4Prblm1.java

C:\Users\jinu\JAVA PROGRAMS>java Ex4Prblm1
Input value: -100001
negative large number

C:\Users\jinu\JAVA PROGRAMS>javac Ex4Prblm1.java

C:\Users\jinu\JAVA PROGRAMS>java Ex4Prblm1
Input value: -1000
negative number

C:\Users\jinu\JAVA PROGRAMS>javac Ex4Prblm1.java

C:\Users\jinu\JAVA PROGRAMS>java Ex4Prblm1
Input value: 100001
positive large number

C:\Users\jinu\JAVA PROGRAMS>javac Ex4Prblm1.java

C:\Users\jinu\JAVA PROGRAMS>java Ex4Prblm1
Input value: 0
Zero

*/
					