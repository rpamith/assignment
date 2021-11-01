package withDraw;

import java.util.Scanner;

public class WithdrawProcess {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
			
			SavingAccount demoAccount = new SavingAccount();
			
			demoAccount.showInfo();
			System.out.println("\n"+"Enter amount to withdraw:");
			
			double amount = sc.nextDouble();
			
			try {
				
				demoAccount.withDraw(amount);
				
				
			} catch (InSufficientBalanceException e) {
				
				System.out.println("Error : " + e.getMessage());
				 
			}catch (IllegalBankTransactionException e) {
				
				System.out.println("Error : " + e.getMessage());
				 
			}
			System.out.println();
			demoAccount.showInfo();
			
	}
			

}
