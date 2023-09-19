package course13;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {

		System.out.println("数値を入力");
		Scanner stdIn = new Scanner(System.in);

		int yy = stdIn.nextInt();

		for (int i = 1; i <= yy; i++) {
			System.out.println(i);
            
			if (i % 2 == 0 && i != 0) {
				System.out.println("偶数だよ");
			} else  {
				System.out.println("奇数だよ");
			}
			
			if (i > 100) {
				System.out.println("どれだけ回すの");
			}
		}

	}

}
