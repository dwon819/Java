package com.thread;

public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;
	private int i = 0;
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB �۾� ����"+ i/10000);
			}
			else{
				Thread.yield();
			}
			i++;
		}
		System.out.println("TreadB ����"+i);
	
	}
}
