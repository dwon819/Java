package com.thread.object;

public class WaitNotifyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkObject sharedObject = new WorkObject();
		DataBox dataBox = new DataBox();
		
		
//		ThreadA threadA = new ThreadA(sharedObject);
//		ThreadB threadB = new ThreadB(sharedObject);
//		
//		threadA.start();
//		threadB.start();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();
		
		
	}

}
