/*================================================================================================================================================
3.Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor to initialize the data members and another class ‘Employee’ that inherits the 
properties of class Person and also contains its own data members like Empid, Company_name,Qualification, Salary and its own constructor.Create another class ‘Teacher’ 
that inherits the properties of class Employee and contains its own data members like Subject,Department, Teacherid and also contain constructors and methods to display 
the data members. Use array of objects to display details of N teachers.(multilevel inheritance)
====================================================================================================================================================*/

import java.util.Scanner;
//class Person
class Person
{
	String Name;
	String Gender;
	String Address;
	int Age;
	
	Person(String Name,String Gender,String Address,int Age)  		//constructor of Person for initialisation
	{
		this.Name = Name;
		this.Gender = Gender;
		this.Address = Address;
		this.Age = Age;
	}
	
	

	
	
	void displayP()								//method for display thedetails of person
	{
		System.out.println("\n-----------------------------------");
		System.out.println("Name :"+Name);
		System.out.println("Gender :"+Gender);
		System.out.println("Address :"+Address);
		System.out.println("Age :"+Age);
	}
}
//subclass of Person
class Employee extends Person
{
	int Empid;
	String Company_name;
	String Qualification;
	int Salary;

	Employee(String Name,String Gender,String Address,int Age,int Empid,String Company_name,String Qualification,int Salary)      	//constructer for Employee for innitiolizing
	{																//use super for invok attributes
		super(Name,Gender,Address,Age);												
		this.Empid = Empid;
		this.Company_name = Company_name;
		this.Qualification = Qualification;
		this.Salary = Salary;
	}

	
	
	
	void displayE()												//method for display the details of employee
	{
		
		super.displayP();										//invoke the method in Person
		System.out.println("Empid :"+Empid);
		System.out.println("Company Name :"+Company_name);
		System.out.println("Qualification :"+Qualification);
		System.out.println("Salary :"+Salary);
	}
	

}
//subclass of Employee
class Teacher extends Employee
{
	String Subject;
	String Dept;
	int Teacherid;
	
	Teacher(String Name,String Gender,String Address,int Age,int Empid,String Company_name,String Qualification,int Salary,String Subject,String Dept,int Teacherid) //constructor of Teacher
	{
		super(Name,Gender,Address,Age,Empid,Company_name,Qualification,Salary);											//invoke the attributes in Employee
		this.Subject = Subject;
		this.Dept = Dept;
		this.Teacherid = Teacherid;
	}
	
	
	
	void display()									//method for displying the details of Teacher including parent classes method
	{
		
		super.displayE();
		System.out.println("Subject :"+Subject);
		System.out.println("Department :"+Dept);
		System.out.println("Teacher id :"+Teacherid);
	}
	
		
}



//main class method
class Persons{
public static void main(String args[]){
	int n,age,empid,salary,tchr_id;
	String name,gndr,add,qlfctn,cmpny_name,sub,dpt;
 
	Scanner s = new Scanner(System.in);

	System.out.println("\n\nEnter the number of employee\n============================");
	n = s.nextInt();
	

	Teacher k[] = new Teacher[n];
							//create a object array for call Teacher
	for(int i= 0 ; i<n ; i++)							//to enter the details of Teacher
	{
		System.out.println("\n\nPlease Enter details :"+(i+1));		
		System.out.println("===========================");
		s.nextLine();
		System.out.println("Enter Name:");
		name = s.nextLine();
		

		System.out.println("Enter Gender:");
		gndr = s.nextLine();

		System.out.println("Enter Address:");
		add = s.nextLine();
		

		System.out.println("Enter Age:");
		age = s.nextInt();

		System.out.println("Enter Employee id:");
		empid = s.nextInt();
		s.nextLine();
		
		System.out.println("Enter Company name:");
		cmpny_name = s.nextLine();

		System.out.println("Enter Qualifications:");
		qlfctn = s.nextLine();

		System.out.println("Enter Salary:");
		salary = s.nextInt();
		s.nextLine();

		System.out.println("Enter Subject:");
		sub = s.nextLine();
		
		System.out.println("Enter Department name:");
		dpt = s.nextLine();
		
		System.out.println("Enter Teacher id:");
		tchr_id = s.nextInt();
		

		k[i] = new Teacher(name,gndr,add,age,empid,cmpny_name,qlfctn,salary,sub,dpt,tchr_id);			//call method for Teacher for every element in array
		
	}
	System.out.println("**************** DETAILS **************");		//call the method display for every element in array for displaying details of Teacher together
	for(int i = 0 ;i<n ; i++)
	{
		k[i].display();
	}
	
 
 }
}


/*===============================================================================================================================================
output
=================================================================================================================================================

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 4

C:\Users\jinu\JAVA PROGRAMS\Experiment 4>javac Ex4Prblm3.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 4>java Persons


Enter the number of employee
============================
3


Please Enter details :1
===========================
Enter Name:
RAM
Enter Gender:
MALE
Enter Address:
RAGAM(H),VAYOOR
Enter Age:
25
Enter Employee id:
2
Enter Company name:
MVR
Enter Qualifications:
B TECH
Enter Salary:
42000
Enter Subject:
MECHANICAL
Enter Department name:
MECHANICAL ENGINEERING
Enter Teacher id:
1


Please Enter details :2
===========================
Enter Name:
SEETHA
Enter Gender:
FEMALE
Enter Address:
MELEKAL(H),VADAKARA
Enter Age:
29
Enter Employee id:
4
Enter Company name:
MICROFOCUS
Enter Qualifications:
MCA
Enter Salary:
45800
Enter Subject:
SOFTARE
Enter Department name:
SOFTWARE ENGINEERING
Enter Teacher id:
2


Please Enter details :3
===========================
Enter Name:
SARA
Enter Gender:
FEMALE
Enter Address:
KALAKKAL(H),PONNANI
Enter Age:
31
Enter Employee id:
6
Enter Company name:
WESTERN
Enter Qualifications:
M TECH
Enter Salary:
56000
Enter Subject:
CHEMICAL
Enter Department name:
CHEMICAL ENGINEERING
Enter Teacher id:
3
**************** DETAILS **************

-----------------------------------
Name :RAM
Gender :MALE
Address :RAGAM(H),VAYOOR
Age :25
Empid :2
Company Name :MVR
Qualification :B TECH
Salary :42000
Subject :MECHANICAL
Department :MECHANICAL ENGINEERING
Teacher id :1

-----------------------------------
Name :SEETHA
Gender :FEMALE
Address :MELEKAL(H),VADAKARA
Age :29
Empid :4
Company Name :MICROFOCUS
Qualification :MCA
Salary :45800
Subject :SOFTARE
Department :SOFTWARE ENGINEERING
Teacher id :2

-----------------------------------
Name :SARA
Gender :FEMALE
Address :KALAKKAL(H),PONNANI
Age :31
Empid :6
Company Name :WESTERN
Qualification :M TECH
Salary :56000
Subject :CHEMICAL
Department :CHEMICAL ENGINEERING
Teacher id :3


===================================================================================================================================================*/	


//Verified




		
	







