package com.ploy;

public class Car {
	//필드
//		Tire frontLeftTire = new Tire("앞왼쪽", 6);
//		Tire frontRightTire = new Tire("앞오른쪽", 2);
//		Tire backLeftTire = new Tire("뒤왼쪽", 3);
//		Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	    Tire[] tires = {
	    		new HankookTire("앞왼쪽", 6),
	    		new HankookTire("앞오른쪽", 2),
	    		new HankookTire("뒤왼쪽", 3),
	    		new HankookTire("뒤오른쪽", 4)	
	    };
		
		//생성자
		
		//메소드
		int run() {
			System.out.println("[자동차가 달립니다.]");
//			if(frontLeftTire.roll()==false) { stop(); return 1; };
//			if(frontRightTire.roll()==false) { stop(); return 2; };
//			if(backLeftTire.roll()==false) { stop(); return 3; };
//			if(backRightTire.roll()==false) { stop(); return 4; };
			int i = 0;
			for(Tire t : tires) {
				++i;
				if(t.roll() == false) {
					stop();
					return i;
				}
			}
			return 0;
		}
		
		void stop() {
			System.out.println("[자동차가 멈춥니다.]");
		}
}
