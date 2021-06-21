package com.api;

import com.sun.management.VMOption.Origin;

public class Memeber2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member2 orginal = new Member2("blue", "ȫ�浿", "1234", 23, true);
		
		Member2 cloned = orginal.getMember();
		
		cloned.password ="qqqqqqq";
		System.out.println(orginal.password);
		System.out.println(cloned.password);
	}

}
