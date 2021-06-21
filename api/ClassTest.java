package com.api;


public class ClassTest {
	public static void main(String[] args) {
		Car car = new Car("∏∂∆º¡Ó");
		
		Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
		System.out.println(clazz.getPackageName());
		
		try {
			Class  clazz2 =Class.forName("com.api.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
			System.out.println(clazz2.getPackageName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
