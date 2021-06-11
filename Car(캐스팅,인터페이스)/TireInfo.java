package com.ploy;

public class TireInfo implements Tire{//오버리이딩을 안하려면 abstract로 만들면 roll()을 오버라이딩을 할 필요가 없다 어뎁터 패턴
	//필드
		public int maxRotation;     			//최대 회전수(최대 수명)
		public int accumulatedRotation;		//누적 회전수
		public String location;       			//타이어의 위치

		//생성자
		public TireInfo(String location, int maxRotation) {
			this.location = location;
			this.maxRotation = maxRotation;
		}

		@Override
		public boolean roll() {
			// TODO 자동 생성된 메소드 스텁
			return false;
		}
}
