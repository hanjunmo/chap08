package com.example;

import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {
    static class Alpha extends TimerTask {

		@Override
		public void run() {
			System.out.println((char)(Math.random()*26 +'A'));
		}
    	
    }
    
	public static void main(String[] args) {
		Timer timer = new Timer();
		Alpha a = new Alpha();
		timer.schedule(a, 0, 100);
		
		TimerTask n = new TimerTask() { // 익명 자식객체

			@Override
			public void run() {
				System.out.println((int)(Math.random()*10));
			}
			
		};
		
		timer.schedule(n, 0, 1000);
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
              System.out.println((char)(Math.random()*26 + 'a'));				
			}
		}, 0, 500);
		
   	}		
}


