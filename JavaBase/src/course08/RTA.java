package course08;

import java.util.Scanner;

public class RTA {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("何月？");
		/*
		int a = stdIn.nextInt();
		
		if(a == 1) {
			System.out.println("1月は31日まで");
		}
		if(a == 2) {
			System.out.println("2月は28日まで");
		}
		if(a == 3) {
			System.out.println("3月は31日まで");
		}
		if(a == 4) {
			System.out.println("4月は30日まで");
		}
		if(a == 5) {
			System.out.println("5月は31日まで");
		}
		if(a == 6) {
			System.out.println("6月は30日まで");
		}
		if(a == 7) {
			System.out.println("7月は31日まで");
		}
		if(a == 8) {
			System.out.println("8月は31日まで");
		}
		if(a == 9) {
			System.out.println("9月は30日まで");
		}
		if(a == 10) {
			System.out.println("10月は31日まで");
		}
		if(a == 11) {
			System.out.println("11月は30日まで");
		}
		if(a == 12) {
			System.out.println("12月は31日まで");
		}
		*/
		
		int month = stdIn.nextInt();
		switch(month) {
		case 1:
			System.out.println("1月は31日まで");
			break;
		case 2:
			System.out.println("2月は28日まで");
			break;
		case 3:
			System.out.println("3月は31日まで");
			break;
		case 4:
			System.out.println("4月は30日まで");
			break;
		case 5:
			System.out.println("5月は31日まで");
			break;
		case 6:
			System.out.println("6月は30日まで");
			break;
		case 7:
			System.out.println("7月は31日まで");
			break;
		case 8:
			System.out.println("8月は31日まで");
			break;
		case 9:
			System.out.println("9月は30日まで");
			break;
		case 10:
			System.out.println("10月は31日まで");
			break;
		case 11:
			System.out.println("11月は30日まで");
			break;
		case 12:
			System.out.println("12月は31日まで");
			break;
		}
			

	}

}
