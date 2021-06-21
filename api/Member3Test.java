package com.api;

public class Member3Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member3 origin = new Member3("홍길동",25,new int[] {90,90},new Car("소나타"));
		
		Member3 cloned = origin.getMember();
		
		cloned.scores[0] = 100;
		
		cloned.car.model="그랜져";
		
		System.out.println(origin.scores[0]);
		System.out.println(origin.scores[1]);
		System.out.println(origin.car.model);
		
		System.out.println(cloned.scores[0]);
		System.out.println(cloned.scores[1]);
		System.out.println(cloned.car.model);
		
	}
}
