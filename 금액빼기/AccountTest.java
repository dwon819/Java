package com.thread.test;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnalbleEx r = new RunnalbleEx();
		Thread p1 = new Thread(r);
		Thread p2 = new Thread(r);
		
		
		p1.start();
		p2.start();
		

	}

}
