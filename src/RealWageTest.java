import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class RealWageTest extends RealWageWriteTest { //This is the test program version of RealWage. You do not need to enter anything into the text fields of the GUI panel that pops up

	private double hoursTotal;
	private double spentTotal;
	public static double realWage;
	
	static double wage; 
	static double workHours; 
	static double h1; 
	static double s1; 
	static double h2; 
	static double s2; 
	static double h3; 
	static double s3;
	static double h4; 
	static double s4;
	static double h5; 
	static double s5;
	static double h6; 
	static double s6;
	static double h7; 
	static double s7;

	public static void instantiateVariables(double WAGE, double WORKHOURS, double H1, double S1, double H2, double S2, double H3, double S3, double H4, double S4, 
			double H5, double S5, double H6, double S6, double H7, double S7, double H8, double S8, double H9, double S9, double H10, double S10,
			double H11, double S11, double H12, double S12, double H13, double S13, double H14, double S14, double H15, double S15, double H16, double S16, 
			double H17, double S17, double H18, double S18, double H19, double S19, double H20, double S20) {
		wage = WAGE;
		workHours = WORKHOURS;
		h1=H1;
		s1=S1;
		h2=H2;
		s2=S2;
		h3=H3;
		s3=S3;
		h4=H4;
		s4=S4;
		
			
	}
	
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealWageTest window = new RealWageTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public RealWageTest() {
		initializeRealWage();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializeRealWage() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1120, 566);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//a0
		JLabel lblHowManyHours = new JLabel("What is your weekly wage?");
//a1		
		JLabel lblWhatIsYour = new JLabel("How many hours do you work each week?");
//a2		
		JLabel lblHowManyHours_1 = new JLabel("How many hours do you spend on commuting each week?");
	//a3	
		JLabel lblHowMuchDo = new JLabel("How much do you spend on it (such as gas)?");
	//a4 (deleted)	
		//JLabel lblHowMuchDo_1 = new JLabel("How much do you spend on gas each week?"); //remove
	//a5	
		JLabel lblHowManyHours_2 = new JLabel("How many hours a day do you spend dressing/grooming for work?");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
	//a6	
		JLabel lblHowManyHours_3 = new JLabel("How many hours a day do you spend eating because of work?");
	//a7	
		JLabel lblHowMuchDo_2 = new JLabel("How much do you spend on eating because of work?");
	//a8	
		JLabel lblHowManyHours_4 = new JLabel("How many hours a day do you spend decompressing from work?");
	//a9	
		JLabel lblHowMuchDo_3 = new JLabel("How much do you spend decompressing from work each week?");
	//a10	
		JLabel lblHowManyHours_5 = new JLabel("How many hours a day do you spend on escape entertainment?");
	//a11	
		JLabel lblHowMuchDo_4 = new JLabel("How much do you spend on escape entertainment each week?");
		
		JLabel lblHowManyHours_6 = new JLabel("How many hours a day do you spend on vacations and expensive recreational items because of work (take the total yearly amount and divide by 52 weeks)?");
		
		JLabel lblHowMuchDo_5 = new JLabel("How much do you spend on this week?");
		
		JLabel lblHowManyHours_7 = new JLabel("How many hours a day do you spend on job-related illness?");
		
		JLabel lblHowMuchDo_6 = new JLabel("How much do you spend on this week?");
		
		JLabel lblHowManyHours_8 = new JLabel("How many hours a day do you spend on other job-related expenses?");
		
		JLabel lblHowMuchDo_7 = new JLabel("How much do you spend on this week?");
		
		
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		
		hoursTotal = workHours + h1 + h2 + h3 + h4 + h5 + h6 + h7;
		spentTotal = s1 + s2 + s3 + s4 + s5 + s6 + s7;
		//System.out.println("wage" + weekWage);
		//System.out.println(wage + " spent" + spentTotal + " hours" + hoursTotal + " work hours " + workHours);
		realWage = (wage - spentTotal) / hoursTotal; //calculates real wage
		System.out.print("Your real wage is $");
		System.out.format("%.2f", realWage);
		System.out.print(" per hour");
		
		RealWageWriteTest.writeToFile(realWage);
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				
				//Prints error message if user doesn't enter values into all text fields
				if(textField.getText().isEmpty() ||  textField_1.getText().isEmpty() || textField_2.getText().isEmpty() || textField_3.getText().isEmpty() || 
						textField_5.getText().isEmpty() || textField_6.getText().isEmpty() || textField_7.getText().isEmpty() || textField_8.getText().isEmpty() || 
						textField_9.getText().isEmpty() || textField_10.getText().isEmpty() || textField_11.getText().isEmpty() || textField_12.getText().isEmpty() 
						|| textField_13.getText().isEmpty() || textField_14.getText().isEmpty() || textField_15.getText().isEmpty() || textField_16.getText().isEmpty() || 
						textField_17.getText().isEmpty()){
					//System.out.println("You must enter a value into all fields. Restart the program to continue");
					return;
				}
				/*
				Double wage = Double.parseDouble(textField.getText());
				Double workHours = Double.parseDouble(textField_1.getText().toString());
				Double h1 = Double.parseDouble(textField_2.getText().toString());
				Double s1 = Double.parseDouble(textField_3.getText().toString());
				//String a4 = textField_4.getText().toString();
				Double h2 = Double.parseDouble(textField_5.getText().toString());
				Double s2 = Double.parseDouble(textField_6.getText().toString());
				Double h3 = Double.parseDouble(textField_7.getText().toString());
				Double s3 = Double.parseDouble(textField_8.getText().toString());
				Double h4 = Double.parseDouble(textField_9.getText().toString());
				Double s4 = Double.parseDouble(textField_10.getText().toString());
				Double h5 = Double.parseDouble(textField_11.getText().toString());
				Double s5 = Double.parseDouble(textField_12.getText().toString());
				Double h6 = Double.parseDouble(textField_13.getText().toString());
				Double s6 = Double.parseDouble(textField_14.getText().toString());
				Double h7 = Double.parseDouble(textField_15.getText().toString());
				Double s7 = Double.parseDouble(textField_16.getText().toString());
				*/
				
				
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblHowManyHours_6)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblHowManyHours)
								.addComponent(lblWhatIsYour)
								.addComponent(lblHowManyHours_1)
								.addComponent(lblHowMuchDo)
								.addComponent(lblHowMuchDo_4)
								.addComponent(lblHowMuchDo_2)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(lblHowManyHours_2)
									.addComponent(lblHowManyHours_3)
									.addComponent(lblHowManyHours_4)
									.addComponent(lblHowMuchDo_3)
									.addComponent(lblHowManyHours_5)))
							.addGap(230)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblHowMuchDo_5)
								.addComponent(lblHowManyHours_7)
								.addComponent(lblHowMuchDo_6)
								.addComponent(lblHowManyHours_8)
								.addComponent(lblHowMuchDo_7))
							.addGap(217)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(261, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(661, Short.MAX_VALUE)
					.addComponent(btnSave)
					.addGap(316))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHowManyHours)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblWhatIsYour)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHowManyHours_1)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHowMuchDo)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHowManyHours_2)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHowManyHours_3)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHowMuchDo_2)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHowManyHours_4)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHowMuchDo_3)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHowManyHours_5)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHowMuchDo_4)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHowManyHours_6)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHowMuchDo_5)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHowManyHours_7)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHowMuchDo_6)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHowManyHours_8)
						.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHowMuchDo_7)
						.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnSave)
					.addContainerGap(51, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
