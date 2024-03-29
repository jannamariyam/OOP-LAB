/*====================================================================================================================================
3. Producer/Consumer using Inter Thread Communication
======================================================================================================================================*/
class Q {
 int n;
 boolean valueSet = false;

 synchronized int get() {
  while(!valueSet)
   try {
    wait();
   } catch(InterruptedException e) {
     System.out.println("InterruptedException caught");
   }

   System.out.println("Got: " + n);
   valueSet = false;
   notify();
   return n;
}
 synchronized void put(int n) {
  while(valueSet)
   try {
    wait();
   } catch(InterruptedException e) {
     System.out.println("InterruptedException caught");
  }

  this.n = n;
  valueSet = true;
  System.out.println("Put: " + n);
  notify();
 }
}
class Producer implements Runnable {
 Q q;
 Thread t;

 Producer(Q q) {
  this.q = q;
  t = new Thread(this, "Producer");
 }

 public void run() {
  int i = 0;

  while(true) {
   q.put
   (i++);
  }
 }
}
class Consumer implements Runnable {
 Q q;
 Thread t;
 Consumer(Q q) {
  this.q = q;
  t = new Thread(this, "Consumer");
 }
 public void run() {
  while(true) {
   q.get();
  }
 }
}
class Ex7Prblm3 {
 public static void main(String args[]) {
	Q q = new Q();
	Producer p = new Producer(q);
	Consumer c = new Consumer(q);
	// Start the threads.
	p.t.start();
	c.t.start();
	System.out.println("Press Control-C to stop.");
}
}

/*======================================================================================================================================
output
=======================================================================================================================================

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 7

C:\Users\jinu\JAVA PROGRAMS\Experiment 7>javac Ex7Prblm3.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 7>java Ex7Prblm3
Press Control-C to stop.
Put: 0
Got: 0
Put: 1
Got: 1
Put: 2
Got: 2
Put: 3
Got: 3
Put: 4
Got: 4
Put: 5
Got: 5
Put: 6
Got: 6
Put: 7
Got: 7
Put: 8
Got: 8
Put: 9
Got: 9
Put: 10
Got: 10
Put: 11
Got: 11
Put: 12
Got: 12
Put: 13
Got: 13
^C
=====================================================================================================================================*/
