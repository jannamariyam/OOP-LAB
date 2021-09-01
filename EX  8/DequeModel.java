/*================================================================================================================================================
5. Program to demonstrate the addition and deletion of elements in deque
==================================================================================================================================================*/
import java.util.*;
public class DequeModel{
public static void main(String[] args) {
										//Creating Deque and adding elements
	Deque<String> deque = new ArrayDeque<String>();
		deque.add("Aalphy");							
		deque.add("Beena");
		deque.add("Chantrika");
	

										//Traversing elements
	System.out.println("=====================================\nelements of Deque\n===================================");
	for (String str : deque) 
	{
	System.out.println(str);
	}
	
	deque.remove();								//remove first element
	System.out.println("====================================\nelements of Deque after remove first element\n===================================");
	for (String str : deque) 
	{
	System.out.println(str);
	}

	

	int l=deque.size();							//to remove all elements
	for (int i=0;i<l;i++)
	{
		deque.remove();
	}
	
	

	System.out.println("===============================\nelements of Deque after remove all element\n======================================");
	for (String str : deque) 
	{
	System.out.println(str);
	}
} }






/*=============================================================================================================================================================================================
OUTPUT
====================================================================================================================================================

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 8

C:\Users\jinu\JAVA PROGRAMS\Experiment 8>javac DequeModel.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 8>java DequeModel
=====================================
elements of Deque
===================================
Aalphy
Beena
Chantrika
====================================
elements of Deque after remove first element
===================================
Beena
Chantrika
===============================
elements of Deque after remove all element
======================================

====================================================================================================================================================*/