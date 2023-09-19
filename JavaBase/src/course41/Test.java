package course41;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		//①
		String moji = "模擬テスト。100点取ります。";
		System.out.println(moji);

		//②
		int x = 50;
		int y = 100;
		int z = x * y;
		System.out.println(z);

		//③
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();

		//④
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "回目のループです");
		}

		//⑤
		int b = stdIn.nextInt();
		if (b >= 50) {
			System.out.println("50以上です。");
		} else {
			System.out.println("49以下です。");
		}

		//⑥
		boolean isRaining = true;

		if (isRaining) {
			System.out.println("傘をもってけーーー");
		} else {
			System.out.println("良い1日を！");
		}

		//⑦
		int[] numArr = { 10, 50, 30, 20, 40 };

		//⑧
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}

		//⑨
		int save = 0;
		for (int i = 0; i < numArr.length; i++) {
			if (save < numArr[i]) {
				save = numArr[4];
			}
		}
		System.out.println(numArr[4]);
	}

}
