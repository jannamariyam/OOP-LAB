/*===================================================================================================================================================
6. Program to demonstrate the creation of Set object using the LinkedHashset class
======================================================================================================================================================*/

import java.util.*;
public class LinkedHashSet1{
public static void main(String args[]){

					//Creating LinkedHashSet and adding elements
	LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("Apple");
		set.add("Banana");
		set.add("Plum");
		set.add("Banana");
		set.add("Mango");
		
					//to print element
		System.out.println("=========================================\nelements of set using LinkedHashset\n=========================================");				//Traversing elements
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

} }

/*===================================================================================================================================================
output
===================================================================================================================================================

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 8

C:\Users\jinu\JAVA PROGRAMS\Experiment 8>javac  JavaCollection.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 8>java  JavaCollection
=========================================
elements of set using LinkedHashset
=========================================
Apple
Plum
Mango
Banana

=====================================================================================================================================================*/
Linked Hashset?
