package com.example;

public class TriangleExample2 {
	/*
	 * 1.    2.      3.       4.
	 * *     *****   *****          *
	 * **     ****   ****          **
	 * ***     ***   ***          ***
	 * ****     **   **          ****
	 * *****     *   *          *****
	 * 
	 */
	static class Show {
		boolean isDraw(int i, int j) {
			return i<=j;
		}

	
	 static void drawShape(Show s) {
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (s.isDraw(i, j))
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("1.");
		Show s = new Show();
		drawShape(s);
		System.out.println("2.");
		drawShape(s);
		System.out.println("3.");
		drawShape(s);
		System.out.println("4.");
		drawShape(s);
       System.out.println("5. rect");
       drawShape(s);
       System.out.println("6. cross");
       drawShape(s);
	}
  }
}
