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
		// TODO 자동 생성된 메소드 스텁
		while(true) {
			try {
				Thread.sleep(100);
			
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
			}
			String name = Thread.currentThread().getName();
			table.remove(food);
			System.out.println(name+"음식을 먹었습니다.");
		}
	}
}
