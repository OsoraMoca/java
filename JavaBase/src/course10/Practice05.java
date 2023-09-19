package course10;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("x打って");
		int x = stdIn.nextInt();
		System.out.println("y打って");
		int y = stdIn.nextInt();
		
		if(x > y) {
			System.out.println("xがでかい！");
		}
		if(x < y) {
			System.out.println("yがでかい！");
		}
		if(x == y) {
			System.out.println("おなじー！");
		}

	}

}
