/*==================================================================================================================================================
2.Program to remove all the elements fromm a linked list.
====================================================================================================================================================

import java.util.*;

class LnkdLst
{
  public static void main(String args[])
  {
     LinkedList<String>llist=new LinkedList<String>();                         //created a linked list
     
      llist.add("Y");
      llist.add("H");
      llist.add("O");
      llist.add("M");
      llist.addLast("E");
      llist.addFirst("M");

      System.out.println("Contents in linked list: "+llist);                  //printing elements
      
      llist.removeLast();
      System.out.println("\nAfter removing last element:"+llist);
      llist.removeFirst();
      System.out.println("\nAfter removing first element:"+llist);
      llist.clear();
      System.out.println("\nContents after clearing all elements:"+llist);

  }
}

/*==================================================================================================================================================
    OUTPUT
  ===================================================================================================================================================

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 8

C:\Users\jinu\JAVA PROGRAMS\Experiment 8>javac LnkdLst.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 8>java LnkdLst
Contents in linked list: [M, Y, H, O, M, E]

After removing last element:[M, Y, H, O, M]

After removing first element:[Y, H, O, M]

Contents after clearing all elements:[]

===================================================================================================================================================*/