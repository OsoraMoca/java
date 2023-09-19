package course41;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		//⑩
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		
		int[] variable = new int[x];
		
		//Ex
		int[] numExArr = { 10, 50, 30, 20, 40 };
		int save = numExArr[0];
		numExArr[0] = numExArr[4];
		save = numExArr[4];
		numExArr[4] = numExArr[3];
		save = numExArr[3];
		numExArr[3] = numExArr[2];
		save = numExArr[2];
		numExArr[2] = numExArr[1];
		save = numExArr[1];
		numExArr[1] = numExArr[0];
		
		for (int i = 0; i < numExArr.length; i++) {
			System.out.println(numExArr[i]);
		}
		
		//⑪
		mogi();
		
		//⑫
		int sum = calc(10 , 11);
		System.out.println(sum);
		
		//⑬
		String xx = mojicon("今のところ全問正解でしょ？");
		System.out.println(xx);

	}
	
	//⑪
	static void mogi() {
		System.out.println("メソッド問題");
	}
	
	//⑫
	static int calc(int a , int b) {
		return a + b;
	}
	
	//⑬
	static String mojicon(String moji) {
		String concated = moji + "を受け取りました";
		return concated;
	}

}
