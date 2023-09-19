package course40;

import java.util.Scanner;

public class Practice_if {

	public static void main(String[] args) {
		
		//①
		int number = 15;
		
		if (number > 10) {
			System.out.println("でっか！！！");
		}
		
		//②
		int age = 20;
		
		if (age >= 18) {
			System.out.println("大人っすね！");
		} else {
			System.out.println("キッズだね^^");
		}
		
		//③
		int score = 85;
		
		if (score >= 90) {
			System.out.println("Excellent");
		} else if (score >= 80 && score < 90) {
			System.out.println("good");
		} else {
			System.out.println("勉強しましょう。");
		}
		
		//④
		boolean isRaining = true;
		
		if (isRaining) {
			System.out.println("傘をもってけーーー");
		} else {
			System.out.println("良い1日を！");
		}
		
		//⑤
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("偶数でっせ");
		} else {
			System.out.println("奇数だよ");
		}
	}

}
