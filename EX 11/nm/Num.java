/*=====================================================================================================================================================
4. Write a program that reads from a file having integers. Copy even numbers and odd numbers to separate files.
=====================================================================================================================================================*/

import java.io.*;

class Num{
	public static void main(String[] args) throws IOException{
		int size;
		FileInputStream fin = new FileInputStream("number.txt");
		FileOutputStream feven = new FileOutputStream("even.txt");
		FileOutputStream fodd = new FileOutputStream("odd.txt");

		DataInputStream dfin = new DataInputStream(fin);

		
		while(fin.available() > 0){
			String s = dfin.readLine();
			int n = Integer.parseInt(s);
			byte[] b = s.concat("\n").getBytes();
			
			if(n % 2 == 0){
				feven.write(b);
			}
			else{
				fodd.write(b);
			}
		}
		dfin.close();
		feven.close();
		fodd.close();
	}
}