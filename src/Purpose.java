import java.util.Scanner;

public class Purpose { //determines the user's purpose rating
	
	private static double totalPurpose=0;
	public static void purposeQuestions(Scanner keyboard){ //gets scanner from main method, otherwise there is a NoSuchElement exception from System.in
		
		System.out.println("\nRate these on a scale of 1-7, with 4 being neutral:");
		System.out.println("I am usually: (1=completely bored; 7=exuberant, enthusiastic)");
		double rating = keyboard.nextInt();
		totalPurpose += rating;	//adds each answer to the totalPurpose	
		System.out.println("Life to me seems: (1=completely routine; 7=always exciting)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		System.out.println("In life I have: (1=no goals or aims at all; 7=very clear goals and aims)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		System.out.println("My personal existence is: (1=utterly meaningless, without purpose; 7=exuberant, enthusiastic)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		System.out.println("Every day is: (1= exactly the same; 7= constantly new)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		System.out.println("If I could choose, I would: (1= prefer never to have been born; 7= like nine more lives just like this one)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		System.out.println("After retiring, I would: (1= loaf completely the rest of my life; 7= do some of the exciting things I have always wanted to do)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		System.out.println("In achieving life goals I have: (1= made no progress whatever; 7= progressed to complete fullfillment)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		System.out.println("My life is: (1= empty, filled only with despair; 7= running over with exciting good things)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		System.out.println("If I should die today, I would feel that my life has been: (1= completely worthless; 7= very worthwhile)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		System.out.println("In thinking of my life, I: (1= often wonder why I exist; 7= always see a reason for my being here)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		System.out.println("As I view the world in relation to my life, the world: (1= completely confuses me; 7= fits meaningfully with my life)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		System.out.println("I am a: (1= very irresponsible person; 7= very responsible person)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		System.out.println("Concerning man's freedom to make his own choices, I believe man is: (1= completely bound by limitations of heredity and environment; 7= absolutely free to make all life choices)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		System.out.println("With regard to death, I am: (1= unprepared and frightened; 7= prepared and unafraid)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		System.out.println("With regard to suicide, I have: (1= thought of it seriously as a way out; 7= never given it a second thought)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		System.out.println("I regard my ability to find meaning, purpose or mission in life as: (1= practically none; 7= very great)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		System.out.println("My life is: (1= out of my hands and controlled by external factors; 7= in my hands and I am in control of it)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		System.out.println("Facing my daily tasks is: (1= a painful and boring experience; 7= a source of pleasure and satisfaction)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		System.out.println("I have discovered: (1= no mission or purpose in life; 7= clear-cut goals and a satisfying life purpose)");
		rating = keyboard.nextInt();
		totalPurpose += rating;	
		
		double avgPurpose = calcAvgPurpose();
		System.out.println("Your average purpose rating is " + avgPurpose);
		System.out.println("Your average purpose should give you a general overview of how satisfied you are with your current situation in life."
				+ " An average \nof 4 would mean that you are moderately content, while a 1 would mean that you are extremely \nuncontent and a 7 would mean"
				+ " that you are extremely content.");
		System.out.println("Hopefully the contents of this program will give you insight into how to improve your situation in regards to finance and the \nmentality you have towards it.");
	}

	public static double calcAvgPurpose(){
		double avgRating = totalPurpose / 20; //there were 20 different questions
		return avgRating;
	}
}

