/*==================================================================================================================================================
4. Program to demonstrate the creation of queue object using the PriorityQueue class
====================================================================================================================================================*/

import java.util.*;
public class PQueue{
 public static void main(String args[]){

	PriorityQueue<String> queue=new PriorityQueue<String>(); 

	queue.add("Reshma");		//adding elements
	queue.add("Banu");
	queue.add("Zain");
	System.out.println("The queue elements are:"+queue);
	
 }
}
/*==================================================================================================================================================
output
====================================================================================================================================================
C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 8

C:\Users\jinu\JAVA PROGRAMS\Experiment 8>javac PQueue.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 8>java PQueue
The queue elements are:[Banu, Reshma, Zain]

===================================================================================================================================================*/