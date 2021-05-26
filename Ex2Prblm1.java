/*====================================================================================
Qn.Define a class ‘product’ with data members pcode, pname and price. Create 3
objects of the class and find the product having the lowest price.
======================================================================================*/

import java.util.Scanner;
class Product{
	int pcode;
	String pname;
	float price;
	Product(int pc,String pn,float pr){                                    //constructor
		pcode=pc;
		pname=pn;
		price=pr;
	}
	void display(){ 		                                       // method to display
		System.out.println("pcode:"+pcode);
		System.out.println("pname:"+pname);
		System.out.println("price:"+price);
	}
}
class Products{
public static void main(String args[]){
 	Scanner in=new Scanner(System.in);
	int code;
	String name;
	float price;
	Product p1=new Product(3012,"Bed",7000);            //creating object
	code=3013;
	name="chair";
	price=920;
	Product p2=new Product(code,name,price);            //creating object
	System.out.println("Enter product code:");              //getting input from user;
	code=in.nextInt();
	System.out.println("Enter product name:");
	name=in.next();
	System.out.println("Enter product price:");
	price=in.nextFloat();
	Product p3=new Product(code,name,price);           //creating object		
 	System.out.println("\n\n==========First product  p1==========");
 	p1.display();
 	System.out.println("\n\n==========Second product p2==========");
 	p2.display();
 	System.out.println("\n\n==========Third product  p3=========="); 
 	p3.display();
	System.out.println("\n\n=========Displaying product with lowest price=========");    //comparing prices
	if(p1.price<p2.price&p2.price<p3.price)
		p1.display();
	else if(p2.price<p1.price&p1.price<p3.price)
		p2.display();
	else
		p3.display();

}
}

/* OUT PUT
=============================================================
C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\experiment 2

C:\Users\jinu\JAVA PROGRAMS\experiment 2>javac Ex2Prblm1.java

C:\Users\jinu\JAVA PROGRAMS\experiment 2>java Products
Enter product code:
3015
Enter product name:
Sofa
Enter product price:
18000


==========First product  p1==========
pcode:3012
pname:Bed
price:7000.0


==========Second product p2==========
pcode:3013
pname:chair
price:920.0


==========Third product  p3==========
pcode:3015
pname:Sofa
price:18000.0


=========Displaying product with lowest price=========
pcode:3013
pname:chair
price:920.0



C:\Users\jinu\JAVA PROGRAMS\experiment 2>java Products
Enter product code:
3011
Enter product name:
Plate
Enter product price:
45


==========First product  p1==========
pcode:3012
pname:Bed
price:7000.0


==========Second product p2==========
pcode:3013
pname:chair
price:920.0


==========Third product  p3==========
pcode:3011
pname:Plate
price:45.0


=========Displaying product with lowest price=========
pcode:3011
pname:Plate
price:45.0


