package util;

public interface VT100 {
	
	public static void clearScreen() {
		System.out.print("\033[2J");
	}
	
	public static void cursorMove(int line, int cloumn) {
		System.out.printf("\033[%d;%dH", line, cloumn);
	}
	
	public static void setForeground(int fg) {
		System.out.printf("\033[%dm", fg);
	}
	
	public static void setForeground(Color bg) {
		System.out.printf("\033[%dm", bg.ordinal() + 40);		
	}
	
	public static void setBackground(int bg) {
		System.out.printf("\033[%dm", bg);
	}
	
	public static void setBackground(Color bg) {
		System.out.printf("\033[%dm", bg.ordinal() + 30);
	}
	
	public static void print(char ch) {
		System.out.print("");
	}
	
	public static void reset() {
		System.out.println("\033[0m");
	}
		
}