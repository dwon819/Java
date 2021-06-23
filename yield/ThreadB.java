package com.thread;

public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;
	private int i = 0;
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB 작업 내용"+ i/10000);
			}
			else{
				Thread.yield();
			}
			i++;
		}
		System.out.println("TreadB 종료"+i);
	
	}
}
