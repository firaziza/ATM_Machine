import java.util.Scanner;

public class ATM {
	
	public static void main(String [] args) {
		
		double checkBalance=0; double saveBalance=0; // intilialised
		
		int option = 0;
		
		menu(option, checkBalance, saveBalance);  // menu method
		
	}
	
	// Scanner method
	
	public static Scanner in = new Scanner (System.in);
	
	// method for menu/options
	
	public static void menu(int x, double z, double y) {
	
		double checkBalance=z, saveBalance=y, depositAmt, withdrawAmt, balance;
		
		
		
		for(int i=1; i>0;i++) {
		System.out.println("\n\nWhat you want to do? \n"
				+ "\n1. Want to know your account balance?"
				+ "\n2. Want to deposit money in your account?"
				+ "\n3. Want to withdraw money from your account?"
				+ "\n4. exit?");
		
		int option = in.nextInt();
		
		
		switch(option)
		
		{
		case 1: 
			displayBalance(checkBalance, saveBalance);
			break;
			
			
		case 2:
			System.out.println("\n Enter the amount you want to deposit: $ ");
			depositAmt = in.nextDouble();
			balance = depositFund(depositAmt, checkBalance, saveBalance);
			
			break;
		
		case 3:
			System.out.println("\n Enter the amount you want to withdraw: $ ");
			withdrawAmt = in.nextDouble();
			balance = withdrawFund(withdrawAmt, checkBalance, saveBalance);
			
			break;
			
			
		case 4:
			System.out.print("\nHave a good day !! Thanks for using ATM !!\n");
			System.exit(0);
			break;
	
		}}
		
	}
	// method for display balance
	public static void displayBalance(double x, double y) {
		
		double checkBalance =x, saveBalance = y;
		
		System.out.printf("\n 1. Checking or 2. Saving Account?");
		
		int choice = in.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.printf("\n Balance available in checking: $ %.2f",checkBalance);
			break;
		case 2:
			System.out.printf("\n Balance available in savings: $ %.2f",saveBalance);
			break;
		
		}
		
		
		
	}
	
	// method for deposit fund
	public static double depositFund(double x, double y, double z) {
		
		double depositAmt = z;
		double checkBalance=x , saveBalance=y;
		
		System.out.printf("\n Deposit to which account ? \n1. Checking or 2. Saving Account?");
		int choice = in.nextInt();
		switch(choice) {
		
		case 1:
			
			checkBalance = depositAmt + checkBalance;
			break;
			
		case 2:

			saveBalance = depositAmt + saveBalance;
			break;
		
		}
		
		System.out.printf("\n Balance available in checking: $ %.2f",checkBalance);
		System.out.printf("\n Balance available in savings: $ %.2f",saveBalance);
		
		return checkBalance;
		
	}
	
	// method for withdraw fund
		public static double withdrawFund(double x, double y, double z) {
			
			double withdrawAmt = x;
			double checkBalance =y, saveBalance=z;
			
			System.out.printf("\n Withdraw from which account ? \n1. Checking or 2. Saving Account?");
			
			int choice = in.nextInt();
			switch(choice) {
			
			case 1:
				if(checkBalance > withdrawAmt) {
					checkBalance = checkBalance-withdrawAmt;
					System.out.printf("Amount withdrawn of $ %.2f from Checking Account", checkBalance);
				}
				else {
					System.out.printf("\nyour Balance is $ %.2f, type less value\n", checkBalance);
				}
				
				break;
				
			case 2:

				if(saveBalance > withdrawAmt) {
					saveBalance = saveBalance-withdrawAmt;
					System.out.printf("Amount withdrawn of $ %.2f from Saving Account", saveBalance);
				}
				else {
					System.out.printf("\nyour Balance is $ %.2f, type less value\n", saveBalance);
				}
				break;
			
			}
			
			return checkBalance;
			
			
		}
	

}
