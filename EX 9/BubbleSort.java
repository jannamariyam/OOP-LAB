/*==================================================================================================================================================
4. Using generic method perform Bubble sort.
====================================================================================================================================================*/

import java.util.*;
import java.util.Arrays;

class BubbleSort{
	public static <T> T[] BSMethod(T[] arr,int n){
		String s1,s2;
		for (int i = 0; i < n-1; i++)   //sorting using bubble sort
        		for (int j = 0; j < n-i-1; j++){
				s1 = arr[j].toString();
				s2 = arr[j+1].toString();
               			if (s1.compareTo(s2)>0)
                		{
                    			// swap arr[j+1] and arr[j]
                    			T temp = arr[j];
                    			arr[j] = arr[j+1];
                    			arr[j+1] = temp;
                		}
			}
		return arr;
	}
}

class Main{
	public static void main(String args[]){
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		
		String[] s = new String[n];

		System.out.println("Enter "+n+" strings : ");
		for(int i = 0 ; i < n ; i++)
			s[i] = sc.next();

		BubbleSort b = new BubbleSort();

		s = b.<String>BSMethod(s,n);
		
		System.out.println("After Sorting :");

		for(int i = 0 ; i < n ; i++)
			System.out.println(s[i]);
		Integer[] a = new Integer[n];

		System.out.println("Enter "+n+" integers with same number of digits : ");
		for(int i = 0 ; i < n ; i++)
			a[i] = sc.nextInt();


		a = b.<Integer>BSMethod(a,n);

		System.out.println("After Sorting :");
		for(int i = 0 ; i <n  ; i++)
			System.out.println(a[i]);
		
	}
}
/*==================================================================================================================================================
OUTPUT
====================================================================================================================================================
C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 9

C:\Users\jinu\JAVA PROGRAMS\Experiment 9>javac BubbleSort.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 9>java Main
Enter the number of elements : 4
Enter 4 strings :
w
q
a
z
After Sorting :
a
q
w
z
Enter 4 integers with same number of digits :
34
78
45
12
After Sorting :
12
34
45
78

C:\Users\jinu\JAVA PROGRAMS\Experiment 9>java Main
Enter the number of elements : 4
Enter 4 strings :
r
t
q
e
After Sorting :
e
q
r
t
Enter 4 integers with same number of digits :
9
3
6
1
After Sorting :
1
3
6
9

=====================================================================================================================================================*/