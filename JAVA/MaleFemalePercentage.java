/*
    Artes, Francesca Q.
    BSCpE 1-1
    
    This program calculates the Percentage of Male and Female students in a class

	JAVA
*/

import java.util.Scanner;

public class MaleFemalePercentage
{
	public static void main(String[] args) 
	{
	    try (Scanner in = new Scanner(System.in)) {
			int female, male, classTotal;
			double malePercentage, femalePercentage, percentage = 100;
			
			System.out.print("Enter the number of male students in your class: ");
			    male = in.nextInt();
			
			System.out.print("Enter the number of female students in your class: ");
			    female = in.nextInt();
			
			classTotal = male + female;
			
			malePercentage = male * percentage / classTotal;
			femalePercentage = female * percentage / classTotal;

			System.out.println("There are " + classTotal + " students in your class. "
			                    + malePercentage + "% are male and " + femalePercentage + "% are female.");
		}
	}
}