package course09;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		
		System.out.println("君何月生まれなん？");
		Scanner stdIn = new Scanner(System.in);
		int month = stdIn.nextInt();
		
		switch(month) {
		case 1:
		case 2:
		case 3:	
			System.out.println("大吉だお。ラッキー");
			break;
		case 4:
		case 5:
		case 6:	
			System.out.println("中吉だお。やったね");
			break;
		case 7:
		case 8:
		case 9:	
			System.out.println("小吉だお。まぁいいんじゃね？");
			break;
		case 10:
		case 11:
		case 12:	
			System.out.println("大凶だお。ドンマイで草");
			break;	
		default:
			System.out.println("お前何なん？");	
		}

	}

}
