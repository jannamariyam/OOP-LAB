/*===================================================================================================================================================
Qn. Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)and static nested class
RAM (memory, manufacturer). Create an object of CPU and print information of Processor and RAM.
================================================================================================================================================== */
class Cpu{
	double price=4500;
	class Processor{
		int core=4;
		String manufacturer="Intel Corporation";
		void display(){
			System.out.println("Core    :    "+core);
			System.out.println("Manufacturer   :   "+manufacturer);
			System.out.println("Price    :   "+price);
		}
	}
	void display_Inner() {
      		Processor p = new Processor();
      		p.display();
   	}

	static class NestedRAM{
		String memory="16 Gb";
		String manufacturer="Intel";
		void display(){
			System.out.println("Memory    :   "+memory);
			System.out.println("Manufacturer    :   "+manufacturer);
	
		}
	}

	public static void main(String args[]){
		Cpu c=new Cpu();
		c.display_Inner();
		Cpu.NestedRAM n=new Cpu.NestedRAM();
		n.display();
	}
}
/*
Output:
================================================================================================================
C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\experiment 2

C:\Users\jinu\JAVA PROGRAMS\experiment 2>javac Exp2Prblm5.java

C:\Users\jinu\JAVA PROGRAMS\experiment 2>java Cpu
Core    :    4
Manufacturer   :   Intel Corporation
Price    :   4500.0
Memory    :   16 Gb
Manufacturer    :   Intel

================================================================================================================*/