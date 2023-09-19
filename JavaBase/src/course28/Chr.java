package course28;

public class Chr {
	
	static int attck;
	static int def;
	static int spd;
	static int love;
	static int mp;
	static int hp;
	
	static void naguru(int naguruattck, int naguraredef) {
		System.out.println((naguruattck - naguraredef) + "のダメージを与えた");
	}
	
	static void mamoru() {
		System.out.println("守りをかためて防御が" + (def * 2) + "になった。");
	}
	
}
