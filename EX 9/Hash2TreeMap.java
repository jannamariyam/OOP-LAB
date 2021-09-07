/*=================================================================================================================================================
2. Program to Convert HashMap to TreeMap
==================================================================================================================================================*/
import java.util.*;

class Hash2TreeMap {

public static void main(String args[])
    {
        								// Create a HashMap
        Map<String, Integer> hm = new HashMap<String, Integer>();
       								 // Add entries to the HashMap
        hm.put("COMPUTER", 43);
        hm.put("MATHS",50);
        hm.put("EVS",42);
  
        								// Print the HashMap
        System.out.println("HashMap : " + hm);
  	
								//convert the HashMap to TreeMap
        Map<String, Integer> tm = new TreeMap<String, Integer>();
        tm.putAll(hm);
        
								// Print the TreeMap
        System.out.println("TreeMap : " + tm);
    }
}

/*===================================================================================================================================================
output
=====================================================================================================================================================
C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 9

C:\Users\jinu\JAVA PROGRAMS\Experiment 9>javac Hash2TreeMap.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 9>java Hash2TreeMap
HashMap : {MATHS=50, EVS=42, COMPUTER=43}
TreeMap : {COMPUTER=43, EVS=42, MATHS=50}

====================================================================================================================================================*/

