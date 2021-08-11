/*================================================================================================================================================
5.  Write a program has class Publisher, Book, Literature and Fiction. Read the information and print the details of books from either the category, using inheritance.
==================================================================================================================================================*/
import java.util.Scanner;
class Publisher
{
 	String pname;
 	Publisher(String publisher_name) //constructor
 	{
 		 pname=publisher_name;
	 }
}

class Book extends Publisher //child class of publisher
{  
	 int book_id,book_price;
 	String book_author;
 	Book(String publisher_name,String author,int id,int price) //constructor
	 {
 	 	super(publisher_name);	//referencing variable fro parent class
  		book_author=author;
  		book_id=id;
  		book_price=price;
 	}
}
class Literature extends Book //child class of book
{
 	String book_name,book_language;
 	Literature(String publisher_name,String author,int id,int price,String name,String lang) //constructor
	 {
  		super(publisher_name,author,id,price);
 		 book_name=name;
  		book_language=lang;
	 }
	 void display()		//method to display
	 {
		System.out.println("==============================");
		System.out.println("Literature book details Displaying");
		System.out.println("==============================");
		System.out.println("Book Name:	"+book_name);
		System.out.println("Author:		"+book_author);
		System.out.println("Publisher:	"+pname);
		System.out.println("Price:		"+book_price);
		System.out.println("Language:	"+book_language);
		System.out.println("book id:	"+book_id);
	 }
}
class Fiction extends Book  //child class of book
{
 	String book_name,book_type;
 	Fiction(String publisher_name,String author,int id,int price,String name,String type)  //constructor
 	{
 		 super(publisher_name,author,id,price);
  		book_name=name;
  		book_type=type;
 	}
	 void display()
 	{
		System.out.println("===========================");
  		System.out.println("Fiction book details Displaying");
		System.out.println("===========================");
  		System.out.println("Book Name:	"+book_name);
  		System.out.println("Author:		"+book_author);
  		System.out.println("Publisher:	"+pname);
  		System.out.println("Price:		"+book_price);
 		System.out.println("Fiction Type: 	"+book_type);
  		System.out.println("book id:	"+book_id);
 	}
}
class Books
{
 public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	String bname,bauthor,pname,btype,blang;
	int bprice,bid;
	
	System.out.println("=================================");
	System.out.println("Reading Literature book details");
	System.out.println("=================================");	
	System.out.println("Enter Book Name:");
	bname=s.nextLine();
	System.out.println("Enter Author name:");
	bauthor=s.nextLine();
	System.out.println("Enter publisher name:");
	pname=s.nextLine();
	System.out.println("Enter price:");
	bprice=Integer.parseInt(s.nextLine());
	System.out.println("Enter Language:");
	blang=s.nextLine();
	System.out.println("Enter book Id:");
 	bid=Integer.parseInt(s.nextLine());
	
	Literature l=new Literature(pname,bauthor,bid,bprice,bname,blang);  //creating object of literature class
	l.display();
 	
	System.out.println("=========================");
	System.out.println("Reading Fiction book details");	
	System.out.println("=========================");
	System.out.println("Enter Book Name:");
	bname=s.nextLine();
	System.out.println("Enter Author name:");
	bauthor=s.nextLine();
	System.out.println("Enter publisher name:");
	pname=s.nextLine();
	System.out.println("Enter price:");
	bprice=Integer.parseInt(s.nextLine());
	System.out.println("Enter Fiction type:");
	btype=s.nextLine();
	System.out.println("Enter book Id:");
	bid=Integer.parseInt(s.nextLine());
	Fiction f=new Fiction(pname,bauthor,bid,bprice,bname,btype); //creating object of Fiction class
	f.display();
}
}

/*================================================================================================================================================
output
==================================================================================================================================================
Microsoft Windows [Version 10.0.19041.1110]
(c) Microsoft Corporation. All rights reserved.

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 4

C:\Users\jinu\JAVA PROGRAMS\Experiment 4>javac Ex4Prblm4.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 4>java Books
=================================
Reading Literature book details
=================================
Enter Book Name:
AARACHAR
Enter Author name:
K.R MEERA
Enter publisher name:
DC BOOKS
Enter price:
340
Enter Language:
MALAYALAM
Enter book Id:
23
==============================
Literature book details Displaying
==============================
Book Name:      AARACHAR
Author:         K.R MEERA
Publisher:      DC BOOKS
Price:          340
Language:       MALAYALAM
book id:        23
=========================
Reading Fiction book details
=========================
Enter Book Name:
ALCHEMIST
Enter Author name:
PAULO COELHO
Enter publisher name:
HARPER TORCH
Enter price:
180
Enter Fiction type:
INSPIRATIONAL FICTION TYPE
Enter book Id:
27
===========================
Fiction book details Displaying
===========================
Book Name:      ALCHEMIST
Author:         PAULO COELHO
Publisher:      HARPER TORCH
Price:          180
Fiction Type:  INSPIRATIONAL FICTION TYPE
book id:        27


================================================================================================================================================*/     