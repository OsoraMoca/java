package pocketon;

public class Battle {

	String winner;

	String doBattle(Pocketon poke1, Pocketon poke2) {
		
		//先にタイプ相性の計算
		//火→草の場合、火のpowerを倍にする
		if (poke1.type.equals("火") && poke2.type.equals("草")) {
			poke1.power = poke1.power * 2;
		//火←草の場合、草のpowerを倍にする	
		} else if (poke2.type.equals("火") && poke1.type.equals("草")) {
			poke2.power = poke2.power * 2;
		}

		//草→地面の場合、草のpowerを倍にする
		if (poke1.type.equals("草") && poke2.type.equals("地面")) {
			poke1.power = poke1.power * 2;
		//草←地面の場合、地面のpowerを倍にする	
		} else if (poke2.type.equals("草") && poke1.type.equals("地面")) {
			poke2.power = poke2.power * 2;
		}

		//地面→水の場合、地面のpowerを倍にする
		if (poke1.type.equals("地面") && poke2.type.equals("水")) {
			poke1.power = poke1.power * 2;
		//地面←水の場合、水のpowerを倍にする	
		} else if (poke2.type.equals("地面") && poke1.type.equals("水")) {
			poke2.power = poke2.power * 2;
		}
		
		//水→火の場合、水のpowerを倍にする
		if (poke1.type.equals("水") && poke2.type.equals("火")) {
			poke1.power = poke1.power * 2;					
		//水←火の場合、火のpowerを倍にする	
		} else if (poke2.type.equals("水") && poke1.type.equals("火")) {
			poke2.power = poke2.power * 2;
		}
		
		//勝敗の判定
		if (poke1.power > poke2.power) {
			winner = poke1.name + "の勝利！";
			return winner;
		} else if (poke1.power < poke2.power) {
			winner = poke2.name + "の勝利！";
			return winner;
		} else {
			winner = "引き分け！";
			return winner;
		}

	}

}