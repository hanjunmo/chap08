package com.example;

import com.example.IntefaceExample.A;

public class AnnoymousExample2 {
	/*
	 * 익명 자식 객체
	 * 익명 구현 객체
	 */
	interface Showable {
		void show();
		void hide();
	}
	
	static class A implements Showable {

		@Override
		public void show() {
		}

		@Override
		public void hide() {
		}
		
		void move() {
			
		}
		
	}
	
	public static void main(String[] args) {
		Showable a = new A();
		a.show();
		a.hide();
//		a.move(); (x)
		
		Showable b = new Showable() { // 익명 구현 객체
			
			@Override
			public void show() {
			}
			
			@Override
			public void hide() {
			}
			
			void left() {
				
			}
		};
		
		b.show();
		b.hide();
//		b.left(); // (X)
		
	  }
}
		
	
