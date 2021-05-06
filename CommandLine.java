// Program to check for command line arguments
class CommandLineInput {

public static void main ( String[] args )
{

// check if length of args array is
// greater than 0
if (args.length > 0) {

System.out.println("The command line arguments are: " ) ;
// iterating the args array and printing
// the command line arguments
for ( String val : args )
System.out.println(val);

}
else

System.out.println("No command line " + " arguments found . ") ;

} }

/* OUTPUT

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS

C:\Users\jinu\JAVA PROGRAMS>javac CommandLine.java

C:\Users\jinu\JAVA PROGRAMS>java CommandLineInput Have a nice day
The command line arguments are:
Have
a
nice
day

C:\Users\jinu\JAVA PROGRAMS>java CommandLineInput
No command line  arguments found .
