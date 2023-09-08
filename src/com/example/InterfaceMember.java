package com.example;

public class InterfaceMember {
	interface Moveble {
		int BLACK=0;   // public static final
		void move();   // public abstract
		
		default void xxx() {
			System.out.println("Moveavle.xxx()");
		};
//		void yyy() { (X)
//			
//		}
		
		static void zzz() {
			System.out.println("Moveable.zzz()...");
		}
		
	}
	
	static class A implements Moveble {

		@Override
		public void move() {
			
		}
		
	}

	public static void main(String[] args) {
        System.out.println(Moveble.BLACK);
        A a = new A();
        a.xxx();
        Moveble.zzz();
	}

}
