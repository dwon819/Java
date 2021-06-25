package com.thread.test;

public class Cook implements Runnable {
	private Table table;

	
	
	public Cook(Table table) {
		this.table = table;
	}


	@Override
	public void run() {
		// TODO 자동 생성된 메소드 스텁
		while(true) {
			int idx = (int)(Math.random()*table.disNum());
			table.add(table.dishNames[idx]);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
	}

//	@Override
//	public void run() {
//		// TODO 자동 생성된 메소드 스텁
//		System.out.println("손님이 들어왔습니다 요리를 시작합니다");
//		try {
//			Thread.sleep(1000);
//			for(int i = 1; i<=15;i++)
//			{
//				System.out.println("요리사가 음식을 만들었습니다"+i);
//			}
//		} catch (InterruptedException e) {
//			// TODO 자동 생성된 catch 블록
//			e.printStackTrace();
//		}
//	
//	}

}
