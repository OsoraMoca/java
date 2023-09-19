package pocketon;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		
		int count = 0;
		Trainer t1 = new Trainer();
		System.out.println("名前を入力してください");
		Scanner stdIn = new Scanner(System.in);
		String name = stdIn.next();
		
		while (count < 9999) {
			System.out.println("名前は" + name + "です");
			System.out.println("メニューを選択してください");
			System.out.println("１・・・捕獲");
			System.out.println("２・・・図鑑を見る");
			System.out.println("３・・・バトル");
			System.out.println("９９・・プログラム終了");
			
			int menu = stdIn.nextInt();
			
			if (menu == 1) {
				System.out.println("ポケトンの名前を入力してください");
				String pokename = stdIn.next();
				
				System.out.println("タイプ(火、水、地面、草)を入力してください");
				String type = stdIn.next();
				
				System.out.println("戦闘力を入力してください");
				int power = stdIn.nextInt();
				
				System.out.println("捕獲難易度を入力してください");
				int difficulty = stdIn.nextInt();
				
				Pocketon poke = new Pocketon(pokename, type, power, difficulty);
				t1.capture(poke);
				t1.display();
				
			} else if (menu == 2) {
				t1.display();
			}  else if (menu == 3) {
				System.out.println("1体目のポケトンの名前を入力してください");
				String poke1 = stdIn.next();
				System.out.println("2体目のポケトンの名前を入力してください");
				String poke2 = stdIn.next();
				
				int keep1 = 0;
				int keep2 = 0;
				for (int i = 0; i < t1.myPockes.length; i++) {
					if (t1.myPockes[i] != null) {
						if (poke1.equals(t1.myPockes[i].name)) {
							keep1 = i;
						} else if (poke2.equals(t1.myPockes[i].name)) {
							keep2 = i;
						}
					}
				}
				
				Battle vs = new Battle();
				String result = vs.doBattle(t1.myPockes[keep1], t1.myPockes[keep2]);
				System.out.println("バトル結果：" + result);
				
			} else if (menu == 99) {
				count = count + 9999;
			} else {
				System.out.println("メニューに無い数値が入力されたため、強制終了します");
				count = count + 9999;
			}
		}
		
		System.out.println("終了しました");

	}

}
