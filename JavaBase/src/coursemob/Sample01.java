package coursemob;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("総合演習2問目");
		System.out.println("数値を入力してください");
		int a = stdIn.nextInt();
		
		if(a == 0) {
			System.out.println("00000");
		} else {
			System.out.println("11111");
			
			
		}

	}

}
