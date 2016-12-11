
public class CrossOverPointTest { //determines the user's crossover point
	
	public static double stockInvestAmt1;
	static double bondsInvestAmt1;
	static double otherInvestAmt1;
	static double otherInvestRate1;
	static double yearlyStockInvestAmt1;
	static double yearlyBondsInvestAmt1;
	static double yearlyOtherInvestAmt1;
	
	public static double years = 0;
	
	public static void crossoverQuestions(double stockInvestAmt, double bondsInvestAmt, double otherInvestAmt, double otherInvestRate, 
			double yearlyStockInvestAmt, double yearlyBondsInvestAmt, double yearlyOtherInvestAmt, double expenditures){ //gets scanner from main method, otherwise there is a NoSuchElement exception from System.in

		
		stockInvestAmt1 = stockInvestAmt; 
		bondsInvestAmt1 = bondsInvestAmt;
		otherInvestAmt1 = otherInvestAmt;
		otherInvestRate1 = otherInvestRate; 
		yearlyStockInvestAmt1 = yearlyStockInvestAmt; 
		yearlyBondsInvestAmt1 = yearlyBondsInvestAmt; 
		yearlyOtherInvestAmt1 = yearlyOtherInvestAmt; 
		double expenditures1 = expenditures;
		
		//Crossover point is when investment income = expenses
		System.out.println("For those who invest, there is something called a crossover point,"
				+ " which is when your passive income from investments equals \nyour expenditures."
				+ "For the purposes of this program we will calculate your crossover point "
				+ "because once you reach the crossover \npoint you are free to pursue life as you wish "
				+ "without needing to continue working. This is not to say that you cannot continue to \nwork "
				+ "if you so choose.");
		
		System.out.println("We will use a simple model to calculate the crossover point. This model "
				+ "will not be entirely precise, but since your \ncrossover point relies on what you do"
				+ " in the distant future it is impossible to predict precisely. This model will give "
				+ "you some \nidea of what will be required to reach your particular crossover point."
				+ " You may wish to reuse this model again in the future to \nsee if your crossover point"
				+ "changes based on different financial circumstances.");
		
		System.out.println("\nHow much money do you have invested in stocks (in USD)?");
		
		System.out.println("How much money do you have invested in bonds?");
		
		System.out.println("How much money do you have invested in other investments?");
		
		System.out.println("Since we cannot account for how you handle your other investments,"
				+ " you must decide yourself how much you expect to make from these. \nWhat is"
				+ " the average growth rate (%) you expect from these other investments each year?");
		
		System.out.println("How much will you add to stocks each year on average? (for simplicity "
				+ "we will only ask for the average rather than for each year)");
		System.out.println("How much will you add to bonds each year on average?");
		System.out.println("How much will you add to your other investments each year on average?");
		double passiveIncome = updateInvestments();
		
		System.out.println("We will assume 10% annual growth in stocks and 7% annual growth for bonds to make calculations.");
		
		System.out.println("What are your yearly expenditures?");
		
		System.out.println("We will assume fixed expenditures. In reality it is very hard for you to estimate your expenditures in the distant \nfuture."
				+ " You may wish to run this program again in the future to give you a more accurate prediction when your expenditures change.");
		
		
		//Recursion is used to calculate costs (compound interest uses recursion, adding fixed amount each month uses recursion, etc)
		double yearsUntilCrossover = calcCrossPoint(passiveIncome, expenditures1);
		
		System.out.println("\nThe model has predicted that it will take you " + yearsUntilCrossover + " years to reach your crossover point. ");
		System.out.println("You can alter this amount of time by doing several things: 1. Increase amount invested 2. Decrease your expenditures");
		System.out.println("Keep in mind that you will likely change the amount you invest, and your expenditures \nwill likely change in the future"
				+ " Therefore the years estimated will not be precise. Running this program in the \nfuture will help you increase precision based "
				+ "on your current circumstances.");
	}
	
	public static double calcCrossPoint(double passIncome, double expenditures){
			
		//System.out.println("Passive income " + passIncome + " years" + years);
		
		//base case for recursion
		if(passIncome >= expenditures)	//if passive income >= expenditures
			return years;
			//call function to increment investments (investment income will increase over time because of compound interest)
		double passiveIncome = updateInvestments();
		years++; //increments years by 1 with each recursive call
		return calcCrossPoint(passiveIncome, expenditures); //Does recursion, function calls itself again until base case reached
		
	}
	
	public static double updateInvestments(){ //calculates current passive income then increments the amount you have in investments from money that you add monthly and from growth
		
		//update stocks 10%
		double stockIncome = stockInvestAmt1 * .1; //investment amount * 10% annual growth income
		stockInvestAmt1 += stockIncome;
		stockInvestAmt1 += yearlyStockInvestAmt1;
		//update bonds 7%
		double bondsIncome = bondsInvestAmt1 * .07;
		bondsInvestAmt1 += bondsIncome;
		bondsInvestAmt1 += yearlyBondsInvestAmt1; 
		//update other investments (based on user's predicted growth
		double otherIncome = otherInvestAmt1 * (otherInvestRate1 / 100); //otherInvestRate is entered as XX.XX% so must divide by 100 to get into .XXXX format
		otherInvestAmt1 += otherIncome;
		otherInvestAmt1 += yearlyOtherInvestAmt1;
		//return new passive income
		double passiveIncome = stockIncome + bondsIncome + otherIncome;
		//System.out.println("stockInvestAmt " + stockInvestAmt + " bondsInvestAmt " + bondsInvestAmt + " otherInvestAmt " + otherInvestAmt);
		//System.out.println("stockIncome" + stockIncome + " bondsIncome " + bondsIncome + " otherIncome " + otherIncome + " passiveIncome " + passiveIncome);
		return passiveIncome;
	}
	
}
