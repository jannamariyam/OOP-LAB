/*==================================================================================================================================================
1. Maintain a list of Strings using ArrayList from collection framework, perform built-in operations.
===================================================================================================================================================*/

import java.util.*;
class ArrayListDemo {
public static void main(String args[]) {
	// Create an array list.
	ArrayList<String> al = new ArrayList<String>();


	
	System.out.println("\n=================\nARRAY LIST\n====================\n");
	System.out.println("\nInitial size of al: " + al.size());

	// Add elements to the array list.
	al.add("A");
	al.add("B");
	al.add("C");
	al.add("D");
	al.add("E");
	al.add("F");
	al.add(1, "a");

	System.out.println("\nSize of al after add A,B,C,D,E,F: " + al.size());

	// Display the array list.
	System.out.println("\nContents of al after add A,B,C,D,E,F : " + al);

	// Remove elements from the array list.
	al.remove("E");
	al.remove(3);

	System.out.println("\nSize of al after deletions of E and element in 3 position: " + al.size());
	System.out.println("\nContents of al after deletions of E and element in 3 position: " + al);

	String ia[] = new String[al.size()];												//objeact for array
	ia = al.toArray(ia);
	
	System.out.println("\nafter converted array list to array, the array is:");
	for(String i : ia) 
	System.out.println(i);

	
}
}

/*=====================================================================================================================================================
OUTPUT
==========================================================================================================================================================

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 8

C:\Users\jinu\JAVA PROGRAMS\Experiment 8>javac Ex8Prblm1.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 8>java ArrayListDemo

=================
ARRAY LIST
====================


Initial size of al: 0

Size of al after add A,B,C,D,E,F: 7

Contents of al after add A,B,C,D,E,F : [A, a, B, C, D, E, F]

Size of al after deletions of E and element in 3 position: 5

Contents of al after deletions of E and element in 3 position: [A, a, B, D, F]

after converted array list to array, the array is:
A
a
B
D
F

====================================================================================================================================================*/