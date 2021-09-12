/*==================================================================================================================================================
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

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\git push\EX  8

C:\Users\jinu\JAVA PROGRAMS\git push\EX  8>javac LinkedHashSet1.java

C:\Users\jinu\JAVA PROGRAMS\git push\EX  8>java LinkedHashSet1
=========================================
elements of set using LinkedHashset
=========================================
Apple
Banana
Plum
Mango

=====================================================================================================================================================*/
