package course22;

import java.util.Arrays;

public class Sample01 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		arr[2][0] = 70;
		arr[2][1] = 80;
		arr[2][2] = 90;
		
		System.out.println(arr[1][0]);
		
		//サンプル問題①
		System.out.println(arr[1][2]);
		
		//サンプル問題②
		if (arr[2][0] > 50) {
			System.out.println("大きいです");
		}
		
		//サンプル問題③
		System.out.println(arr[1][1] + arr[2][2]);
		
		//サンプル問題④
	    System.out.println(Arrays.deepToString(arr));
	    
	}

}
