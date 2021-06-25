package com.thread.test;

public class Customer implements Runnable {
	private Table table;
	private String food;


	public Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}

	@Override
	public void run() {
		// TODO �ڵ� ������ �޼ҵ� ����
		while(true) {
			try {
				Thread.sleep(100);
			
			} catch (InterruptedException e) {
				// TODO �ڵ� ������ catch ���
			}
			String name = Thread.currentThread().getName();
			table.remove(food);
			System.out.println(name+"������ �Ծ����ϴ�.");
		}
	}
}
