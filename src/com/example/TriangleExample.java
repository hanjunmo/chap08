package com.example;

public class TriangleExample {
	/*
	 * 1.    2.      3.       4.
	 * *     *****   *****          *
	 * **     ****   ****          **
	 * ***     ***   ***          ***
	 * ****     **   **          ****
	 * *****     *   *          *****
	 * 
	 */
	
	 static void triangle1() {
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
//				if (i==j || i>j)
				if (i>=j)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
		 
	}
    static void triangle2() {
    	for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (i<=j)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
    static void triangle3() {
    	for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
//				if (i+j==4 || i+j<4)
				if (i+j<=4)

					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
    static void triangle4() {
    	for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (i+j>=4)

					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
}
    
    static void rectangle() {
    for (int i=0; i<5; i++) {
		for (int j=0; j<5; j++) {
			if (i==0||i==4||j==0||j==4)

				System.out.print('*');
			else
				System.out.print(' ');
		}
		System.out.println();
	 }
  }
    
    static void cross() {
        for (int i=0; i<5; i++) {
    		for (int j=0; j<5; j++) {
    			if (i==j || i+j==4)

    				System.out.print('*');
    			else
    				System.out.print(' ');
    		}
    		System.out.println();
    	 }
      }
    
	
	public static void main(String[] args) {
		System.out.println("1.");
       triangle1();
		System.out.println("2.");
       triangle2();
		System.out.println("3.");
       triangle3();
		System.out.println("4.");
       triangle4();
       System.out.println("5. rect");
       rectangle();
       System.out.println("6. cross");
       cross();
	}

}
