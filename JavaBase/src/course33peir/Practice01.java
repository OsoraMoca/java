package course33peir;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		
		//①
		String moji = "私はJavaを勉強中です";
		System.out.println(moji);
		
		//②
		Scanner stdIn = new Scanner(System.in);
		
		String a = stdIn.next();
		System.out.println(a);
		
		//③
		int i = stdIn.nextInt();
		if (i >= 50) {
			System.out.println("50以上です。");
		} else {
			System.out.println("49以下です。");
		}
		
		//④
		int x = stdIn.nextInt();
		int[] variable = new int [x];
		
		int xx = stdIn.nextInt();
		int yy = stdIn.nextInt();
		
		if (xx > yy) {
			System.out.println("xがでかい！");
		} else if (xx == yy) {
			System.out.println("おなじ！");
		} else {
			System.out.println("yがでかい！");
		}
		

	}

}
