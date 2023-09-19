package course57;

import java.util.Random;
import java.util.Scanner;

public class PlayControll {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();

		Player me = new Player();
		Target koku = new Target();

		System.out.println("ときめきコクリアル");
		System.out.println("モード選択");
		System.out.println("0：通常モード 99：デバッグモード");
		int mode = stdIn.nextInt();
		if (mode != 0) {
			System.out.println("各パラメータを設定してください");
			System.out.println("筋力");
			int me_kinryoku = stdIn.nextInt();
			System.out.println("学力");
			int me_gakuryoku = stdIn.nextInt();
			System.out.println("見た目");
			int me_mitame = stdIn.nextInt();
			System.out.println("面白さ");
			int me_omosiro = stdIn.nextInt();
			System.out.println("相手の筋力");
			int koku_kinryoku = stdIn.nextInt();
			System.out.println("相手の学力");
			int koku_gakuryoku = stdIn.nextInt();
			System.out.println("相手の見た目");
			int koku_mitame = stdIn.nextInt();
			System.out.println("相手の面白さ");
			int koku_Oomosiro = stdIn.nextInt();
			
			battle(me_kinryoku, me_gakuryoku, me_mitame, me_omosiro, koku_kinryoku, koku_gakuryoku, koku_mitame, koku_Oomosiro);

		} else {

			me.setKinryoku(rnd.nextInt(5) + 1);
			me.setGakuryoku(rnd.nextInt(5) + 1);
			me.setMitame(rnd.nextInt(5) + 1);
			me.setOmosiro(rnd.nextInt(5) + 1);

			int kinryoku = me.getKinryoku();
			int gakuryoku = me.getGakuryoku();
			int mitame = me.getMitame();
			int omosiro = me.getOmosiro();

			koku.setHituyouKin(rnd.nextInt(11) + 3);
			koku.setHituyouGaku(rnd.nextInt(11) + 3);
			koku.setHituyouMita(rnd.nextInt(11) + 3);
			koku.setHituyouOmo(rnd.nextInt(11) + 3);
			

			for (int i = 1; i <= 7; i++) {

				System.out.println("現在の自分のパラメータ");
				System.out.println("筋力：" + kinryoku);
				System.out.println("学力：" + gakuryoku);
				System.out.println("見た目：" + mitame);
				System.out.println("面白さ：" + omosiro);

				System.out.println("トレーニングメニュー");
				System.out.println(i + "回目のトレーニング");
				System.out.println("1：筋トレ 2：勉強 3：整形 4：人と喋る");

				int sentaku = stdIn.nextInt();
				while (sentaku < 1 || sentaku > 4) {
					System.out.println("1～4を入力してください。");
					sentaku = stdIn.nextInt();
				}
				if (sentaku == 1) {
					kinryoku++;
				} else if (sentaku == 2) {
					gakuryoku++;
				} else if (sentaku == 3) {
					mitame++;
				} else if (sentaku == 4) {
					omosiro++;
				}

				System.out.println("告白成功に必要なパラメータをランダムで表示します");

				int kokurnd = rnd.nextInt(4);
				if (kokurnd == 0) {
					System.out.println("筋力：" + koku.getHituyouKin());
				} else if (kokurnd == 1) {
					System.out.println("学力：" + koku.getHituyouGaku());
				} else if (kokurnd == 2) {
					System.out.println("見た目：" + koku.getHituyouMita());
				} else if (kokurnd == 3) {
					System.out.println("面白さ：" + koku.getHituyouOmo());
				}

			}
			
			battle(kinryoku, gakuryoku, mitame, omosiro, koku.getHituyouKin(), koku.getHituyouGaku(), koku.getHituyouMita(), koku.getHituyouOmo());
		}
	}

	static void battle (int kin, int gaku, int mita, int omo, int kokukin, int kokugaku, int kokumita, int kokuomo)	{
		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.println("告白をします。どの能力で勝負しますか？");
		System.out.println("1：筋力 2：学力 3：見た目 4：面白さ");

		int battle = stdIn.nextInt();
		while (battle < 1 || battle > 4) {
			System.out.println("1～4を入力してください。");
			battle = stdIn.nextInt();
		}

		if (battle == 1) {
			System.out.println("自分の筋力：" + kin);
			System.out.println("相手の筋力：" + kokukin);
			if (kin >= kokukin) {
				System.out.println("筋力は上回っている");
				System.out.println("ランダム勝負");
				int mernd = rnd.nextInt(3);
				if (mernd == 0) {
					System.out.println("自分の学力：" + gaku);
					System.out.println("相手の学力：" + kokugaku);
					if (gaku >= kokugaku) {
						System.out.println("学力は上回っている");
						System.out.println("告白成功");
					} else {
						System.out.println("学力は下回っている");
						System.out.println("告白失敗");
						System.out.println("あなたは死亡しました");
					}
				} else if (mernd == 1) {
					System.out.println("自分の見た目：" + mita);
					System.out.println("相手の見た目：" + kokumita);
					if (mita >= kokumita) {
						System.out.println("見た目は上回っている");
						System.out.println("告白成功");
					} else {
						System.out.println("見た目は下回っている");
						System.out.println("告白失敗");
						System.out.println("あなたは死亡しました");
					}
				} else if (mernd == 2) {
					System.out.println("自分の面白さ：" + omo);
					System.out.println("相手の面白さ：" + kokuomo);
					if (omo >= kokuomo) {
						System.out.println("面白さは上回っている");
						System.out.println("告白成功");
					} else {
						System.out.println("面白さは下回っている");
						System.out.println("告白失敗");
						System.out.println("あなたは死亡しました");
					}
				}
			} else {
				System.out.println("筋力は下回っている");
				System.out.println("告白失敗");
				System.out.println("あなたは死亡しました");
			}

		} else if (battle == 2) {
			System.out.println("自分の学力：" + gaku);
			System.out.println("相手の学力：" + kokugaku);
			if (gaku >= kokugaku) {
				System.out.println("学力は上回っている");
				System.out.println("ランダム勝負");
				int mernd = rnd.nextInt(3);
				if (mernd == 0) {
					System.out.println("自分の筋力：" + kin);
					System.out.println("相手の筋力：" + kokukin);
					if (kin >= kokukin) {
						System.out.println("筋力は上回っている");
						System.out.println("告白成功");
					} else {
						System.out.println("筋力は下回っている");
						System.out.println("告白失敗");
						System.out.println("あなたは死亡しました");
					}
				} else if (mernd == 1) {
					System.out.println("自分の見た目：" + mita);
					System.out.println("相手の見た目：" + kokumita);
					if (mita >= kokumita) {
						System.out.println("見た目は上回っている");
						System.out.println("告白成功");
					} else {
						System.out.println("見た目は下回っている");
						System.out.println("告白失敗");
						System.out.println("あなたは死亡しました");
					}
				} else if (mernd == 2) {
					System.out.println("自分の面白さ：" + omo);
					System.out.println("相手の面白さ：" + kokuomo);
					if (omo >= kokuomo) {
						System.out.println("面白さは上回っている");
						System.out.println("告白成功");
					} else {
						System.out.println("面白さは下回っている");
						System.out.println("告白失敗");
						System.out.println("あなたは死亡しました");
					}
				}
			} else {
				System.out.println("学力は下回っている");
				System.out.println("告白失敗");
				System.out.println("あなたは死亡しました");
			}

		} else if (battle == 3) {
			System.out.println("自分の見た目：" + mita);
			System.out.println("相手の見た目：" + kokumita);
			if (mita >= kokumita) {
				System.out.println("見た目は上回っている");
				System.out.println("ランダム勝負");
				int mernd = rnd.nextInt(3);
				if (mernd == 0) {
					System.out.println("自分の筋力：" + kin);
					System.out.println("相手の筋力：" + kokukin);
					if (kin >= kokukin) {
						System.out.println("筋力は上回っている");
						System.out.println("告白成功");
					} else {
						System.out.println("筋力は下回っている");
						System.out.println("告白失敗");
						System.out.println("あなたは死亡しました");
					}
				} else if (mernd == 1) {
					System.out.println("自分の学力：" + gaku);
					System.out.println("相手の学力：" + kokugaku);
					if (gaku >= kokugaku) {
						System.out.println("学力は上回っている");
						System.out.println("告白成功");
					} else {
						System.out.println("学力は下回っている");
						System.out.println("告白失敗");
						System.out.println("あなたは死亡しました");
					}
				} else if (mernd == 2) {
					System.out.println("自分の面白さ：" + omo);
					System.out.println("相手の面白さ：" + kokuomo);
					if (omo >= kokuomo) {
						System.out.println("面白さは上回っている");
						System.out.println("告白成功");
					} else {
						System.out.println("面白さは下回っている");
						System.out.println("告白失敗");
						System.out.println("あなたは死亡しました");
					}
				}
			} else {
				System.out.println("見た目は下回っている");
				System.out.println("告白失敗");
				System.out.println("あなたは死亡しました");
			}

		} else if (battle == 4) {
			System.out.println("自分の面白さ：" + omo);
			System.out.println("相手の面白さ：" + kokuomo);
			if (omo >= kokuomo) {
				System.out.println("面白さは上回っている");
				System.out.println("ランダム勝負");
				int mernd = rnd.nextInt(3);
				if (mernd == 0) {
					System.out.println("自分の筋力：" + kin);
					System.out.println("相手の筋力：" + kokukin);
					if (kin >= kokukin) {
						System.out.println("筋力は上回っている");
						System.out.println("告白成功");
					} else {
						System.out.println("筋力は下回っている");
						System.out.println("告白失敗");
						System.out.println("あなたは死亡しました");
					}
				} else if (mernd == 1) {
					System.out.println("自分の学力：" + gaku);
					System.out.println("相手の学力：" + kokugaku);
					if (gaku >= kokugaku) {
						System.out.println("学力は上回っている");
						System.out.println("告白成功");
					} else {
						System.out.println("学力は下回っている");
						System.out.println("告白失敗");
						System.out.println("あなたは死亡しました");
					}
				} else if (mernd == 2) {
					System.out.println("自分の見た目：" + mita);
					System.out.println("相手の見た目：" + kokumita);
					if (mita >= kokumita) {
						System.out.println("見た目は上回っている");
						System.out.println("告白成功");
					} else {
						System.out.println("見た目は下回っている");
						System.out.println("告白失敗");
						System.out.println("あなたは死亡しました");
					}
				}
			} else {
				System.out.println("面白さは下回っている");
				System.out.println("告白失敗");
				System.out.println("あなたは死亡しました");
			}
		}

	}

}
