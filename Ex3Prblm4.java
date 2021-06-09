/*=======================================================================================================================
 Qn.Write a program to illustrate the following String manipulation methods.

1. Create new strings using new.
2. Getting String length
3. String Concatenation
4. Character extraction
5. String Comparison
6. Searching substrings
7. Modifying a string
8. Data conversion using valueOf()
============================================================================================================================*/


class StringManipulation{
public static void main(String args[]){
	
	//1. Create new strings using new.
	System.out.println("\n\n=====================================creation of strings============================================\n");					
	char charecters[] = { 'W' , 'E' , 'L' , 'C' , 'O' , 'M' , 'E' , ' ', 'T' , 'O' , ' ' , 'O' , 'O' , 'T' , 'Y'};
	String strng1 = new String(charecters);
	System.out.println("first string created from char[] using new String :"+strng1);
	String strng2 = " NICE TO MEET YOU";
	System.out.println("second string created simply :"+strng2);
	byte ascii[] = {65, 66, 67, 68, 69, 70} ;
	String strng3 = new String(ascii);
	System.out.println("third string created from byte [] :"+strng3);
	
			
	//2. Getting String length
	System.out.println("\n\n======================================length of string=======================================\n");
	int length1 = strng1.length();											
	System.out.println(" length of "+strng1 +" is :"+length1);
	int length2 = strng2.length();
	System.out.println(" length of " +strng2 + " is :"+length2);

	

	//3. String Concatenation
	System.out.println("\n\n=====================================concatanation of first and second string===============================\n");
	System.out.println("using + operator :"+strng1+strng2);
	System.out.println("using concat method :"+strng1.concat(strng2));
	



	//4. Character extraction
	System.out.println("\n\n=================================Character extraction==================================\n");					
	System.out.println("find the charecter at 2nd  position of fisrt string using charAt() :"+strng1.charAt(1));
	char buf[] = new char[3];
	strng1.getChars(2,5,buf,0);
	String strng4 = new String(buf);
	System.out.println("find the charecter between 3 and 6 positin of "+strng1 +" is using getChars() :"+strng4);



	//5. String Comparison
	System.out.println("\n\n========================================String Comparison==============================================\n");					
	System.out.println("using equals method : "+strng1 + " equals " + strng2 + " -> " + strng1.equals(strng2));
	System.out.println("using equalsIgnoreCase method : "+strng1 + " equals " + strng2 + " -> " + strng1.equalsIgnoreCase(strng2));
	System.out.println("compare first and second string using compareTo() method(it give as 0,-ve,+ve value with respect to strings):"+strng1.compareTo(strng2));
	System.out.println("compare first and second string using compareToIgnoreCase() method(it give as 0,-ve,+ve value with respect to strings with out considering cases):"+strng1.compareToIgnoreCase(strng2));
	System.out.println("first of "+strng1+" is W  using startsWith( )-->"+strng1.startsWith("W"));
	System.out.println("last of "+strng1+" is E  using endsWith( )-->"+strng1.endsWith("Y"));
	


	//6. Searching substrings
	System.out.println("\n\n============================================Searching substrings===========================================\n");					
	System.out.println("using  method indexOf( ) for find first occcurance of OOTY in "+ strng1 + " : "+strng1.indexOf("OOTY"));
	System.out.println("using  method lastIndexOf( ) for find last occcurance of OOTY in "+ strng1 + " : "+strng1.lastIndexOf("OOTY"));
	
	
	
	//7. Modifying a string
	System.out.println("\n\n============================================Modifying a string============================================\n");					
	System.out.println("update the string "+strng1 +" using substring(int startIndex)  :"+strng1.substring(5));
	System.out.println("update the string "+strng1 +" using substring(int startIndex,int endIndex) :"+strng1.substring(11,15));
	System.out.println("replace the string "+strng1 +" by python using replace( ) :"+strng1.replace("OOTY","BANGLOOR"));
	System.out.println("trim the string "+strng1 +" using trim( ) :"+strng1.trim());
	System.out.println("the string "+strng3 +" convert into lowercase using String toLowerCase( ) : "+strng3.toLowerCase( ));	
	System.out.println("the string "+strng1 +" convert into uppercase using String toUpperCase( ) : "+strng1.toUpperCase( ));
	System.out.println("the string "+strng1 +" convert into uppercase using String toLowerCase( ) : "+strng1.toLowerCase( ));


	//8.Data conversion using valueOf()
	System.out.println("\n\n=======================================Data conversion using valueOf()=======================================\n");
	String strng5 = "54";
	int i = 123;  
	Integer number = Integer.valueOf(strng5);
	Double d2=Double.valueOf(i);
	System.out.println("convert sring  "+strng5+" to integer : "+number);	
	System.out.println("convert integer "+i+" to double : "+d2);	

	

}
}

\* OUTPUT
===================================================================================================================================================
Microsoft Windows [Version 10.0.19041.985]
(c) Microsoft Corporation. All rights reserved.

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 3

C:\Users\jinu\JAVA PROGRAMS\Experiment 3>javac Ex3Prblm4.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 3>java StringManipulation


=====================================creation of strings============================================

first string created from char[] using new String :WELCOME TO OOTY
second string created simply : NICE TO MEET YOU
third string created from byte [] :ABCDEF


======================================length of string=======================================

 length of WELCOME TO OOTY is :15
 length of  NICE TO MEET YOU is :17


=====================================concatanation of first and second string===============================

using + operator :WELCOME TO OOTY NICE TO MEET YOU
using concat method :WELCOME TO OOTY NICE TO MEET YOU


=================================Character extraction==================================

find the charecter at 2nd  position of fisrt string using charAt() :E
find the charecter between 3 and 6 positin of WELCOME TO OOTY is using getChars() :LCO


========================================String Comparison==============================================

using equals method : WELCOME TO OOTY equals  NICE TO MEET YOU -> false
using equalsIgnoreCase method : WELCOME TO OOTY equals  NICE TO MEET YOU -> false
compare first and second string using compareTo() method(it give as 0,-ve,+ve value with respect to strings):55
compare first and second string using compareToIgnoreCase() method(it give as 0,-ve,+ve value with respect to strings with out considering cases):87
first of WELCOME TO OOTY is W  using startsWith( )-->true
last of WELCOME TO OOTY is E  using endsWith( )-->true


============================================Searching substrings===========================================

using  method indexOf( ) for find first occcurance of OOTY in WELCOME TO OOTY : 11
using  method lastIndexOf( ) for find last occcurance of OOTY in WELCOME TO OOTY : 11


============================================Modifying a string============================================

update the string WELCOME TO OOTY using substring(int startIndex)  :ME TO OOTY
update the string WELCOME TO OOTY using substring(int startIndex,int endIndex) :OOTY
replace the string WELCOME TO OOTY by python using replace( ) :WELCOME TO BANGLOOR
trim the string WELCOME TO OOTY using trim( ) :WELCOME TO OOTY
the string ABCDEF convert into lowercase using String toLowerCase( ) : abcdef
the string WELCOME TO OOTY convert into uppercase using String toUpperCase( ) : WELCOME TO OOTY
the string WELCOME TO OOTY convert into uppercase using String toLowerCase( ) : welcome to ooty


=======================================Data conversion using valueOf()=======================================

convert sring  54 to integer : 54
convert integer 123 to double : 123.0

====================================================================================================================================================*/