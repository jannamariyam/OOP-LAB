/*===================================================================================================================================================
3. Write a program to copy one file to another.
=====================================================================================================================================================*/

import java.io.*;
import java.util.*;

class CopyFile {

	public static void main(String args[])throws IOException
	{	
		int i;
		FileInputStream fin;         //creates a file input stream to read from the specified file name
		FileOutputStream fout;       //creates a file output stream to write to the specified file name
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the file name to be copied from : ");
		String f1 = sc.nextLine();

		System.out.print("Enter the file name to be copied to : ");
		String f2 = sc.nextLine();

		
		
		// open input file
			

		fin = new FileInputStream(f1);


  		// open output file



		fout = new FileOutputStream(f2);





		// Copy File


		do {
			i = fin.read();
			if(i != -1)
				fout.write(i);
			} while(i != -1);

		System.out.println("The output of "+f2+" :");
		fin = new FileInputStream(f2);
		// read characters until EOF is encountered
		do {

			i = fin.read();
			if(i != -1)
				//read a character with read() and cast the value into a char.
				System.out.print((char) i);

		} while(i != -1);
		fin.close();
		fout.close();
	}

}
/*=====================================================================================================================================================
OUTPUT
=======================================================================================================================================================

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 11

C:\Users\jinu\JAVA PROGRAMS\Experiment 11>javac CopyFile.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 11>java CopyFile
Enter the file name to be copied from : file1.txt
Enter the file name to be copied to : file2.txt
The output of file2.txt :
Good morning
=====================================================================================================================================================*/