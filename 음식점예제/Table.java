package com.thread.test;

import java.util.ArrayList;

public class Table {
		String[] dishNames = {"burger","chicken","burger","rice"};
		final int MAX_FOOD = 6;
		private ArrayList<String> dishes = new ArrayList<>();
		
		public synchronized void add(String dish) {
			while(dishes.size()>=MAX_FOOD) {
				String name = Thread.currentThread().getName();
				System.out.println(name+"is waiting");
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO 자동 생성된 catch 블록
					e.printStackTrace();
				}
				
			}
			dishes.add(dish);
			notify();
			System.out.println("Dishes: "+ dishes.toString());
		}
		
	
//		public synchronized void add(String dish) {
//			if(dishes.size() >= MAX_FOOD) {
//				return;
//			}
//			dishes.add(dish);
//			
//			System.out.println("Dishes : "+dishes.toString());
//		}
		
		
		public void remove(String dishName) {
			synchronized (this) {
				String name = Thread.currentThread().getName();
				while(dishes.size()== 0) {
					System.out.println(name+"is waiting");
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO 자동 생성된 catch 블록
						e.printStackTrace();
					}
				}
				while(true) {
					for(int i = 0; i<dishes.size();i++) {
						if(dishName.equals(dishes.get(i))) {
							dishes.remove(i);
							notify();
							return;
						}
					}
					try {
						System.out.println(name+"is waiting");
						wait();
					} catch (InterruptedException e) {
						// TODO 자동 생성된 catch 블록
						e.printStackTrace();
					}
				}
				
			}
		}
			
//		public boolean remove(String dishName) {
//			synchronized (this) {
//				for(int i = 0; i<dishes.size();i++) {
//					if(dishName.equals(dishes.get(i))) {
//						dishes.remove(i);	
//						return true;
//					}
//				}
//				return false;
//			}
//		}
		public int disNum() {
			
			return dishNames.length;
		}
}
