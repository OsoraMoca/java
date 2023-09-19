package course29;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		
		Character me = new Character();

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("プレイヤー１の名前は？");
		me.name = stdIn.next();
		
		System.out.println("HPは？");
		me.hp = stdIn.nextInt();
		
		System.out.println("攻撃力は？");
		me.str = stdIn.nextInt();
		
		System.out.println("防御力は？");
		me.dex = stdIn.nextInt();
		
		System.out.println("命中率は？");
		me.agi = stdIn.nextInt();
		
		System.out.println("回避率は？");
		me.def = stdIn.nextInt();
		
		me.viewStatus();
		
		Character tonari = new Character();
		
		System.out.println("プレイヤー２の名前は？");
		tonari.name = stdIn.next();
		
		System.out.println("HPは？");
		tonari.hp = stdIn.nextInt();
		
		System.out.println("攻撃力は？");
		tonari.str = stdIn.nextInt();
		
		System.out.println("防御力は？");
		tonari.dex = stdIn.nextInt();
		
		System.out.println("命中率は？");
		tonari.agi = stdIn.nextInt();
		
		System.out.println("回避率は？");
		tonari.def = stdIn.nextInt();
		
		tonari.viewStatus();
		
		me.battle(me, tonari);
		
	}
}
