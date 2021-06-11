/*==================================================================================================================================================
 Qn.Write a menu driven program that would choose either in-built method or call a user defined method to sort an
 array of strings.
==================================================================================================================================================*/
import java.util.Arrays;
import java.util.Scanner;
class Sort{
	public static void main(String[] args){
		int n,i,j;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number of strings you want to store :");

		//reading the number of elements in array
		n=sc.nextInt();

		//creates an array in memory of length n+1
		String[] array = new String[n];	
		System.out.println("Enter the strings of the array :");
		for(i=0;i<n;i++){      
			//reading array elements from user	
			array[i]=sc.next();
			}
		System.out.println("\nYour entered strings are");
		System.out.println("************************");
		//accessing array elements using for loop
		for( i=0;i<n;i++){
			System.out.println(array[i]);
			}
		System.out.println("\nsorting methods");
		System.out.println("**************************");
		System.out.println("1.in-built Method");
		System.out.println("2.User defined Method");
		System.out.println("Enter Your choice :");
			int ch=sc.nextInt();

			if(ch==1){
				Arrays.sort(array) ;//in-built method
			}
			else if(ch==2){
				for(i=0;i<n;i++)
				{
					for( j=i+1;j<array.length;j++)
					{
					if (array[i].compareTo(array[j])>0){   //swap elements if not in order
						String temp= array[i];
						array[i] = array[j];
						array[j]=temp;
						}
					}
				}
				
			}
			else{
				System.out.print("Invalid input");
			}
		if(ch==1 || ch==2){	
		System.out.print("Your sorted Array is :");
				for( i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
			}
		else{
			System.out.println("\n You can't sort strings with out selecting a sorting method");
		}
			
	}
}


/*=================================================================================================================================================
 OUTPUT   1
====================================================================================================================================================

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 3

C:\Users\jinu\JAVA PROGRAMS\Experiment 3>javac Ex3Prblm3.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 3>java Sort
Enter number of strings you want to store :4
Enter the strings of the array :
I
LOVE
MY
DAD

Your entered strings are
************************
I
LOVE
MY
DAD

sorting methods
**************************
1.in-built Method
2.User defined Method
Enter Your choice :
1
Your sorted Array is :DAD I LOVE MY

=================================================================================================================================================
 OUTPUT   2
====================================================================================================================================================
C:\Users\jinu\JAVA PROGRAMS\Experiment 3>java Sort
Enter number of strings you want to store :4
Enter the strings of the array :
I
LOVE
MY
DAD

Your entered strings are
************************
I
LOVE
MY
DAD

sorting methods
**************************
1.in-built Method
2.User defined Method
Enter Your choice :
2
Your sorted Array is :DAD I LOVE MY

=================================================================================================================================================
 OUTPUT   3
====================================================================================================================================================
C:\Users\jinu\JAVA PROGRAMS\Experiment 3>java Sort
Enter number of strings you want to store :4
Enter the strings of the array :
I
LOVE
MY
DAD

Your entered strings are
************************
I
LOVE
MY
DAD

sorting methods
**************************
1.in-built Method
2.User defined Method
Enter Your choice :
3
Invalid input
 You can't sort strings with out selecting a sorting method

==========================================================================================================================================*/

