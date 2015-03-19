package ru.pere.lab20_2;

public class Bank {
	
	private String name;
	
	public class Account {
		
		private long accountNumber;
		private double accountBalans;
		
		
		
		public Account(long number) {
			this.accountNumber = number;
		}

		public void Deposit(double summa){
			this.accountBalans += summa;
		}

		public boolean Withdrow(double summa){
			if (this.accountBalans<summa) return false;
			this.accountBalans -= summa;
			return true;
		}
		
		public long getAccountNumber() {
			return accountNumber;
		}

		public double getAccountBalans() {
			return accountBalans;
		}
		
		public void show(){
			System.out.printf("%s %d %g\n", name, getAccountNumber(), getAccountBalans());
		}
		
	}

	public String getName() {
		return name;
	}

	public Bank(String name) {
		this.name = name;
	}

}
