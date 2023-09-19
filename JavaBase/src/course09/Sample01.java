package course09;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int num = stdIn.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("1ですね？");
			break;
		case 2:
			System.out.println("2ですね？");
			break;
		case 10:
			System.out.println("10ですね？");
			break;
		default:
			System.out.println("該当せず");
		}

	}

}
