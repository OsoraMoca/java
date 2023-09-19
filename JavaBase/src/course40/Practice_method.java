package course40;

public class Practice_method {

	public static void main(String[] args) {
		
		//①
		printHello();
		
		//②
		multiply(2 , 5);
		
		//③
		int a = multiplymodori(2 , 5);
		System.out.println(a);
		
		//④
		boolean tf = isEven(2);
		System.out.println(tf);
		
		//⑤
		String moji = getGreeting("おれ");
		System.out.println(moji);

	}
	
	//①
	static void printHello() {
		System.out.println("Hello, World!");
	}
	
	//②
	static void multiply(int a , int b) {
		int sum = a * b;
		System.out.println(sum);
	}
	
	//③
	static int multiplymodori(int a , int b) {
		int sum = a * b;
		return sum;
	}
	
	//④
	static boolean isEven(int number) {
		boolean a;
		if (number % 2 == 0) {
			a = true;
		} else {
			a = false;
		}
		return a;
	}
	
	//⑤
	static String getGreeting(String name) {
		String moji = "こんにちは" + name;
		return moji;
	}

}
