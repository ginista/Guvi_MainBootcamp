package day15.org.functionalProgramming;

public class Main {

	public static void main(String[] args) {
		BankingManagement deposit =(balance,amount)->balance+amount;
		
		BankingManagement withdrawal =(balance,amount)->
		{
			if(balance<0 || balance <amount)
			{
				System.out.println("Insufficient balance");
				return balance;
			}
			else {
				return balance-amount;
			}
			
		};
		
		//check account balance
		BankingManagement checkBalance =(balance, amount)->  balance;
		
		
		//Initial balance
		double initialbalance = 1000.0;
		
		//deposit
		double afterDeposit =deposit.bankingOperations(initialbalance, 500);
		System.out.println("After deposit : "+afterDeposit);
		
		double afterWithdrawal = withdrawal.bankingOperations(afterDeposit, 230);
		System.out.println("After withdrawal : "+afterWithdrawal);
		
		double remainingBalance =checkBalance.bankingOperations(afterWithdrawal,0);
		System.out.println("Current balace: "+remainingBalance);

	}

}
