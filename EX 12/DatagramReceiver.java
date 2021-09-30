import java.net.*;
public class DatagramReceiver{
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(3000);
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, 1024);
		ds.receive(dp);
		String str = new String(dp.getData(), 0, dp.getLength());
		System.out.println(str);
		ds.close();
	}
}
/*
Output:

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 12

C:\Users\jinu\JAVA PROGRAMS\Experiment 12>javac DatagramReceiver.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 12>java DatagramReceiver

Good morning
*/