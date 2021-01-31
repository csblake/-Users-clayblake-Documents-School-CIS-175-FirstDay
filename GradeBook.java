//**************************************************************
//* Name        : Scores
//* Author      : Clayton Blake
//* Created     : 01/30/2021
//* Course      : CIS 175 Java 2
//* Version     : 1.0
//* OS          : MacOS Big Sur
//* Copyright   : This is my own original work based on
//*               specifications issued by our instructor
//* Description : This program overall description here
//*               Input:  list and describe
//*               Output: list and describe
//* Academic Honesty: I attest that this is my original work.
//* I have not used unauthorized source code, either modified or 
//* unmodified. I have not given other fellow student(s) access to
//* my program.         
//***************************************************************/
import java.util.ArrayList;

public class GradeBook {

	// instance variables
	public ArrayList<Integer> userScores = new ArrayList<Integer>();
	public String testName;
	
	// constructors
	public GradeBook() {
		// default constructor
	}
	
	public GradeBook(ArrayList<Integer> userScores, String testName) {
		// non-default constructor
		this.userScores = userScores;
		this.testName = testName;
	}

	// getters and setters
	public ArrayList<Integer> getUserScores() {
		return userScores;
	}

	public void setUserScores(ArrayList<Integer> userScores) {
		this.userScores = userScores;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}	
	
	// methods
	public void setLetterGrades() {
		System.out.print(getTestName() + " Test\nScore -------- Grade\n");
		
		// use for loop to return the scores with grades
		for (int counter = 0; counter < userScores.size(); counter++) {
			// declare the letter grade variable
			char letterGrade;
			
			// use if statement to determine the letter grade
			if(userScores.get(counter) < 60) {
				letterGrade = 'F';
			} else if(userScores.get(counter) < 70) {
				letterGrade = 'D';
			} else if(userScores.get(counter) < 80) {
				letterGrade = 'C';
			} else if(userScores.get(counter) < 90) {
				letterGrade = 'B';
			} else {
				letterGrade = 'A';
			}
			
			 System.out.println("   " + userScores.get(counter) + " -------- " + letterGrade);
		}
	}
}
