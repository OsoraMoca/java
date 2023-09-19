package course24;

public class Practice02 {

	public static void main(String[] args) {
		//①
		int a = 30;
		bai(a);
		
		//②
		String b = "引数だよー";
		moji(b);
		
		//③
		int c = 50;
		int d = 40;
		niko(c , d);
		
		//④
		int tensu = 100;
		calledMethod(tensu);
	}
	
	//①
	static void bai(int x) {
		System.out.println(x * 2);
	}
	
	//②
	static void moji(String y) {
		System.out.println(y);
	}
	
	//③
	static void niko(int xx , int yy) {
		System.out.println(xx + yy);
	}
	
	//④
	static void calledMethod(int tensu) {
		System.out.println("引数で受け取った値は" + tensu + "です。");
	}

}
