package course20;

public class Practice02 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (arr[i] > 29) {
				System.out.println(i + "番目の要素は30以上です");
			}
		}

	}

}
