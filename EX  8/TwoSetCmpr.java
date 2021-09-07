/*==================================================================================================================================================
7. Write a Java program to compare two hash set
=====================================================================================================================================================*/
import java.util.*;

public class TwoSetCmpr {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();			//create object set1 for HashSet and add elemts

        set1.add("Aa");
        set1.add("Bb");
        set1.add("Cc");
        set1.add("Dd");
        set1.add("Ee");


        Set<String> set2 = new HashSet<>();			//create object set2 for HashSet and add elemts


        set2.add("Aa");
        set2.add("Ff");
        set2.add("Bb");
        set2.add("Dd");
        set2.add("Ee");
	
	System.out.println("===============\nelement of set1\n==============");		//print both selts elements
	for (String element : set1){
		System.out.println(element);
	}
	
	System.out.println("================\nelement of set2\n===============");
	for (String element : set2){
		System.out.println(element);
	}



       	boolean isEquals = set1.equals(set2);					//compare 2 sets and pass message
	if(isEquals){
		System.out.println("\n\nboth sets are equal");
	}
	else{
		System.out.println("\n\nboth sets are not equal");
	}
    

	}
}


/*===================================================================================================================================================
output
=====================================================================================================================================================

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 8

C:\Users\jinu\JAVA PROGRAMS\Experiment 8>javac TwoSetCmpr.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 8>java TwoSetCmpr
===============
element of set1
==============
Aa
Bb
Cc
Dd
Ee
================
element of set2
===============
Aa
Ff
Bb
Dd
Ee


both sets are not equal

=================================================================================================================================================*/
Verified
