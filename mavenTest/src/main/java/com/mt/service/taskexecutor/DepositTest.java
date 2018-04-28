package com.mt.service.taskexecutor;

public class DepositTest extends Thread{

	private Account account;
	private double balance;
	public DepositTest(String name, Account account, double balance) {
		super(name);
		this.account = account;
		this.balance = balance;
	}
	
	public void run() {
		for(int i=0; i<100; i++) {
			account.deposit(balance);
		}
	}
}
