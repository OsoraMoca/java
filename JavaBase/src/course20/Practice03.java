package course20;

public class Practice03 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		//合計
		System.out.println("合計は" + sum);
		
		//平均
		System.out.println("平均は" + sum / arr.length);

	}

}
