package com.thread.test;

public class RunnalbleEx implements Runnable{
	Account acc = new Account();

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random()*3+1)*100;
			acc.withdraw(money);
			System.out.println("balance"+acc.getBalance());
		}
		
	}

}
