/*====================================================================================================================================================
1. Program to demonstrate the working of Map interface
by adding, changing and removing elements.
====================================================================================================================================================*/

import java.util.*;

class HashMap1 {
	public static void main(String args[]) {

		// Create a hash map.
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// Put elements to the map
		hm.put("ENGLISH", 43);
		hm.put("MATHS", 50);
		hm.put("ARABIC", 49);
		hm.put("SCIENCE", 39);
		hm.put("MALAYALAM", 45);

		
		System.out.println("===============================\nDisplay the content \n================================\nMarks of Arun ;\n"+hm);
	

		// updating the value of HashMap
		Integer no = hm.get("SCIENCE");
		hm.put("SCIENCE",no+4);

		
		System.out.println("===============================\nDisplay the content after the updation \n===============================\nMarks of Arun ;\n"+hm);
		

		hm.remove("MALAYALAM");
		System.out.println("===============================\nDisplay the content after deletion \n===============================\nMarks of Arun ;\n"+hm);
		
	}
}

/*=================================================================================================================================================
Output
===================================================================================================================================================
C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 9

C:\Users\jinu\JAVA PROGRAMS\Experiment 9>javac HashMap1.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 9>java HashMap1
===============================
Display the content 
================================
Marks of Arun ;
{MATHS=50, ARABIC=49, ENGLISH=43, SCIENCE=39, MALAYALAM=45}
===============================
Display the content after the updation 
===============================
Marks of Arun ;
{MATHS=50, ARABIC=49, ENGLISH=43, SCIENCE=43, MALAYALAM=45}
===============================
Display the content after deletion 
===============================
Marks of Arun ;
{MATHS=50, ARABIC=49, ENGLISH=43, SCIENCE=43}


====================================================================================================================================================*/
