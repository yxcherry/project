package com.mt.service.taskexecutor;

public class DrawThread extends Thread{
	private Account account;
	private double balance;
	public DrawThread(String name, Account account, double balance) {
		super(name);
		this.account = account;
		this.balance = balance;
	}
	
	public void run() {
		/*synchronized (account) {
			if(account.getBalance() >= balance) {
				System.out.println(getName() + "取钱成功，吐出钞票！" + balance);
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				account.setBalance(account.getBalance() - balance);
				System.out.println("\t余额为：" + account.getBalance());
			}else {
				System.out.println(getName() + "取钱失败，余额不足！");
			}
		}*/
		for(int i=0; i<100; i++) {
			account.draw(balance);
		}
	}
	

}
