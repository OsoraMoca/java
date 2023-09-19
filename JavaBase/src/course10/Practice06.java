package course10;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("x打って");
		int x = stdIn.nextInt();
		System.out.println("y打って");
		int y = stdIn.nextInt();
		
		if(x > y) {
			System.out.println("xがでかい！なぜならxは" + x + "でyは" + y + "だから");
		}
		if(x < y) {
			System.out.println("yがでかい！なぜならxは" + x + "でyは" + y + "だから");
		}

	}

}
