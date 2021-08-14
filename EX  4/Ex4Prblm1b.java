/*===========================================================================================================================================
Qn.Create a class ‘Employee’ with data members Empid,Name, Salary, Address and constructors to initialize the data members. Create another class ‘Teacher’ that inherit the
properties of class employee and contain its own data members department, Subjects taught and constructors to initialize these data members and also include display
function to display all the data members. Use array of objects to display details of N teachers.
===============================================================================================================================================*/

import java.util.Scanner;
class Employees{
	int Empid;
	String Name,Address;
	int Salary;
	Employees(int Empid,String Name,String Address,int Salary){
		this.Empid=Empid;
		this.Name=Name;
		this.Address=Address;
		this.Salary=Salary;
	}
	Employees(){
	}
	
}
class Teacher extends Employees{
	String Department,Subject;
	Teacher(int Empid,String Name,String Address,int Salary,String Department,String Subject){
		this.Empid=Empid;
		this.Name=Name;
		this.Address=Address;
		this.Salary=Salary;
		this.Department=Department;
		this.Subject=Subject;
	}

	
		
	void display(){
		
			System.out.println("\n"+Empid+"\t "+Name+"\t "+Address+"\t "+Salary+"\t "+Department+"\t "+Subject);
		
	}
}
class EmployeeTeachers{
	public static void main(String args[]){
		int n,i,empid,salary;
		String name,address,department,subject;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of employees : ");
		n=sc.nextInt();
		Teacher array[]=new Teacher[n];
		for(i=0;i<n;i++){
			System.out.println("Enter the details of Employee "+(i+1)+" :");
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
			
			array[i]=new Teacher(empid,name,address,salary,department,subject);
		}
		System.out.println("Empid\t Name\t \tAddress\t\t Salary\t Department\t Subject\t");
		for(i=0;i<n;i++)
			array[i].display();

		
		
	}
}
/*============================================================================================================================================
OUTPUT
==============================================================================================================================================

C:\Users\jinu\JAVA PROGRAMS\Experiment 4>javac Ex4Prblm1b.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 4>java EmployeeTeachers
Enter the no. of employees :
2
Enter the details of Employee 1 :
Enter EmpId : 1
Enter Name : Anu
Enter Address : Malika(H),Koduvalli
Enter Salary : 35600
Enter Department : English
Enter Subject : Literature
Enter the details of Employee 2 :
Enter EmpId : 2
Enter Name : Swapna
Enter Address : Thulika(H),Kondotty
Enter Salary : 35000
Enter Department : Chemistry
Enter Subject : Thermodynamics
Empid    Name           Address          Salary  Department      Subject

1        Anu     Malika(H),Koduvalli     35600   English        Literature

2        Swapna  Thulika(H),Kondotty     35000   Chemistry       Thermodynamics
====================================================================================================================================================*/

//Verified
