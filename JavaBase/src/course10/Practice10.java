package course10;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("いつ予約？");
		String a = stdIn.next();
		
		switch(a) {
		case "月曜午前":
		case "月曜午後":	
		case "月曜夜間":
		case "火曜午後":
		case "火曜夜間":	
		case "水曜午前":	
		case "水曜午後":	
		case "木曜午前":
		case "木曜午後":	
		case "木曜夜間":
		case "金曜午後":
		case "金曜夜間":
		case "土曜午前":
			System.out.println("予約できます");
			break;
		case "日曜午前":
		case "日曜午後":	
		case "日曜夜間":
		case "火曜午前":
		case "水曜夜間":	
		case "金曜午前":	
		case "土曜午後":	
		case "土曜夜間":		
			System.out.println("予約できません");
			break;
		default:
			System.out.println("ちゃんと打て");
		}
		
	}

}
