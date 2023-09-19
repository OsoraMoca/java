package course15;

import java.util.Random;
import java.util.Scanner;

public class Pea1 {

	public static void main(String[] args) {

		int money1 = 10000;

		System.out.println("現在の所持金は" + money1 + "ペリカです");

		Scanner stdIn = new Scanner(System.in);

		while (money1 > 0 && money1 < 50000) {

			System.out.println("掛け金を入力してください");
			int money2 = stdIn.nextInt();

			if (money1 < money2)
				money2 = money1;

			money1 = money1 - money2;
			
			System.out.println("掛け金は" + money2 + "ペリカです");

			Random rnd = new Random();

			int dice1 = rnd.nextInt(7) + 1;
			System.out.print(dice1 + ",");

			int dice2 = rnd.nextInt(7) + 1;
			System.out.print(dice2 + ",");

			int dice3 = rnd.nextInt(7) + 1;
			System.out.print(dice3);
			System.out.println();

			String deme = "" + dice1 + dice2 + dice3;

			switch (deme) {
			//ピンゾロ
			case "111":
				System.out.println("ピンゾロ");
				int money3 = money2 * 5;
				money1 = money1 + money3;
				System.out.println("現在の所持金は" + money1 + "ペリカです");
				break;
			//ゾロ目    
			case "222":
			case "333":
			case "444":
			case "555":
			case "666":
				System.out.println("ゾロ目");
				money3 = money2 * 3;
				money1 = money1 + money3;
				System.out.println("現在の所持金は" + money1 + "ペリカです");
				break;
			//シゴロ	
			case "456":
			case "465":	
			case "564":
			case "546":	
			case "645":
			case "654":
				System.out.println("シゴロ");
				money3 = money2 * 2;
				money1 = money1 + money3;
				System.out.println("現在の所持金は" + money1 + "ペリカです");
				break;
			//ションベン	
			case "771":
			case "772":
			case "773":
			case "774":
			case "775":
			case "776":	
			case "177":
			case "277":
			case "377":
			case "477":
			case "577":
			case "677":	
			case "717":
			case "727":
			case "737":
			case "747":
			case "757":
			case "767":	
				System.out.println("ションベン");
				System.out.println("現在の所持金は" + money1 + "ペリカです");
				break;
			//ヒフミ	
			case "123":
			case "231":
			case "312":
			case "321":
				System.out.println("ヒフミ");
				money1 = money1 - money2;
				System.out.println("現在の所持金は" + money1 + "ペリカです");
				break;
			//通常の目	
			//出目1	
			case "221":
			case "331":
			case "441":
			case "551":
			case "661":
			case "122":
			case "133":
			case "144":
			case "155":
			case "166":
			case "212":
			case "313":
			case "414":
			case "515":
			case "616":
				System.out.println("出目1");
				money1 = money1 + money2;
				System.out.println("現在の所持金は" + money1 + "ペリカです");
				break;
			//出目2	
			case "112":
			case "332":
			case "442":
			case "552":
			case "662":
			case "211":
			case "233":
			case "244":
			case "255":
			case "266":
			case "121":
			case "323":
			case "424":
			case "525":
			case "626":
				System.out.println("出目2");
				money1 = money1 + money2;
				System.out.println("現在の所持金は" + money1 + "ペリカです");
				break;
			//出目3	
			case "223":
			case "113":
			case "443":
			case "553":
			case "663":
			case "322":
			case "311":
			case "344":
			case "355":
			case "366":
			case "232":
			case "131":
			case "434":
			case "535":
			case "636":
				System.out.println("出目3");
				money1 = money1 + money2;
				System.out.println("現在の所持金は" + money1 + "ペリカです");
				break;
			//出目4	
			case "224":
			case "334":
			case "114":
			case "554":
			case "664":
			case "422":
			case "433":
			case "411":
			case "455":
			case "466":
			case "242":
			case "343":
			case "141":
			case "545":
			case "646":
				System.out.println("出目4");
				money1 = money1 + money2;
				System.out.println("現在の所持金は" + money1 + "ペリカです");
				break;
			//出目5	
			case "225":
			case "335":
			case "445":
			case "115":
			case "665":
			case "522":
			case "533":
			case "544":
			case "511":
			case "566":
			case "252":
			case "353":
			case "454":
			case "151":
			case "656":
				System.out.println("出目5");
				money1 = money1 + money2;
				System.out.println("現在の所持金は" + money1 + "ペリカです");
				break;
			//出目6	
			case "226":
			case "336":
			case "446":
			case "556":
			case "116":
			case "622":
			case "633":
			case "644":
			case "655":
			case "611":
			case "262":
			case "363":
			case "464":
			case "565":
			case "161":
				System.out.println("出目6");
				money1 = money1 + money2;
				System.out.println("現在の所持金は" + money1 + "ペリカです");
				break;
			default:
				System.out.println("目なし");
				System.out.println("現在の所持金は" + money1 + "ペリカです");
			}

		}

		if (money1 >= 50000) {
			System.out.println("お前勝ち");
		} else if (money1 <= 0) {
			System.out.println("1050年地下行き！");

		}
	}

}