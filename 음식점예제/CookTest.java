package com.thread.test;

public class CookTest {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Table table = new Table();
		
		Cook cook = new Cook(table);
		
		Customer customer1 = new Customer(table, "chicken");
		Customer customer2 = new Customer(table, "burger");
		
		Thread c = new Thread(cook,"COOK");
		Thread c1 = new Thread(customer1,"Cus1");
		Thread c2 = new Thread(customer2,"Cus2");
		
		c.start();
		c1.start();
		c2.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO �ڵ� ������ catch ���
			e.printStackTrace();
		}
		
		System.exit(0);
	}

}
