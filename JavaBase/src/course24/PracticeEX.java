package course24;

import java.util.Scanner;

public class PracticeEX {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("足し算する？引き算する？");
		System.out.println("1：足し算 2：引き算 3：掛け算 4：割り算");
		int i = stdIn.nextInt();

		System.out.println("1つ目の数字を入れてね");
		int a = stdIn.nextInt();

		System.out.println("2つ目の数字を入れてね");
		int b = stdIn.nextInt();

		if (i == 1) {
			tasu(a, b);
		} else if (i == 2) {
			hiku(a, b);
		} else if (i == 3) {
			kake(a, b);
		} else if (i == 4) {
			waru(a, b);
		}
	}

	//足し算
	static void tasu(int x, int y) {
		System.out.println(x + "+" + y + "=" + (x + y));
	}

	//引き算
	static void hiku(int x, int y) {
		System.out.println(x + "-" + y + "=" + (x - y));
	}

	//掛け算
	static void kake(int x, int y) {
		System.out.println(x + "×" + y + "=" + (x * y));
	}

	//割り算
	static void waru(int x, int y) {
		System.out.println(x + "÷" + y + "=" + (x / y));
	}

}
