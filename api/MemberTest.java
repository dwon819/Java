package com.api;

public class MemberTest {

	   public static void main(String[] args) {
	      // TODO �ڵ� ������ �޼ҵ� ����
	      Member m1 = new Member("123");
	      Member m2 = new Member("123");
	      
	      if(m1 == m2) {
	         System.out.println("m1�� m2�� ����.");
	      }
	      
	      if(m1.equals(m2)) {
	         System.out.println("m1�� m2�� ����.");
	      }
	      System.out.println("hashcode������");
	      
	      System.out.println(m1.hashCode());
	      System.out.println(m2.hashCode());
	   }

	}