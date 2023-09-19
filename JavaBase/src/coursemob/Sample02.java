package coursemob;

import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("数値を入力してください");
		int a = stdIn.nextInt();
		
		int b = a % 3;
		int c = a % 5;
		int d = a % 15;
		
		if(c == 0 && b == 0) {
			System.out.println("Fizz&Buzz");
		}
		if(c != 0 && b == 0) {
			System.out.println("Fizz");
		}
		if(c == 0 && b != 0) {
			System.out.println("Buzz");
		}

	}

}
