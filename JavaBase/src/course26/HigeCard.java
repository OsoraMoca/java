package course26;

import java.util.Scanner;

public class HigeCard {

	public static void main(String[] args) {

		System.out.println("ハイカード！");

		//初期所持金
		int money = 1000;
		System.out.println("現在の所持金は" + money + "です。");

		syojikin(money);

		//ゲーム数の記録
		int gamecount = 0;
		//勝利数の記録
		int wincount = 0;
		//敗北数の記録
		int losecount = 0;

		//終了判定
		System.out.println("やめる？やめるなら9999をいれて");
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		end(a);

	}

	//所持金の表示
	static void syojikin(int m) {

		//仮↓
		//1だと負け、2だと勝ち
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();

		if (a == 1) {
			m = m / 2;
			System.out.println("現在の所持金は" + m + "です。");
		} else if (a == 2) {
			m = m * 2;
			System.out.println("現在の所持金は" + m + "です。");
		}
	}

	//終了判定
	static void end(int a) {

		if (a == 9999) {
			System.out.println("END");
		} else {
			System.out.println("CONT");
			//↓仮で継続と表示
			keizoku();
		}
	}

	//仮の継続用
	static void keizoku() {
		System.out.println("継続");
	}
}
