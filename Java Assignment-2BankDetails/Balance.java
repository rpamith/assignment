package BankDetails;

public class Balance {

	public static void main(String[] args) {
		 
		Bank newBank = new Bank();
		newBank.showTotal();
		
		Bank savingAc = new SavingAccount();
		
		Bank current = new CurrentAccount();
		
		savingAc.addAmt(10000);
		current.addAmt(35000);
		
		newBank.addToTotalBankCash(current);
		newBank.addToTotalBankCash(savingAc);
		
		current.showTotal();
		savingAc.showTotal();
		
		newBank.showTotal();	
	}

}
