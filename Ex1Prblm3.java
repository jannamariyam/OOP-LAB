import  java.util.Scanner;
public class Ex1Prblm3 {


	public static void main(String[] strings) {

		Scanner input = new  Scanner(System.in);

		int number_Of_DaysInMonth =  0;
		String MonthOfName = "Unknown";

		System.out.print("Input a month Number: ");
		int month = input.nextInt();

		System.out.print("Input a year: ");
		int year = input.nextInt();

		switch (month) {
			case 1:
				MonthOfName = "January";
				number_Of_DaysInMonth =  31;
				break;
			case 2:
				MonthOfName =  "February";
				if ( (year % 400 == 0) || ( (year % 4 == 0)  &&  (year % 100 != 0))) {
					number_Of_DaysInMonth = 29;
				} else {
					number_Of_DaysInMonth = 28;
				}
				break;
			case 3:
				MonthOfName = "March";
				number_Of_DaysInMonth = 31;
				break;
			case 4:
				MonthOfName = "April";
				number_Of_DaysInMonth = 30;
				break;
			case 5:
				MonthOfName = "May";
				number_Of_DaysInMonth = 31;
				break;
			case 6:
				MonthOfName = "June";
				number_Of_DaysInMonth = 30;
				break;
			case 7:
				MonthOfName = "July";
				number_Of_DaysInMonth = 31;
				break;
			case 8:
				MonthOfName = "August";
				number_Of_DaysInMonth = 31;
				break;
			case 9:
				MonthOfName = "September";
				number_Of_DaysInMonth = 30;
				break;
			case 10:
				MonthOfName = "October";
				number_Of_DaysInMonth = 31;
				break;
			case 11:
				MonthOfName = "November";
				number_Of_DaysInMonth = 30;
				break;
			case 12:
				MonthOfName = "December";
				number_Of_DaysInMonth = 31;
	}
	System.out.print(MonthOfName + "  " + year + " has " + number_Of_DaysInMonth + " days\n" );
          }
}


/*

OUTPUT

Microsoft Windows [Version 10.0.19041.928]
(c) Microsoft Corporation. All rights reserved.

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS

C:\Users\jinu\JAVA PROGRAMS>javac Ex1Prblm3.java

C:\Users\jinu\JAVA PROGRAMS>java Ex1Prblm3
Input a month Number: 1
Input a year: 2021
January  2021 has 31 days

C:\Users\jinu\JAVA PROGRAMS>javac Ex1Prblm3.java

C:\Users\jinu\JAVA PROGRAMS>java Ex1Prblm3
Input a month Number: 2
Input a year: 2016
February  2016 has 29 days

C:\Users\jinu\JAVA PROGRAMS>javac Ex1Prblm3.java

C:\Users\jinu\JAVA PROGRAMS>java Ex1Prblm3
Input a month Number: 2
Input a year: 2017
February  2017 has 28 days

C:\Users\jinu\JAVA PROGRAMS>javac Ex1Prblm3.java

C:\Users\jinu\JAVA PROGRAMS>java Ex1Prblm3
Input a month Number: 12
Input a year: 2020
December  2020 has 31 days

*/
 