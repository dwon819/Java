package com.thread.test;

public class Cook implements Runnable {
	private Table table;

	
	
	public Cook(Table table) {
		this.table = table;
	}


	@Override
	public void run() {
		// TODO �ڵ� ������ �޼ҵ� ����
		while(true) {
			int idx = (int)(Math.random()*table.disNum());
			table.add(table.dishNames[idx]);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO �ڵ� ������ catch ���
				e.printStackTrace();
			}
		}
	}

//	@Override
//	public void run() {
//		// TODO �ڵ� ������ �޼ҵ� ����
//		System.out.println("�մ��� ���Խ��ϴ� �丮�� �����մϴ�");
//		try {
//			Thread.sleep(1000);
//			for(int i = 1; i<=15;i++)
//			{
//				System.out.println("�丮�簡 ������ ��������ϴ�"+i);
//			}
//		} catch (InterruptedException e) {
//			// TODO �ڵ� ������ catch ���
//			e.printStackTrace();
//		}
//	
//	}

}
