package course10;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("いつ予約？");
		String week = stdIn.next();
		
		switch(week) {
		case "月曜":
		case "水曜":
		case "木曜":	
		case "土曜":
			System.out.println("予約できます");
			break;
		case "火曜":
		case "金曜":
		case "日曜":
			System.out.println("予約できません");
			break;	
		default:
			System.out.println("ちゃんと打て");	
		}

	}

}
