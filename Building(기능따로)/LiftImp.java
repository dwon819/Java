package com.inface;

public class LiftImp implements Liftable {

	@Override
	public void lift() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("이륙한다");
	}

	@Override
	public void move(int x, int y) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("움직인다");
	}

	@Override
	public void stop() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("멈춘다");
	}

	@Override
	public void land() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("착륙한다");
	}

}
