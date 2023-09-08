package com.example;

import com.example.IntefaceExample.A.Showable;

public class InterfaceExtendsExample {
	interface Showble {
		void show();
		void hide();
	}
	interface Moveable {
		void left();
		void right();
		void up();
		void down();
	}
	
	interface Shapable extends Showable, Moveable {
		void move();

		void hide();

		void show();

		void down();

		void up();

		void right();

		void left();
	}
	
	static class B implements Shapable {
	
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

		@Override
		public void show() {
		}

		@Override
		public void hide() {
		}

		@Override
		public void move() {
		}
		
	}

	public static void main(String[] args) {
	}

}
