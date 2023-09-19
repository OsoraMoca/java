package season01;

import java.util.Scanner;

public class Akinator {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("きみが思い浮かべてる人を当てるお");
		
		System.out.println("性別は？ 1.男性 2.女性");
		int a = stdIn.nextInt();
		
	    System.out.println("職業は？ 1.営業職 2.エンジニア");
	    int b = stdIn.nextInt();
	    
	    System.out.println("魚は好き？ 嫌いなら肉は好き？1.魚が好き 2.魚は嫌いだが肉は好き 3.両方嫌い");
		int c = stdIn.nextInt();
		
		System.out.println("夏と冬どっちが好き？ 1.夏 2.冬");
		int d = stdIn.nextInt();
		
		System.out.println("犬と猫どっちが好き？ 1.犬 2.猫");
		int e = stdIn.nextInt();
		
		if(a == 1 && b == 1 && c == 3 && d == 2 && e == 2) {
			//男性で、営業職で、魚が嫌いで、夏より冬が好きで、猫派はAさん
			System.out.println("きみが思い浮かべてるのはAさんだお");
		} else if (a == 1 && b == 2 && c == 1 && d == 2 && e == 1) {
			//男性で、エンジニアで、魚が嫌いだけど肉は好きで、夏より冬が好きで、犬派はBさん
			System.out.println("きみが思い浮かべてるのはAさんだお");
		} else if (a == 1 && b == 1 && c == 2 && d == 2 && e == 2) {
			//男性で、営業職で、魚が好きで、夏より冬が好きで、猫派はCさん
			System.out.println("きみが思い浮かべてるのはAさんだお");
		} else if (a == 2 && b == 2 && c == 1 && d == 1 && e == 1) {
			//女性で、エンジニアで、魚が好きで、冬より夏が好きで、犬派はDさん
			System.out.println("きみが思い浮かべてるのはAさんだお");
		} else if (a == 2 && b == 2 && c == 1 && d == 1 && e == 2) {
			//女性で、エンジニアで、魚が好きで、冬より夏が好きで、猫派はEさん
			System.out.println("きみが思い浮かべてるのはAさんだお");
		} else if (a == 2 && b == 1 && c == 2 && d == 2 && e == 1) {
			//女性で、営業職で、魚が嫌いだけど肉は好きで、夏より冬が好きで、犬派はFさん
			System.out.println("きみが思い浮かべてるのはAさんだお");
		} else {
			System.out.println("ごめんそんな人おらんわ。");
		}
		
	}

}
