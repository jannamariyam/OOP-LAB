/*=====================================================================================================================================================
4. Write a program that reads from a file having integers. Copy even numbers and odd numbers to separate files.
=====================================================================================================================================================*/

import java.io.*;
import java.util.*;

class Numbers{
	public static void main(String args[]) throws IOException
	{
		int i;
		char j;
		FileInputStream fin;
		FileOutputStream feven = null;
		FileOutputStream fodd = null;
		Scanner sc = new Scanner(System.in);

		

		fin = new FileInputStream("file3.txt");
		feven = new FileOutputStream("even.txt");
		fodd = new FileOutputStream("odd.txt");
		do {
			//returns the ASCII value of the read byte in integer form
			i = fin.read();
			if(i != -1){
				j = (char)i;
				
				if( j % 2 == 0 )
					feven.write(i);
					
				else 
					fodd.write(i);
					
			}	

		} while(i != -1);
		fin.close();
	}
}