package com.example;

import com.example.IntefaceExample.A;

public class AnnoymousExample {
	/*
	 * 익명 자식 객체
	 * 익명 구현 객체
	 */
	static abstract class A {
		abstract void show();
			
		}
	
	static class B extends A {

		@Override
		void show() {
			
		}
		
	}
	
	public static void main(String[] args) {
		 A a1 = new B();
		 A a2 = new A() { // 익명 자식 객체

			@Override
			void show() {
             System.out.println("Annotmous.show()...");				
			}
			 
		 };
		 a2.show();
		
	  }
}
		
	
