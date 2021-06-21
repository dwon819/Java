package com.api;

import java.util.Objects;

public class Member {
	   
	   public String id;

	   public Member(String id) {
	      
	      this.id = id;
	   }

	   @Override
	   public boolean equals(Object obj) {
	      // TODO 자동 생성된 메소드 스텁
	      
	      if(obj instanceof Member) {
	         Member other = (Member)obj;
	         return this.id.equals(other.id);
	      }
	      return false;
	   }
	   @Override
	   public int hashCode() {
		   return Objects.hash(id); //id.hashcode();
	   }
}