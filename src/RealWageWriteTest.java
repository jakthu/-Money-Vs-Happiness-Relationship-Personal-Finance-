import java.util.Formatter;

public class RealWageWriteTest  { //this is the test program version of RealWageWrite
	
		public static void writeToFile(double realWage){ 
			
			final Formatter x;
			
			try{ //Writes the real wage to a file
				x = new Formatter("YourData.txt");
				System.out.println("\nFile YourData.txt created. You have completed the program.");
				x.format("%s%.2f", "Your real hourly wage is $", realWage);
				x.close();
			} catch(Exception e){
				System.out.println("Error creating file");
			}
			
			
		}
	
}









