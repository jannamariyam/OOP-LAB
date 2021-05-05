class Sample{
public static void main(String args[]){
System.out.println("----------length of the string-----------");
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());
System.out.println("--------Upper case and Lower Case--------");
String txt1 = "Hello World";
System.out.println(txt1.toUpperCase()); 
System.out.println(txt1.toLowerCase());
System.out.println("-----------To find a character-----------");
String txt2 = "Please locate where 'locate' occurs!";
System.out.println(txt2.indexOf("locate"));
System.out.println("----------String concatenation-----------");
String firstName = "John";
String lastName = "Doe";
System.out.println(firstName + " " + lastName);
System.out.println(firstName.concat(lastName));
System.out.println("-----------Special Characters------------");
String txt4 = "We are the so-called \"Vikings\" from the north.";
String txt5 = "It\'s alright.";
String txt6 = "The character \\ is called backslash.";
System.out.println(txt4);
System.out.println(txt5);
System.out.println(txt6);


}
}

/* output

Microsoft Windows [Version 10.0.19041.928]
(c) Microsoft Corporation. All rights reserved.

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS

C:\Users\jinu\JAVA PROGRAMS>javac sample1.java

C:\Users\jinu\JAVA PROGRAMS>java Sample
----------length of the string-----------
The length of the txt string is: 26
--------Upper case and Lower Case--------
HELLO WORLD
hello world
-----------To find a character-----------
7
----------String concatenation-----------
John Doe
JohnDoe
-----------Special Characters------------
We are the so-called "Vikings" from the north.
It's alright.
The character \ is called backslash.

C:\Users\jinu\JAVA PROGRAMS>   */