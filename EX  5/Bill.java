/*===================================================================================================================================================
2. Prepare bill with the given format using calculate method from interface.
=====================================================================================================================================================*/

import java.util.*;									//import java.util for date
interface BillGen{									//interface BillGen have only one method calculate 
	int calculate();
	
}
class ProductB implements BillGen{							//class ProductB implements BillGen
	String name;
	int prodid ,quantity,unitprice,total;
	ProductB(){}
	ProductB(String n,int p,int q,int u ){						//make constructure for class
		name = n;
		prodid = p;
		quantity = q;
		unitprice = u;
	}
	public int calculate(){								//method for calculate amount of each and net amount
		total = quantity * unitprice;
		return total;
	}
}

public class Bill{									//main
	public static void main(String[] args){
		ProductB [] [] order;
		System.out.print("\n***********************\n");
		System.out.println("Enter no of orders :");				//for entering order(no of bill)
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		order = new ProductB[n][];						//create a 2D array order object for class ProductB
		for (int i = 0;  i < n; i++){						//loop works n tims(order)
			System.out.print("\n=============================\n");
			System.out.println("Enter no of products :");
			int m = sc.nextInt();
			order[i] =new ProductB[m];                                      
			for(int j = 0; j < m; j++){ 					//loop works m times(no of product)            
				System.out.print("\n\nENTER PRODUCT  "+(j+1)+" DETAILS");	//for entering the details
				System.out.println("\n**************************\n");
				System.out.print("Name :");
				String a = sc.next();
				System.out.print("Enter product id:");
				int b = sc.nextInt();
				System.out.print("Enter product quantity:");
				int c = sc.nextInt();
				System.out.print("Enter product unit price:");
				int d = sc.nextInt();
				ProductB pb = new ProductB(a,b,c,d);			//create pb object for class and pass the values
				order [i][j] = pb;					//set pb as 2D arrays elements
				order [i][j].total = order[i][j].calculate();		//call calculate method for cell
			}
	}
	for(int i = 0; i < n; i++){
		int sum = 0;
		System.out.println("\n\nOrder no:"+(i+1));
		Date date = java.util.Calendar.getInstance().getTime();
		System.out.println(date);
		System.out.println
		("_______________________________________________________________________________________________________________________");
		System.out.printf("%5s %20s %25s %20s %10s ","prodId","name","Quantity","unit price","total");					//for bill headings
		System.out.println();
		System.out.println
		("_______________________________________________________________________________________________________________________"); 	//for printing details
		for(int j=0;j<order[i].length;j++){
			System.out.printf("%5s %20s %25s %20s %10s",order[i][j].prodid,order[i][j].name,order[i][j].quantity,order[i][j].unitprice,order[i][j].total);
			System.out.println();
		}
		System.out.println
		("_______________________________________________________________________________________________________________________");
		for(int k=0;k<order[i].length;k++)												//for find net mount
			sum=sum+order[i][k].total;
		System.out.println("net amount:"+sum);
		System.out.println
		("_______________________________________________________________________________________________________________________");
		}
	}
}
		
/*===================================================================================================================================================
out put
=====================================================================================================================================================
Microsoft Windows [Version 10.0.19043.1165]
(c) Microsoft Corporation. All rights reserved.

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 5

C:\Users\jinu\JAVA PROGRAMS\Experiment 5>javac Bill.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 5>java Bill

***********************
Enter no of orders :
2

=============================
Enter no of products :
3


ENTER PRODUCT  1 DETAILS
**************************

Name :PEN
Enter product id:134
Enter product quantity:4
Enter product unit price:10


ENTER PRODUCT  2 DETAILS
**************************

Name :BOOK
Enter product id:156
Enter product quantity:4
Enter product unit price:40


ENTER PRODUCT  3 DETAILS
**************************

Name :PENCIL
Enter product id:190
Enter product quantity:3
Enter product unit price:4

=============================
Enter no of products :
2


ENTER PRODUCT  1 DETAILS
**************************

Name :SOFA
Enter product id:1803
Enter product quantity:1
Enter product unit price:26000


ENTER PRODUCT  2 DETAILS
**************************

Name :BED
Enter product id:1345
Enter product quantity:1
Enter product unit price:14000


Order no:1
Sun Aug 15 13:12:26 IST 2021
_______________________________________________________________________________________________________________________
prodId                 name                  Quantity           unit price      total
_______________________________________________________________________________________________________________________
  134                  PEN                         4                   10         40
  156                 BOOK                         4                   40        160
  190               PENCIL                         3                    4         12
_______________________________________________________________________________________________________________________
net amount:212
_______________________________________________________________________________________________________________________


Order no:2
Sun Aug 15 13:12:26 IST 2021
_______________________________________________________________________________________________________________________
prodId                 name                  Quantity           unit price      total
_______________________________________________________________________________________________________________________
 1803                 SOFA                         1                26000      26000
 1345                  BED                         1                14000      14000
_______________________________________________________________________________________________________________________
net amount:40000
_______________________________________________________________________________________________________________________


==================================================================================================================================================*/

