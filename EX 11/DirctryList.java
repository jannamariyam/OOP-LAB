/*===================================================================================================================================================
1. Program to list the sub directories and files in a given directory and also search for a file name.
=====================================================================================================================================================*/

import java.io.File;
import java.util.Scanner;
class DirctryList {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the directory name : ");
		String dirname = sc.nextLine();

		//pass the directory name to File object
		File f1 = new File(dirname);
      
		System.out.println("Enter the file name to be searched in "+ dirname +" : ");
		String fname = sc.nextLine();

		//to store the list of files present in the directory.
		File[] list = f1.listFiles();
		
		//if the directory present
		if (f1.isDirectory()) {
			System.out.println("Directory of " + dirname);
			System.out.println("------------------------------------------");
			
			for (int i=0; i < list.length; i++) {
			
				if (list[i].isDirectory()) {
					System.out.println(list[i] + " is a directory");
				} else {
					System.out.println(list[i] + " is a file");
				}
			}
			System.out.println("------------------------------------------");
			int Flag = 0;
			
			//searching for the given file from the directory
			for ( File f2 : list){
				if(fname.equalsIgnoreCase(f2.getName())){
					System.out.println(fname+" Found");
					Flag = 1;
					break;
				}
			} 
			
			//when file not present in directory
			if(Flag == 0) System.out.println(fname+" Not Found");
		} else {
			System.out.println(dirname + " is not a directory");
		}
	}
}

/*======================================================================================================================================================================================
OUTPUT
===================================================================================================================================================

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS

C:\Users\jinu\JAVA PROGRAMS>javac DirctryList.java

C:\Users\jinu\JAVA PROGRAMS>java DirctryList
Enter the directory name :
git push
Enter the file name to be searched in git push :
Ex5Prblm3.java
Directory of git push
------------------------------------------
git push\.git is a directory
git push\BufferReader.java is a file
git push\CommandLine.java is a file
git push\Console.java is a file
git push\EX  10 is a directory
git push\EX  2 is a directory
git push\EX  3 is a directory
git push\EX  4 is a directory
git push\EX  5 is a directory
git push\EX  6 is a directory
git push\EX  7 is a directory
git push\EX  8 is a directory
git push\EX 1 is a directory
git push\EX 9 is a directory
git push\Ex5Prblm1.java is a file
git push\Ex5Prblm3.java is a file
git push\sample1.java is a file
git push\Scanner.java is a file
git push\variables.java is a file
git push\variables2.java is a file
------------------------------------------
Ex5Prblm3.java Found

===============================================================================================================================================*/