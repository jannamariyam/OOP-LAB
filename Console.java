// Java program to demonstrate working of System . console ( )
// Note that this program does not work on IDEs as
// System . console ( ) may require console
class ConsoleInput{
public static void main ( String [ ] args )
{

System.out.print("Enter a string : ");
// Using Console to input data from user
String name = System.console( ).readLine( ) ;
System.out.println("You entered string : " + name ) ;

}
}

/* OUTPUT

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS

C:\Users\jinu\JAVA PROGRAMS>javac Console.java

C:\Users\jinu\JAVA PROGRAMS>java ConsoleInput
Enter a string : Janna
You entered string : Janna

