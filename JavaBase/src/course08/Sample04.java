package course08;

import java.util.Scanner;

public class Sample04 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("おめぇ何が好きなん？");
		String like = stdIn.next();
		
		//String a = "野菜";
		
		//switch文鉄板構文
		switch(like) {
		case "魚":
			System.out.println("おめぇ魚が好きなんか。");
			//以降の判定を全スキップ
			break;
		case "肉":
			System.out.println("おめぇ肉が好きなんか。");
			break;
		//どれにも該当しない場合	
		default:
			System.out.println("おめぇ野菜が好きなんか。");
		}

	}

}
