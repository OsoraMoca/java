package course21;

import java.util.Scanner;

public class ArrQuestion {

	public static void main(String[] args) {

		int[] typhoon = { 1, 1, 0, 0, 0, 1, 4, 5, 6, 4, 6, 1 };

		//①
		/*
		System.out.println("7月の台風は" + typhoon[6] + "件です。");
		*/

		//②
		/*
		for (int i = 0; i < typhoon.length; i++) {
			System.out.println((i + 1) + "月の台風は" + typhoon[i] + "件です。");
		}
		*/

		//③
		int[] quake = { 153, 127, 130, 109, 118, 164, 130, 103, 103, 104, 123, 141 };

		int[] rain = { 20, 58, 107, 87, 114, 187, 200, 59, 169, 441, 158, 94 };

		Scanner stdIn = new Scanner(System.in);

		System.out.println("見たい情報を選んでください。");
		System.out.println("1：台風件数 2：地震件数 3：降水量 4：全て");
		int a = stdIn.nextInt();

		System.out.println("年別か月別かを選んでください。");
		System.out.println("1：年別 2：月別 3：年別(大きい順に表示)");
		int b = stdIn.nextInt();

		//年別
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;

		for (int tSum = 0; tSum < typhoon.length; tSum++) {
			sum = sum + typhoon[tSum];
		}
		for (int qSum = 0; qSum < quake.length; qSum++) {
			sum2 = sum2 + quake[qSum];
		}
		for (int rSum = 0; rSum < rain.length; rSum++) {
			sum3 = sum3 + rain[rSum];
		}

		if (a == 1 && b == 1) {
			System.out.println("2019年に起こった台風の件数は" + sum + "件です。");
		} else if (a == 2 && b == 1) {
			System.out.println("2019年に起こった地震の件数は" + sum2 + "件です。");
		} else if (a == 3 && b == 1) {
			System.out.println("2019年の降水量の合計は" + sum3 + "mmです。");
		} else if (a == 4 && b == 1) {
			System.out.println("2019年に起こった台風の件数は" + sum + "件です。");
			System.out.println("2019年に起こった地震の件数は" + sum2 + "件です。");
			System.out.println("2019年の降水量の合計は" + sum3 + "mmです。");
		}

		//月別
		if (a == 1 && b == 2) {
			System.out.println("見たい月を入力してください。");
			int c = stdIn.nextInt();
			System.out.print(c + "月の台風の件数は");
			c = c - 1;
			System.out.println(typhoon[c] + "件です。");
		} else if (a == 2 && b == 2) {
			System.out.println("見たい月を入力してください。");
			int c = stdIn.nextInt();
			System.out.print(c + "月の地震の件数は");
			c = c - 1;
			System.out.println(quake[c] + "件です。");
		} else if (a == 3 && b == 2) {
			System.out.println("見たい月を入力してください。");
			int c = stdIn.nextInt();
			System.out.print(c + "月の降水量は");
			c = c - 1;
			System.out.println(rain[c] + "mmです。");
		} else if (a == 4 && b == 2) {
			System.out.println("見たい月を入力してください。");
			int c = stdIn.nextInt();
			System.out.print(c + "月の台風の件数は");
			c = c - 1;
			System.out.println(typhoon[c] + "件です。");
			c = c + 1;
			System.out.print(c + "月の地震の件数は");
			c = c - 1;
			System.out.println(quake[c] + "件です。");
			c = c + 1;
			System.out.print(c + "月の降水量は");
			c = c - 1;
			System.out.println(rain[c] + "mmです。");
		}

		int save = 0;
		if (b == 3 && a == 1) {
			for (int i = 11; i >= 0; i--) {
				for (int j = 0; j < i; j++) {
					if (typhoon[j] < typhoon[j + 1]) {
						save = typhoon[j + 1];
						typhoon[j + 1] = typhoon[j];
						typhoon[j] = save;
					}
				}
			}
			for (int r1 : typhoon) {
				System.out.println(r1);
			}
		}
	}
}