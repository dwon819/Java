package com.thread;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;
	private int i = 0;
	
	
	public void run() {
		
		while(!stop) {
			if(work) {
				System.out.println("ThreadA �۾� ����  "+i/10000);
			}else{
				Thread.yield();
			}
			i++;
		}
		System.out.println("TreadA ����"+i);
	
	}
}
