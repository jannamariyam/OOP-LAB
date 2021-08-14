/*====================================================================================================================================
1. Write a program to search an element in an array using
a.  linear search
b. simple binary search
c. recursive binary search
d. using Arrays .binarySearch ( )
======================================================================================================================================*/

import java.util.Scanner;
import java.util.Arrays;

class Searching{

	public static int Linear(int i,int search,int n,int arr[]){
		for(i=0;i<n;i++){
			if(arr[i]==search){
				break;}
		}
		return -1;
	}

	public static int simpleBinary(int arr[],int first,int last,int key){
		int mid=(first+last)/2;
		while(first<=last){
			if(arr[mid]<key)
				first=mid+1;
			else if(arr[mid]==key)
				return mid;
			else last=mid-1;
			mid=(first+last)/2;
		}
		return -1;
	}
	public static int recursiveBinary(int arr[],int first,int last,int key){
		if(last>=first){
			int mid=first+(last-first)/2;
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]>key){
				//searching left subarray
				return recursiveBinary(arr,first,mid-1,key);
				}	
			else{
				//searching right sub array
				 return recursiveBinary(arr,mid+1,last,key);
			}
		}
		return -1;
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int opt,n,search,found=-1;
		
		
			System.out.println("**************************");
			System.out.print("Enter number of elements : ");
			n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter "+n+" number of elements : ");
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			Arrays.sort(arr);
			System.out.println("Array in sorted order :");
			for(int a:arr)
				System.out.print(a+" ");
			System.out.println();
			System.out.println("Enter the value to be searched : ");
			search=sc.nextInt();
			
			System.out.println("\n**************************");
			System.out.println("1.Linear Search");
			System.out.println("2.Simple Binary Search");
			System.out.println("3.Recursive Binary Search");
			System.out.println("4.Using Arrays.binarySearch()");
			System.out.println("5.Exit");
			System.out.println("\n**************************");
			
			System.out.print("Enter your choice : ");
			opt=sc.nextInt();
			
		
			switch(opt){
				case 1:found=Linear(0,search,n,arr);
				case 2: found=simpleBinary(arr,0,n,search);
			        	break;
				case 3: found=recursiveBinary(arr,0,n,search);
			        	break;
				case 4: found=Arrays.binarySearch(arr,search);
					break;
				case 5: System.exit(0);
					break;
				default:System.out.println("Invalid option");
					System.out.println("You can't search an element in array with out choosing any searching method.");
					 System.exit(0);
					break;
			}
			
                      	  	if(found>=0) System.out.println("Element found at index : "+found);
			else System.out.println("Element not found");
			
		
	}
}

/* =======================================================================================================================================================
OUTPUT  1
=========================================================================================================================================================
Microsoft Windows [Version 10.0.19041.1052]
(c) Microsoft Corporation. All rights reserved.

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 3

C:\Users\jinu\JAVA PROGRAMS\Experiment 3>javac Ex3Prblm1.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 3>java Searching
**************************
Enter number of elements : 4
Enter 4 number of elements :
1
9
7
0
Array in sorted order :
0 1 7 9
Enter the value to be searched :
7

**************************
1.Linear Search
2.Simple Binary Search
3.Recursive Binary Search
4.Using Arrays.binarySearch()
5.Exit

**************************
Enter your choice : 3
Element found at index : 2


=======================================================================================================================================================
OUTPUT  2
=========================================================================================================================================================
C:\Users\jinu\JAVA PROGRAMS\Experiment 3>java Searching
**************************
Enter number of elements : 4
Enter 4 number of elements :
1
2

6
5
Array in sorted order :
1 2 5 6
Enter the value to be searched :
3

**************************
1.Linear Search
2.Simple Binary Search
3.Recursive Binary Search
4.Using Arrays.binarySearch()
5.Exit

**************************
Enter your choice : 3
Element not found

=======================================================================================================================================================
OUTPUT  3
=========================================================================================================================================================
C:\Users\jinu\JAVA PROGRAMS\Experiment 3>java Searching
**************************
Enter number of elements : 4
Enter 4 number of elements :
5
3
2
9
Array in sorted order :
2 3 5 9
Enter the value to be searched :
5

**************************
1.Linear Search
2.Simple Binary Search
3.Recursive Binary Search
4.Using Arrays.binarySearch()
5.Exit

**************************
Enter your choice : 1
Element found at index : 2

=======================================================================================================================================================
OUTPUT  4
=========================================================================================================================================================
C:\Users\jinu\JAVA PROGRAMS\Experiment 3>java Searching
**************************
Enter number of elements : 4
Enter 4 number of elements :
1
6
3
8
Array in sorted order :
1 3 6 8
Enter the value to be searched :
2

**************************
1.Linear Search
2.Simple Binary Search
3.Recursive Binary Search
4.Using Arrays.binarySearch()
5.Exit

**************************
Enter your choice : 1
Element not found

=======================================================================================================================================================
OUTPUT  5
=========================================================================================================================================================
C:\Users\jinu\JAVA PROGRAMS\Experiment 3>java Searching
**************************
Enter number of elements : 4
Enter 4 number of elements :
9
8
5
3
Array in sorted order :
3 5 8 9
Enter the value to be searched :
9

**************************
1.Linear Search
2.Simple Binary Search
3.Recursive Binary Search
4.Using Arrays.binarySearch()
5.Exit

**************************
Enter your choice : 2
Element found at index : 3

=======================================================================================================================================================
OUTPUT  6
=========================================================================================================================================================
C:\Users\jinu\JAVA PROGRAMS\Experiment 3>java Searching
**************************
Enter number of elements : 4
Enter 4 number of elements :
3
7
5
6
Array in sorted order :
3 5 6 7
Enter the value to be searched :
1

**************************
1.Linear Search
2.Simple Binary Search
3.Recursive Binary Search
4.Using Arrays.binarySearch()
5.Exit

**************************
Enter your choice : 2
Element not found

=======================================================================================================================================================
OUTPUT  7
=========================================================================================================================================================

C:\Users\jinu\JAVA PROGRAMS\Experiment 3>java Searching
**************************
Enter number of elements : 4
Enter 4 number of elements :
2
6
3
4
Array in sorted order :
2 3 4 6
Enter the value to be searched :
3

**************************
1.Linear Search
2.Simple Binary Search
3.Recursive Binary Search
4.Using Arrays.binarySearch()
5.Exit

**************************
Enter your choice : 4
Element found at index : 1

=======================================================================================================================================================
OUTPUT  8
=========================================================================================================================================================

C:\Users\jinu\JAVA PROGRAMS\Experiment 3>java Searching
**************************
Enter number of elements : 4
Enter 4 number of elements :
0
9
5
6
Array in sorted order :
0 5 6 9
Enter the value to be searched :
1

**************************
1.Linear Search
2.Simple Binary Search
3.Recursive Binary Search
4.Using Arrays.binarySearch()
5.Exit

**************************
Enter your choice : 4
Element not found

=======================================================================================================================================================
OUTPUT  9
=========================================================================================================================================================

C:\Users\jinu\JAVA PROGRAMS\Experiment 3>java Searching
**************************
Enter number of elements : 4
Enter 4 number of elements :
1
8
9
0
Array in sorted order :
0 1 8 9
Enter the value to be searched :
0

**************************
1.Linear Search
2.Simple Binary Search
3.Recursive Binary Search
4.Using Arrays.binarySearch()
5.Exit

**************************
Enter your choice : 5

=======================================================================================================================================================
OUTPUT  10
=========================================================================================================================================================
C:\Users\jinu\JAVA PROGRAMS\Experiment 3>java Searching
**************************
Enter number of elements : 4
Enter 4 number of elements :
1
5
0
4
Array in sorted order :
0 1 4 5
Enter the value to be searched :
1

**************************
1.Linear Search
2.Simple Binary Search
3.Recursive Binary Search
4.Using Arrays.binarySearch()
5.Exit

**************************
Enter your choice : 6
Invalid option
You can't search an element in array with out choosing any searching method.


====================================================================================================================================================*/