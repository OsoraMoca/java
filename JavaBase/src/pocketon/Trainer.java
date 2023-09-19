package pocketon;

import java.util.Random;

public class Trainer {

	String name;
	Pocketon[] myPockes;
	
	Trainer() {
		name = "初期";
		myPockes = new Pocketon[6];
	}
	
	void capture(Pocketon pocke) {
		Random rnd = new Random();
		int random = rnd.nextInt(10);
		if (pocke.difficult < random) {
			System.out.println("捕獲失敗！次は頑張ろう！");
		} else {
			System.out.println("捕獲成功！やったね！");
			for (int i = 0; i < 6; i++) {
				if (myPockes[i] == null) {
					myPockes[i] = pocke;
					i = i + 100;
				}
			}
		}
		
	}
	
	void display() {
		System.out.println("現在の手持ちは以下の通りです");
		for (int i = 0; i < myPockes.length; i++) {
			if (myPockes[i] == null) {
				System.out.println("ポケトンなし");
			} else {
				System.out.println(myPockes[i].name);
			}
		}
	}
}
