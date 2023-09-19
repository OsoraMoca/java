package course10;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a打って");
		int a = stdIn.nextInt();
		System.out.println("b打って");
		int b = stdIn.nextInt();
		System.out.println("c打って");
		int c = stdIn.nextInt();
		
		if(a > b && b > c) {
			System.out.println(a + "が1番大きい数値です。");
			System.out.println(b + "が2番目に大きい数値です。");
			System.out.println(c + "が3番目に大きい数値です。");
		}
		if(a > c && c > b) {
			System.out.println(a + "が1番大きい数値です。");
			System.out.println(c + "が2番目に大きい数値です。");
			System.out.println(b + "が3番目に大きい数値です。");
		}
		if(b > c && c > a) {
			System.out.println(b+ "が1番大きい数値です。");
			System.out.println(c + "が2番目に大きい数値です。");
			System.out.println(a + "が3番目に大きい数値です。");
		}
		if(b > a && a > c) {
			System.out.println(b+ "が1番大きい数値です。");
			System.out.println(a + "が2番目に大きい数値です。");
			System.out.println(c + "が3番目に大きい数値です。");
		}
		if(c > a && a > b) {
			System.out.println(c+ "が1番大きい数値です。");
			System.out.println(a + "が2番目に大きい数値です。");
			System.out.println(b + "が3番目に大きい数値です。");
		}
		if(c > b && b > a) {
			System.out.println(c+ "が1番大きい数値です。");
			System.out.println(b + "が2番目に大きい数値です。");
			System.out.println(a + "が3番目に大きい数値です。");
		}

	}

}
