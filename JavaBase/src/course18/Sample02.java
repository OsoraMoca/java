package course18;

public class Sample02 {

	public static void main(String[] args) {
		
		/**
		 * YESかNOを扱うboolean型もある
		 * YESをTrue、NOをFalseと言い表す
		 */
		boolean x = true;
		boolean y = false;
		
		//if文は括弧の中がTrueかどうかを判断する
		if (x) {
			System.out.println("Trueだよ");
		} else {
			System.out.println("Falseだよ");
		}
		
		//今までやってきた比較も最終的にはTrueかFalseでしかない
		int i = 30;
		boolean z = i > 15;
		if (z) {
			System.out.println("iは15よりも大きいです");
		} else {
			System.out.println("iは15以下です");
		}

	}

}
