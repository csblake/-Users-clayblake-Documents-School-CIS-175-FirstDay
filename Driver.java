//**************************************************************
//* Name        : Driver
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
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// import the scanner object and GradeBook object
		Scanner sc = new Scanner(System.in);
		GradeBook scores = new GradeBook();
		
		// declare needed variables
		ArrayList<Integer> userScores = new ArrayList<Integer>();
		String testName;
		int numOfTests;
		
		// ask the user for the information needed
		System.out.println("What is the name of the test? ");
		testName = sc.next();
		
		System.out.println("How many scores would you like to enter? ");
		numOfTests = sc.nextInt();
		
		for (int counter = 0; counter < numOfTests; counter++) {
			System.out.println("Enter a score: ");
			userScores.add(sc.nextInt());
		}
		
		// add the array list and the test name to the gradebook object
		scores.setTestName(testName);
		scores.setUserScores(userScores);
		
		// print the array list to show results
		scores.setLetterGrades();
		
	}
}
