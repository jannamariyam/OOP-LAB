// Java program to demonstrate working of Scanner in Java
import java .util.Scanner ;
class GetScannerInput {

public static void main ( String args[ ] )
{

// Using Scanner for Getting Input from User
System.out.print("Enter a string : ") ;
Scanner in = new Scanner (System.in ) ;
String s = in.nextLine( ) ;
System.out.println("You entered string : " + s ) ;
System.out.print("Enter an Integer : ") ;
int a = in.nextInt( ) ;
System . out . println("You entered integer : "+ a ) ;
System.out.print("Enter a Float Value : ") ;
float b = in.nextFloat( ) ;
System.out.println("You entered float : " + b ) ;
}
}

/* OUTPUT

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS

C:\Users\jinu\JAVA PROGRAMS>javac Scanner.java

C:\Users\jinu\JAVA PROGRAMS>java GetScannerInput
Enter a string : Have a nice day.
You entered string : Have a nice day.
Enter an Integer : 11
You entered integer : 11
Enter a Float Value : 1.34
You entered float : 1.34
