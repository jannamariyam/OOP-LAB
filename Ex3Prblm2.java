==============================================================================================================================================
Qn.Program to create a class for Employee having attributes eNo,eName and eSalary.Read n Employee information and search for an employee given eNo,using concept of array of objects.
==========================================================================================================================================================
import java.util.Scanner;
class Employee{
	int eNo;
	String eName;
	float eSalary;

	public void getInput(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the employee Number : ");
		eNo = in.nextInt();
		System.out.print("Enter the name : ");
		eName = in.next();
		System.out.print("Enter the salary : ");
		eSalary = in.nextFloat();
		}
	public void display(){
		System.out.println("Employee number =  " + eNo);
		System.out.println("Employee Name = " + eName);
		System.out.println("Employee salary = " + eSalary);
		}
	public static void main(String[] args){
		int n,x,flag=0,i=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of employees you want to add  : ");
		n=s.nextInt();

		Employee e[] = new Employee[n];
		for(i=0;i<n;i++){
			e[i] = new Employee();
			e[i].getInput();
			}
		System.out.println("\n\n*************Data Entered as below***************");
			for(i=0;i<n;i++){
				e[i].display();
				}
		
	
		System.out.println("Enter the eNo you want to find :");
		x = s.nextInt();
		for(i=0;i<n;i++)
		{
			if(e[i].eNo == x)
			{
				flag = 1;
				break;
			}
			else
			{
				flag = 0;
			}
		}
		if(flag == 1)
		{
			System.out.println(" "+x+ "  found at position : "+(i+1));
			e[i].display();
	
		}
		else
		{
			System.out.println("  "+x+" not found");

		}
	}
}



/*==============================================================================================================================================
 OUTPUT   1
====================================================================================================================================================
C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 3

C:\Users\jinu\JAVA PROGRAMS\Experiment 3>javac Ex3Prblm2.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 3>java Employee
Enter number of employees you want to add  : 4
Enter the employee Number : 1
Enter the name : ANU
Enter the salary : 24000
Enter the employee Number : 4
Enter the name : DAIN
Enter the salary : 17900
Enter the employee Number : 2
Enter the name : BEENA
Enter the salary : 16700
Enter the employee Number : 5
Enter the name : ELEENA
Enter the salary : 24000


*************Data Entered as below***************
Employee number =  1
Employee Name = ANU
Employee salary = 24000.0
Employee number =  4
Employee Name = DAIN
Employee salary = 17900.0
Employee number =  2
Employee Name = BEENA
Employee salary = 16700.0
Employee number =  5
Employee Name = ELEENA
Employee salary = 24000.0
Enter the eNo you want to find :
4
 4  found at position : 2
Employee number =  4
Employee Name = DAIN
Employee salary = 17900.0

=====================================================================================================================================
OUTPUT  2
=====================================================================================================================================


C:\Users\jinu\JAVA PROGRAMS\Experiment 3>java Employee
Enter number of employees you want to add  : 3
Enter the employee Number : 3
Enter the name : CHANDRAN
Enter the salary : 23000
Enter the employee Number : 1
Enter the name : ANU
Enter the salary : 24000
Enter the employee Number : 6
Enter the name : FIROZ
Enter the salary : 25600


*************Data Entered as below***************
Employee number =  3
Employee Name = CHANDRAN
Employee salary = 23000.0
Employee number =  1
Employee Name = ANU
Employee salary = 24000.0
Employee number =  6
Employee Name = FIROZ
Employee salary = 25600.0
Enter the eNo you want to find :
7
  7 not found

==========================================================================================================================================*/