/*
 * This is the test class for the program. Run this to run the program with automatically entered inputs. Everything other than the automatic inputs are the same as
 * the real program.
 */

public class Nguyen_MoneyHappinessRelationshipTest extends RealWageTest {

	public static void main(String[] args) {
		
		System.out.println("The purpose of this system is to provide an easy way to organize your financial and life goals. We will be helping you learn about  "
				+ "\n your relationship with money. This system is based on many of the principles in the book Your money or Your Life by Vicki Robinson, "
				+ "\nand also  incorporates several of my personal ideas.");
		
		double stockInvestAmt = 100, bondsInvestAmt = 100, otherInvestAmt = 100, otherInvestRate = 10, 
		yearlyStockInvestAmt = 20, yearlyBondsInvestAmt = 20, yearlyOtherInvestAmt = 20, expenditures = 4000;
		
		
		CrossOverPointTest.crossoverQuestions(stockInvestAmt, bondsInvestAmt, otherInvestAmt, otherInvestRate, 
				yearlyStockInvestAmt, yearlyBondsInvestAmt, yearlyOtherInvestAmt, expenditures);
		
		int rating1 = 4, rating2=4,rating3=5,rating4=5,rating5=6,rating6=7,rating7=6,rating8=7,rating9=1,rating10=1,rating11=3,rating12=3,
				rating13=5,rating14=5,rating15=5,rating16=6,rating17=6,rating18=6,rating19=6,rating20=6;
		
		PurposeTest.purposeQuestions(rating1, rating2, rating3, rating4, rating5, rating6, rating7, rating8, rating9, rating10,
				rating11, rating12, rating13, rating14, rating15, rating16, rating17, rating18, rating19, rating20);
		
		System.out.println("Lastly we will calculate your real hourly wage. Although you have a certain wage, you must take into account other \ncosts associated "
				+ "with your job to determine your real hourly wage.");
		System.out.println("Fill in the text fields in the panel that pops up and then click Save (since this is a test progrm your input will not actually affect anything)");
		
		double wage=400, workHours=40, h1=1, s1=1, h2=1, s2=1, h3=1, s3=1, h4=1, s4=1, h5=1, s5=1, h6=1, s6=1, h7=1, s7=1, h8=1, s8=1, h9=1, s9=1, h10=1, s10=1, 
				h11=1, s11=1, h12=1, s12=1, h13=1, s13=1, h14=1, s14=1, h15=1, s15=1, h16=1, s16=1, h17=1, s17=1, h18=1, s18=1, h19=1, s19=1, h20=1, s20=1;
		
		RealWageTest.instantiateVariables(wage, workHours, h1, s1, h2, s2, h3, s3, h4, s4, h5, s5, h6, s6, h7, s7, h8, s8, h9, s9, h10, s10, h11, s11, h12, s12, h13, s13, h14, s14, h15, s15, 
				 h16, s16, h17, s17, h18, s18, h19, s19, h20, s20);
		RealWageTest.main(args);
		
	}
}
