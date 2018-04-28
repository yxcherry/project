package com.mt.service.taskexecutor;

public class DrawTest {

	public static void main(String[] args) {

		Account account = new Account("0000125", 0);
		/*DrawThread drawThread1 = new DrawThread("甲", account, 600);
		DrawThread drawThread2 = new DrawThread("乙", account, 600);
		drawThread1.start();
		drawThread2.start();*/
		new DrawThread("取钱者", account, 600).start();
		new DepositTest("存钱者", account, 600).start();
		new DepositTest("存钱者", account, 600).start();
		new DepositTest("存钱者", account, 600).start();
	}

}
