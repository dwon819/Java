package com.api;

public class MemberTest {

	   public static void main(String[] args) {
	      // TODO 자동 생성된 메소드 스텁
	      Member m1 = new Member("123");
	      Member m2 = new Member("123");
	      
	      if(m1 == m2) {
	         System.out.println("m1과 m2는 같다.");
	      }
	      
	      if(m1.equals(m2)) {
	         System.out.println("m1과 m2는 같다.");
	      }
	      System.out.println("hashcode변경전");
	      
	      System.out.println(m1.hashCode());
	      System.out.println(m2.hashCode());
	   }

	}