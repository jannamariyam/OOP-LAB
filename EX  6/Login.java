/*===================================================================================================================================================
1. Write a user defined exception class to authenticate the user name and password.
===================================================================================================================================================*/
import java.util.Scanner;
class UsernameException extends Exception
{
	public UsernameException(String msg)
	{
		super(msg);                                                               //prints the throwable exception message
	}
}

class PasswordException extends Exception
{
	public PasswordException(String msg)
	{
		super(msg);
	}
}

public class Login
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String username,password;

		System.out.print("Enter UserName : ");
		username = sc.nextLine();

		System.out.print("Enter Password : ");
		password = sc.nextLine();

		int length=username.length();

		try
		{
			if(length < 6)
				throw new UsernameException("Username must be greater than 6 characters ");
			else if(!password.equals("azka2018"))
				throw new PasswordException("Incorrect password ");
			else
				System.out.println("Login Successfully ");
		}
		catch(UsernameException e)
		{
			e.printStackTrace();                                                                        //prints the throwable along with other details like the line number and class name
		}
		catch(PasswordException p)
		{
			p.printStackTrace();
		}
		finally
		{
			System.out.println("The finally statement is executed");
		}
	}
}
/*===================================================================================================================================================
OUTPUT
=====================================================================================================================================================

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 6

C:\Users\jinu\JAVA PROGRAMS\Experiment 6>javac Login.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 6>java Login


Enter UserName : JANNA
Enter Password : 234
UsernameException: Username must be greater than 6 characters
        at Login.main(Login.java:39)
The finally statement is executed

C:\Users\jinu\JAVA PROGRAMS\Experiment 6>java Login
Enter UserName : JANNA.M.K.C
Enter Password : WER
PasswordException: Incorrect password
        at Login.main(Login.java:41)
The finally statement is executed

C:\Users\jinu\JAVA PROGRAMS\Experiment 6>java Login
Enter UserName : JANNA.M.K.C
Enter Password : azka2018
Login Successfully
The finally statement is executed
===================================================================================================================================================*/
