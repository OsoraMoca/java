package course57;

import java.util.Random;
import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		
		System.out.println("数当てゲーム！");
		
		Random rnd = new Random();
		
		int ransu = rnd.nextInt(100) + 1;
		
		for (int i = 1; i < 999; i++) {
			System.out.println("1～100の数を入力してね！");
			Scanner stdIn = new Scanner(System.in);
			int num = stdIn.nextInt();
			
			while (num < 1 || num > 100) {
				System.out.println("1～100の数を入れてね！");
				num = stdIn.nextInt();
			}
			
			if (num == ransu) {
				System.out.println("正解！" + i + "回目でクリア！");
				break;
				
			} else {
				System.out.println("不正解！もう一度！");
				if (num < ransu) {
					System.out.println("ヒント：もっと大きいよ！");
				} else if (num > ransu) {
					System.out.println("ヒント：もっと小さいよ！");
				}
			}
		}
		

	}

}
