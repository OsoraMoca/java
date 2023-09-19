package course47;

public class Practice {

	public static void main(String[] args) {

		try {
			//練習問題①
			int[] array = { 1, 2, 3 };
			//                 ↓ループ４週目いっちゃうから=いらん
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}

			//練習問題②
			//           ↓0で割ってる
			int number = 5;
			if (10 / number == 2) {
				System.out.println("numberは5です。");
			}

			//練習問題③
			//            ↓②と一緒
			int number2 = 5;
			if (100 / number2 == 20) {
				System.out.println("numberは5です。");
			}

			//練習問題④
			//                              ↓②③と一緒！！0じゃ割れん！！
			int result = divideNumbers(10, 5);
			System.out.println(result);

		} catch (Exception e) {
			System.out.println("こんなエラーがでたよ");
			System.out.println(e);
			//↓どこで何行目でなんのエラーが起きたか出してくれる
			e.printStackTrace();
		}
	}

	public static int divideNumbers(int a, int b) {
		return a / b;
	}

}
