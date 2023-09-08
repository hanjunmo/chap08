package com.example;

public class TriangleExample5 {
	/*
	 *    1.      2.        3.       4.
	 *    *       *****     *****         *
	 *    **       ****     ****         **
	 *    ***       ***     ***         ***
	 *    ****       **     **         ****
	 *    *****       *     *         *****
	 * 
	 */
	interface Shape {
		boolean test(int i, int j);
	}
	
	static class Triangle1 implements Shape {
		@Override
		public boolean test(int i, int j) {
			return i>=j;
		}
	}
	
	static class Triangle2 implements Shape {
		@Override
		public boolean test(int i, int j) {
			return i<=j;
		}
	}
	
	static class Triangle3 implements Shape {
		@Override
		public boolean test(int i, int j) {
			return i+j<=4;
		}
	}
	
	static class Triangle4 implements Shape {
		@Override
		public boolean test(int i, int j) {
			return i+j>=4;
		}
	}
	
	static class Rectangle implements Shape {
		@Override
		public boolean test(int i, int j) {
			return i==0||i==4||j==0||j==4;
		}
	}
	
	static class Cross implements Shape {
		@Override
		public boolean test(int i, int j) {
			return i==j||i+j==4;
		}
	}
	
	static void drawShape(Shape s) {
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (s.test(i, j))
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("1.");
		Shape s = new Triangle1();
		drawShape(s);
		System.out.println("2.");
		s = new Triangle2();
		drawShape(s);
		System.out.println("3.");
		s = new Triangle3();
		drawShape(s);
		System.out.println("4.");
		s = new Triangle4();
		drawShape(s);
		System.out.println("5. rect");
		s = new Rectangle();
		drawShape(s);
		System.out.println("6. cross");
		s = new Cross();
		drawShape(s);
		
		if (s instanceof Triangle1) {
		Triangle1 t = (Triangle1)s;
	  }
   }
	
}