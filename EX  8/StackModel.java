/*===================================================================================================================================================
3. Program to remove an object from the Stack when the position is passed as parameter
====================================================================================================================================================*/

import java.util.*;
public class StackModel{
public static void main(String args[]){
	
	Scanner s=new Scanner(System.in);
	Stack<String> stack = new Stack<String>();						//create object for Stack
	stack.push("Tiger");
	stack.push("Lion");
	stack.push("Cat");
	stack.push("Dog");
	stack.push("Cow");
	
	System.out.println("========================\nelements of stack\n=======================");	//print elements of stack using iterator
	Iterator<String> itr=stack.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}


	System.out.println("\nenter position of element you want to remove:");				//remove element from stack using removeElementAt function
	int p=s.nextInt();
	stack.removeElementAt(p-1);


	itr=stack.iterator();									//print elements after removing one
	System.out.println("\n===========================\nelements of stack after removing element\n===============================");    
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
} }


/*======================================================================================================================================================
OUTPUT
========================================================================================================================================================
Microsoft Windows [Version 10.0.19043.1165]
(c) Microsoft Corporation. All rights reserved.

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 8

C:\Users\jinu\JAVA PROGRAMS\Experiment 8>javac StackModel.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 8>java StackModel
========================
elements of stack
=======================
Tiger
Lion
Cat
Dog
Cow

enter position of element you want to remove:
3

===========================
elements of stack after removing element
===============================
Tiger
Lion
Dog
Cow
====================================================================================================================================================*/
