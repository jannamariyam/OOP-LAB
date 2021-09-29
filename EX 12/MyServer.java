import java.io.*;
import java.net.*;
public class MyServer {

	public static void main(String[] args){
		try{

			ServerSocket ss=new ServerSocket(6666);
			Socket s=ss.accept();//establishes connection
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String str=(String)dis.readUTF();
			System.out.println("message= "+str);
			ss.close();

		}catch(Exception e){System.out.println(e);}
	}

}
/*=============================================================================================================================================
OUTPUT
===============================================================================================================================================
C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 12

C:\Users\jinu\JAVA PROGRAMS\Experiment 12>javac MyServer.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 12>java MyServer
message= NICE TO MEET YOU
=================================================================================================================================================*/