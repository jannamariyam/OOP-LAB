/*=================================================================================
Qn. Read a matrix from the console and check whether it is symmetric or not.
=================================================================================*/
import java.util.Scanner;
class CheckSymmetric
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in); 
		int i,j,row,col,trans=1;
	System.out.println("Enter the number of rows:");
	row=sc.nextInt();
	System.out.println("Enter the number of columns:");
	col=sc.nextInt();

	int mat[][] = new  int[row][col];
	int transpose[][] = new int [col][row];
		
		System.out.println("Enter the elements of the matrix :");
		for(i=0 ; i<row ; i++)
		{
			for(j=0 ; j<col ; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		

		System.out.println("Your entered matrix is :");
		for(i=0 ; i<row ; i++)
		{
			for(j=0 ; j<col ; j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println("");
		}
	
	//to check transpose functionality of matrix
		for(i=0 ; i<row ; i++)
			{
				for(j=0 ; j<col ; j++)
				{
					transpose[j][i]=mat[i][j];

				}
			}
	
		if(row==col)
			{
				for(i=0 ; i<row ; i++)
				{
					for(j=0 ; j<col ; j++)
					{
						if(mat[i][j]!=transpose[i][j])
						{
							trans=0;
							break;
						}
					}
				if (trans==0)
				{
				
					System.out.println("The given matrix is not symmetric");
					break;
				}
				}
				
			if (trans==1)
				{
					System.out.println("The given matrix is symmetric");
				}	
				
			}
		else
		{
			System.out.println("Your entered matrix is not a square matrix,hence it won't be symmetric.");
		}
					
	}
}
		

/* OUT PUT
=================================================================
C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\experiment 2

C:\Users\jinu\JAVA PROGRAMS\experiment 2>javac Ex2Prblm3.java

C:\Users\jinu\JAVA PROGRAMS\experiment 2>java CheckSymmetric

Enter the number of rows:
2
Enter the number of columns:
3
Enter the elements of the matrix :
1
2
3
3
2
1
Your entered matrix is :
1       2       3
3       2       1
Your entered matrix is not a square matrix,hence it won't be symmetric.

C:\Users\jinu\JAVA PROGRAMS\experiment 2>java CheckSymmetric
Enter the number of rows:
2
Enter the number of columns:
2
Enter the elements of the matrix :
1
2
3
4
Your entered matrix is :
1       2
3       4
The given matrix is not symmetric

C:\Users\jinu\JAVA PROGRAMS\experiment 2>java CheckSymmetric
Enter the number of rows:
3
Enter the number of columns:
3
Enter the elements of the matrix :
1
2
3
2
5
6
3
6
2
Your entered matrix is :
1       2       3
2       5       6
3       6       2
The given matrix is symmetric

