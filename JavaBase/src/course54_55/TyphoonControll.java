package course54_55;

import java.util.Scanner;

public class TyphoonControll {

	public static void main(String[] args) {

		Typhoon typhoon1 = new Typhoon(1, "2022.4.8", "マラカス");
		Typhoon typhoon2 = new Typhoon(2, "2022.4.10", "メーギー");
		Typhoon typhoon3 = new Typhoon(3, "2022.6.30", "チャバ");
		Typhoon typhoon4 = new Typhoon(4, "2022.7.1", "アイレー");
		Typhoon typhoon5 = new Typhoon(5, "2022.7.28", "ソングダー");
		Typhoon typhoon6 = new Typhoon(6, "2022.7.31", "トローセス");
		Typhoon typhoon7 = new Typhoon(7, "2022.8.9", "ムーラン");
		Typhoon typhoon8 = new Typhoon(8, "2022.8.12", "メアリー");
		Typhoon typhoon9 = new Typhoon(9, "2022.8.22", "マーゴン");

		Typhoon[] typhoonList = { typhoon1, typhoon2, typhoon3, typhoon4,
				typhoon5, typhoon6, typhoon7, typhoon8, typhoon9 };

		Scanner stdIn = new Scanner(System.in);

		System.out.println("モード選択");
		System.out.println("0：台風一覧  99：編集モード 55：新規追加モード");

		int mode = stdIn.nextInt();

		if (mode == 0) {

			for (int i = 0; i < typhoonList.length; i++) {
				System.out.println(typhoonList[i].getAsiaName());
			}

		} else if (mode == 99) {
			System.out.println("台風番号を指定してください");
			for (int i = 0; i < typhoonList.length; i++) {
				System.out.println(typhoonList[i].getTyphoonbango() + "." + typhoonList[i].getAsiaName());
			}

			int typhoonnum = stdIn.nextInt();

			System.out.println("台風名を変更してください");
			String typhoonname = stdIn.next();
			for (int i = 0; i < typhoonList.length; i++) {
				typhoonList[typhoonnum - 1].setAsiaName(typhoonname);
			}
			System.out.println("変更出来ました");
			for (int i = 0; i < typhoonList.length; i++) {
				System.out.println(typhoonList[i].getAsiaName());
			}

		} else if (mode == 55) {
			System.out.println("台風情報の新規追加をします");

			System.out.println("台風番号を入力してください");
			int typhoonbango = stdIn.nextInt();

			System.out.println("台風の発生日を入力してください");
			String hasseibi = stdIn.next();

			System.out.println("台風名を入力してください");
			String asiaName = stdIn.next();
			

		}

	}
}
