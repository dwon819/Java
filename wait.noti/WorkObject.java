package com.thread.object;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("TreadA�� methodA() �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}
}
