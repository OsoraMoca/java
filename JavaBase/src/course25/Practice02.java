package course25;

public class Practice02 {

	public static void main(String[] args) {
		
		//①
		int a = modoriOne(134);
		
		System.out.println(a);
		
		//②
		String b = modoriTwo("戻り値！");
		
		System.out.println(b);
		
		//③
		int z = modoPraThree(333, 555);
		
		System.out.println(z);

	}
	
	//①
	static int modoriOne(int x) {
		
		int num = x;
		
		num = x + 100;
		
		return num;
	}
	
	//②
	static String modoriTwo(String y) {
		
		String moji = y;
		
		moji = y + "を受け取りました";
		
		return moji;
	}
	
	//③
	static int modoPraThree(int x, int y) {
		
		int sum = x + y;
		
		return sum;
	}

}
