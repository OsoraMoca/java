package course_group;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		/**
		//座席用配列（重複あり）
		int[][] seki = new int[6][6];
		
		//振り分け用ランダム
		Random rnd = new Random();
		
		//座席縦列の繰り返し
		for (int i = 0; i < seki.length; i++) {
			//座席横列の繰り返し
			for (int j = 0; j < seki.length; j++) {
				//振り分け用ランダム
				seki[i][j] = rnd.nextInt(36) +1;
				//座席の表示
				System.out.print(" ");
				System.out.print(seki[i][j]);
				//見やすく表示する用if
				//番号が1桁なら2文字分の空白
				if (seki[i][j] < 10) {
					System.out.print("  ");
				//番号が2桁なら1文字分の空白	
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		**/

		/*
		//完全版
		//座席用配列
		int[][] seki = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29, 30 }, { 31, 32, 33, 34, 35, 36 } };

		Random rnd = new Random();

		//配列の中で何回も入れ替えをする(シャッフル)
		//ほぼ無限に回して確実に被らないようにするやつ
		for (int i = 0; i < 999; i++) {
			//入れ替え元の左の要素番号
			int a = rnd.nextInt(6);
			//入れ替え元の右の要素番号
			int b = rnd.nextInt(6);
			//入れ替え先の左の要素番号
			int c = rnd.nextInt(6);
			//入れ替え先の右の要素番号
			int d = rnd.nextInt(6);
			//セーブポイント用
			int save = 0;

			//入れ替え作業
			save = seki[a][b];
			seki[a][b] = seki[c][d];
			seki[c][d] = save;
		}
		
		System.out.println("ランダムで席替えを行いました。");
		System.out.println("現在の座席");

		//6回分回して座席を6×6で表示させる
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(seki[i][j]);
				//見やすく表示する用if
				//番号が1桁なら2文字分の空白
				if (seki[i][j] < 10) {
					System.out.print("  ");
					//番号が2桁なら1文字分の空白	
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		Scanner stdIn = new Scanner(System.in);
		*/
		
		Scanner stdIn = new Scanner(System.in);

		//座席用配列
		int[][] seki = { { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
		
		//判定用配列
		int[] hantei = new int[36];
		
		//判定の初期
		int h = 0;

		//座席を表す数
		int zaseki = 1;

		//ループ回数
		int count = 0;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.println((zaseki++) + "番目の席の出席番号を入力してください。");
				count++;
				//出席番号
				int x = stdIn.nextInt();
				
				//入力した数値が1～36ではなかったら入力させなおす
				while (x < 1 || x > 36) {
					System.out.println("1～36までの数値を入力してください。");
					x = stdIn.nextInt();
				}
				
				//すでに番号が使用済みか確認する
				//hantei配列と入力した数値が重複しなかった数
				int a = 0;
				while (a != 36) {
					//aを初期化
					a = 0;
					
					//入力した数値がhantei配列の要素数まで
					for (int b = 0; b <= 35; b++) {
						//重複していないか判定する
						if (x != hantei[b]) {
							//重複していなければ1増やす
							a++;
						}
						
					}
					
					//数値が重複していない場合
					if (a == 36) {
						seki[i][j] = x;
						hantei[h] = x;
						h++;
					}
					//数値が重複している場合
					if (a != 36) {
						System.out.println("その番号は使用済みです。");
						System.out.println("もう一度入力してください。");
						x = stdIn.nextInt();
					}
					
					
				}			

			}
		}
		System.out.println("指定して席替えを行いました。");
		System.out.println("現在の座席");

		//6回分回して座席を6×6で表示させる
				for (int i = 0; i < 6; i++) {
					for (int j = 0; j < 6; j++) {
						System.out.print(seki[i][j]);
						//見やすく表示する用if
						//番号が1桁なら2文字分の空白
						if (seki[i][j] < 10) {
							System.out.print("  ");
						//番号が2桁なら1文字分の空白	
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}

		//ここからさかもと	
		//席の確認を調べるプログラム
		for (int i = 0; i <= 999; i++) {
			//この席でいいかの確認
			System.out.println("この座席で確定しますか？");
			System.out.println("1:確定 2:変更");

			//選択用変数
			int sentak = stdIn.nextInt();
			
			//sentakに1か2が入力されるまで繰り返す
			while (sentak < 1 || sentak > 2) {
				System.out.println("1か2を入力してください。");
				sentak = stdIn.nextInt();
			}

			if (sentak == 1) {
				//確定した場合すべての席を表示するプログラム
				System.out.println("座席が確定しました。");
				//6回分回して座席を6×6で表示させる
				for (int j = 0; j < 6; j++) {
					for (int k = 0; k < 6; k++) {
						System.out.print(seki[j][k]);
						//見やすく表示する用if
						//番号が1桁なら2文字分の空白
						if (seki[j][k] < 10) {
							System.out.print("  ");
							//番号が2桁なら1文字分の空白	
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;
			//case 2
			} else {
				//6回分回して座席を6×6で表示させる
				for (int j = 0; j < 6; j++) {
					for (int k = 0; k < 6; k++) {
						System.out.print(seki[j][k]);
						//見やすく表示する用if
						//番号が1桁なら2文字分の空白
						if (seki[j][k] < 10) {
							System.out.print("  ");
							//番号が2桁なら1文字分の空白	
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}

				//変更を選択した場合入れ替えたいところの指定を要求
				//入れ替え元の左の要素番号を指定
				System.out.println("入れ替え元の左の要素番号を入れてください。");
				int basyo1 = stdIn.nextInt();

				//入れ替え元の右の要素番号を指定
				System.out.println("入れ替え元の右の要素番号を入れてください。");
				int basyo2 = stdIn.nextInt();

				//入れ替え先の左の要素番号を指定
				System.out.println("入れ替え先の左の要素番号を入れてください。");
				int basaki1 = stdIn.nextInt();

				//入れ替え先の右の要素番号を指定
				System.out.println("入れ替え先の右の要素番号を入れてください。");
				int basaki2 = stdIn.nextInt();
				//指定した場所を入れ替える
				int save = seki[basaki1][basaki2];
				seki[basaki1][basaki2] = seki[basyo1][basyo2];
				seki[basyo1][basyo2] = save;
			}
			//変更した後の座席表示
			//6回分回して座席を6×6で表示させる
			System.out.println("入れ替えを行いました。");
			System.out.println("現在の座席");
			for (int j = 0; j < 6; j++) {
				for (int k = 0; k < 6; k++) {
					System.out.print(seki[j][k]);
					//見やすく表示する用if
					//番号が1桁なら2文字分の空白
					if (seki[j][k] < 10) {
						System.out.print("  ");
						//番号が2桁なら1文字分の空白	
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		//ここまでさかもと
	}
	}

