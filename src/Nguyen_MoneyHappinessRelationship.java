/* IDE: Eclipse
 * Andrew Nguyen
 * CS2336.005
 * Semester: Fall 2016
 * Term Project
 * This program helps the user learn more about his/her relationship with money. The contents are thoroughly explained within the program when it is run.
 * 
 */

import java.util.Scanner;

public class Nguyen_MoneyHappinessRelationship extends RealWage {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("The purpose of this system is to provide an easy way to organize your financial and life goals. We will be helping you learn about  "
				+ "\n your relationship with money. This system is based on many of the principles in the book Your money or Your Life by Vicki Robinson, "
				+ "\nand also  incorporates several of my personal ideas.");
		
		CrossOverPoint.crossoverQuestions(keyboard);
		
		Purpose.purposeQuestions(keyboard);
		
		System.out.println("Lastly we will calculate your real hourly wage. Although you have a certain wage, you must take into account other \ncosts associated "
				+ "with your job to determine your real hourly wage.");
		System.out.println("Fill in the text fields in the panel that pops up and then click Save");
		
		RealWage.main(args);
		
		
		keyboard.close();
		
		
		
		
	}
}
