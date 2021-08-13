/*==================================================================================================================================================
3. Create interfaces Student and Sports. Create a class Result implements Student and Sports. Display the academic and sports score of a student.
===================================================================================================================================================*/
interface student     //interface
{
	int score=10;
	void displayScore();
}
interface sports	//interface
{
	int score=25;
	void displaySportsScore();
}
class Result implements student,sports	//class implementing two interfaces
{
 	public void displayScore()
 	{
		System.out.println("Academic score is:"+student.score);
 	}
 	public void displaySportsScore()
 	{
  		System.out.println("Sports score is:"+sports.score);
	}
}
class SportsStudentResult
{
	public static void main(String[] args){
		Result r=new Result();		//creating object of class result
  		r.displayScore();
		r.displaySportsScore();
	}
}

/*===================================================================================================================================================
OUTPUT
====================================================================================================================================================

C:\Users\jinu>cd C:\Users\jinu\JAVA PROGRAMS\Experiment 5

C:\Users\jinu\JAVA PROGRAMS\Experiment 5>javac Ex5Prblm3.java

C:\Users\jinu\JAVA PROGRAMS\Experiment 5>java SportsStudentResult
Academic score is:10
Sports score is:25
===================================================================================================================================================*/
//Verified
