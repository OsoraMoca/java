package course06;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("数値を入力");
		
		int num = stdIn.nextInt();
		
		if(num >= 10) {
			System.out.println("10以上");
		} else {
			System.out.println("小さい");
		}

	}

}
