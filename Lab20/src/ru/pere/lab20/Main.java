package ru.pere.lab20;

import static java.lang.System.out;

import ru.pere.lab20_2.*;

public class Main {

	public static void main(String[] args) {
		
		Bank bank = new Bank("Bank Of NY");
		Bank.Account account = bank.new Account(100092234);

		out.println(bank.getName());
		
		account.show();
		account.Deposit(100);
		account.show();
		if (account.Withdrow(25)) account.show();
		else out.println("No money, no hony");
	}

}
