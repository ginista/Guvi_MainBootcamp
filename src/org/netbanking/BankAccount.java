package org.netbanking;

public class BankAccount {

	private long accountNumber;
	private String accountName;
	private double balance;
	
	//setter method
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountName) {
		this.accountName = accountName;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//getter method
	public long getAcccountNumber() {
		return accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public double getBalance() {
		return balance;
	}
	
	//other method
	public void deposit(double amount) {
		if(amount>0)
		{
		  this.balance+=amount;
		  System.out.println(amount+" deposited.Current balance "+balance);
		}
		else {
			System.out.println("Invalid amount.Deposit failed");
		}
	}
	//Withdraw
	public void withdraw(double amount) {
		if(amount>0 && balance>=amount) {
			balance-=amount;
			System.out.println(amount+" withdrawan. Current balance "+balance);
		}
		else {
			System.out.println("Invalid amount or Insufficient balance");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();
		account.setAccountNumber(345678998);
		account.setAccountHolderName("Ginista");
		account.setBalance(1000.0);
		System.out.println("Account number:"+account.getAcccountNumber());
        System.out.println("Account Holder Name: "+account.getAccountName());
        System.out.println("Initial balance: "+account.getBalance());
        account.deposit(13000);
        account.withdraw(2000);
        System.out.println("Current Balance: "+account.getBalance());
	}

}
