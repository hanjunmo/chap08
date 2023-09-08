package com.example;

import java.util.TimerTask;

import com.example.IntefaceExample.A.AA;

public class IntefaceExample {
	static class A {
		class AA {
			
		}
		static int count;
		int num;
		
		static {
			
		}
		public A() {
			
		}
		void show() {
			
		}
		static int getCount() {
			return count;
			
		}
		
		static abstract class B {  // 추상클래스(불완전한 쿨래스)
			static int count=0;
			int num;
			
			public B() {
				
			}
			void show() {
				
			}
			static int getCount() {
				return count;
			}
			
			abstract void hide();  // 추상메소드
		}
		
		static class AA1 extends A {
			
		}
		
		static class BB extends B {

			@Override
			void hide() {
			}
			
		}
		
		static class Task extends TimerTask {

			@Override
			public void run() {
			}
			
		}
		
		static abstract class D {  // 순수 추상클래스
			abstract void show();
			abstract void hide();
		}
		
		static class DD extends D {

			@Override
			void show() {
			}

			@Override
			void hide() {
			}
			
		}
		
		interface Showable {
			void show();
			void hide();
		}
		interface Moveable {
			void left();
			void right();
			void up();
			void down();
		}
		
		static class E implements Showable, Moveable {

			@Override
			public void show() {
			}

			@Override
			public void hide() {
			}

			@Override
			public void left() {
				
			}

			@Override
			public void right() {
				
			}

			@Override
			public void up() {
				
			}

			@Override
			public void down() {
				
			}
			
		}

		
	public static void main(String[] args) {
        A a = new A();
//      B b = new B(); // (X)
//      Showable s = new Showable(); // (X)
        
        B b = null;
        Showable s = null;
        
        A a1 = new AA1(); 
        B b1 = new BB();
        Showable s1 = new E();
        Moveable m1 = new E();
        
        s1.show();
        s1.hide();
        
        m1.left();
        m1.right();
        m1.up();
        m1.down();
        
	   }
	}
}
