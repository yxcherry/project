package com.mt.service.taskexecutor;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

	private final Lock lock = new ReentrantLock();
	private final Condition condition = lock.newCondition();
	private String accountNo;
	private double balance;
	//账户中是否有存款的标志
	private boolean flag = false;
	
	public Account() {}

	public Account(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		return accountNo.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj != null && obj.getClass() != Account.class) {
			Account account = (Account)obj;
			return account.getAccountNo().equals(accountNo);
		}
		return false;
	}
	
	/*public synchronized void draw(double drawAmount) {
		if(balance >= drawAmount) {
			System.out.println(Thread.currentThread().getName() + "取钱成功，吐出钞票！" + drawAmount);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			balance = balance - drawAmount;
			System.out.println("\t余额为：" + balance);
		}else {
			System.out.println(Thread.currentThread().getName() + "取钱失败，余额不足！");
		}
		
	}*/
	
	/*public void draw(double drawAmount) {
		lock.lock();
		try {
			if(balance >= drawAmount) {
				System.out.println(Thread.currentThread().getName() + "取钱成功，吐出钞票！" + drawAmount);
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				balance = balance - drawAmount;
				System.out.println("\t余额为：" + balance);
			}else {
				System.out.println(Thread.currentThread().getName() + "取钱失败，余额不足！");
			}
		} finally {
			lock.unlock();
		}
		
	}*/
	
	public synchronized void draw(double drawAmount) {
		
		lock.lock();
		try {
			if (!flag) {
				condition.wait();
			}else {
				
				//执行取钱操作
				if(balance >= drawAmount) {
					System.out.println(Thread.currentThread().getName() + "取钱成功，吐出钞票！" + drawAmount);
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					balance = balance - drawAmount;
					System.out.println("\t余额为：" + balance);
					flag = false;
					condition.notifyAll();
				}else {
					System.out.println(Thread.currentThread().getName() + "取钱失败，余额不足！");
				}
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		
	}
	
	public synchronized void deposit(double depositAmount) {
		lock.lock();
		try {
			if (flag) {
				condition.wait();
			}else {
				
				//执行取钱操作
				System.out.println(Thread.currentThread().getName() + "存款" + depositAmount);
				balance = balance + depositAmount;
				System.out.println("\t余额为：" + balance);
				flag = true;
				condition.notifyAll();
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		
	}
	
}
