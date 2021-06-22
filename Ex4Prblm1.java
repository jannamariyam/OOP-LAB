/*==================================================================================================================================================
Qn.Create a class ‘Employee’ with data members Empid,Name, Salary, Address and constructors to initialize the data members. Create another class ‘Teacher’ that inherit the 
properties of class employee and contain its own datamembers department, Subjects taught and constructors to initialize these data members and also include display
function to display all the data members. Use array of objects to display details of N teachers.
====================================================================================================================================================*/

import java.util.Scanner;
class Employee{
	int Empid;
	String Name,Address;
	int Salary;
	Employee(int Empid,String Name,String Address,int Salary){
		this.Empid=Empid;
		this.Name=Name;
		this.Address=Address;
		this.Salary=Salary;
	}
	Employee(){
	}
}
class Teacher extends Employee{
	String Department,Subject;
	Teacher(int Empid,String Name,String Address,int Salary,String Department,String Subject){
		super(Empid,Name,Address,Salary);
		this.Department=Department;
		this.Subject=Subject;
	}

	Teacher(){
		super();
	}
		
	void display(Teacher array1[]){
		System.out.println("Empid\t Name\t\t Address\t Salary\t Department\t Subject\t");
		for(Teacher a:array1){
			System.out.println("\n"+a.Empid+"\t "+a.Name+"\t "+a.Address+"\t"+a.Salary+"\t "+a.Department+"\t "+a.Subject+"\n");
		}
	}
}
class EmployeeTeacher{
	public static void main(String args[]){
		int n,i,empid,salary;
		String name,address,department,subject;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of employees : ");
		n=sc.nextInt();
		Teacher array2[]=new Teacher[n];
		Teacher teacher=new Teacher();
		for(i=0;i<n;i++){
			System.out.println("Please enter the details of Employee "+(i+1)+" :");
			System.out.print("Enter EmpId : ");
			empid=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Name : ");
			name=sc.nextLine(); 
			System.out.print("Enter Address : ");
			address=sc.nextLine();
			System.out.print("Enter Salary : ");
			salary=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Department : ");
			department=sc.nextLine();
			System.out.print("Enter Subject : ");
			subject=sc.nextLine();
			
			array2[i]=new Teacher(empid,name,address,salary,department,subject);
		}
		
		teacher.display(array2);
		
	}
}
/*==============================================================================================================================================
OUTPUT
================================================================================================================================================

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 4

C:\Users\jinu\JAVA PROGRAMS\Experiment 4>javac Ex4Prblm1.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 4>java Employeeteacher
Error: Could not find or load main class Employeeteacher
Caused by: java.lang.NoClassDefFoundError: EmployeeTeacher (wrong name: Employeeteacher)

C:\Users\jinu\JAVA PROGRAMS\Experiment 4>java EmployeeTeacher
Enter the no. of employees :
2
Please enter the details of Employee 1 :
Enter EmpId : 1
Enter Name : Anu
Enter Address : Shantham(H),Mavoor
Enter Salary : 25000
Enter Department : Mathematics
Enter Subject : Statistics
Please enter the details of Employee 2 :
Enter EmpId : 2
Enter Name : Shana
Enter Address : Kunnath(H),Kondotty
Enter Salary : 35000
Enter Department : Physics
Enter Subject : Mechanics
Empid    Name            Address         Salary  Department      Subject

1        Anu     Shantham(H),Mavoor     25000    Mathematics     Statistics


2        Shana   Kunnath(H),Kondotty    35000    Physics         Mechanics



================================================================================================================================================Microsoft Windows [Version 10.0.19041.1052]



==================================================================================================================================================*/


